package com.laptopShop.demoMVC.service.valid;

import com.laptopShop.demoMVC.domain.dto.RegisterDTO;
import com.laptopShop.demoMVC.service.UserService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Service;

@Service
public class RegisterValidator implements ConstraintValidator<RegisterChecked, RegisterDTO> {

    private final UserService userService;

    public RegisterValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(RegisterDTO registerDTO, ConstraintValidatorContext context) {
        boolean valid = true;

        // Check if password fields match
        if (!registerDTO.getPassword().equals(registerDTO.getConfirmPassword())) {
            context.buildConstraintViolationWithTemplate("Mật khẩu nhập không chính xác!")
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        // Check if email exists
        if (userService.checkUserEmailExists(registerDTO.getEmail())) {
            context.buildConstraintViolationWithTemplate("Email " + registerDTO.getEmail() + " đã tồn tại!")
                    .addPropertyNode("email")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        return valid;
    }
}
