package com.laptopShop.demoMVC.config;

import com.laptopShop.demoMVC.domain.User;
import com.laptopShop.demoMVC.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    private final UserService userService;

    public CustomSuccessHandler(UserService userService) {
        this.userService = userService;
    }

    protected String determineTargetUrl(final Authentication authentication) {
        Map<String, String> roleTargetUrlMap = new HashMap<>();
        roleTargetUrlMap.put("ROLE_USER", "/");
        roleTargetUrlMap.put("ROLE_ADMIN", "/admin");

        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (final GrantedAuthority grantedAuthority : authorities) {
            String authorityName = grantedAuthority.getAuthority();
            if (roleTargetUrlMap.containsKey(authorityName)) {
                return roleTargetUrlMap.get(authorityName);
            }
        }

        throw new IllegalStateException();
    }

    protected void clearAuthenticationAttributes(
            HttpServletRequest request,
            Authentication authentication
    ) {
        // don't create session if user is null
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }

        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);

        // lấy name từ (name="username") trong login.html
        String email = authentication.getName();
        User userGetByEmail = this.userService.getUserByEmail(email);

        if (userGetByEmail != null) {
            session.setAttribute("user", userGetByEmail);
            session.setAttribute("id", userGetByEmail.getId());
            session.setAttribute("email", userGetByEmail.getEmail());
            session.setAttribute("avatar", userGetByEmail.getAvatar());
            session.setAttribute("fullName", userGetByEmail.getFullName());

            int sum = userGetByEmail.getCart() != null
                    ? userGetByEmail.getCart().getSum()
                    : 0;
            session.setAttribute("sum", sum);
        }
    }

    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication
    ) throws IOException, ServletException {
        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
//            logger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
        clearAuthenticationAttributes(request, authentication);
    }
}
