package com.laptopShop.demoMVC.controller.admin;

import com.laptopShop.demoMVC.service.OrderService;
import com.laptopShop.demoMVC.service.ProductService;
import com.laptopShop.demoMVC.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final UserService userService;

    private final ProductService productService;

    private final OrderService orderService;

    public DashboardController(
            UserService userService,
            ProductService productService,
            OrderService orderService
    ) {
        this.userService = userService;
        this.productService = productService;
        this.orderService = orderService;
    }

    @GetMapping("/admin")
    public String getDashboardPage(Model model) {
        long numberOfUsers = this.userService.countAllUsers();
        long numberOfProducts = this.productService.countAllProducts();
        long numberOfOrders = this.orderService.countAllOrders();

        model.addAttribute("countUser", numberOfUsers);
        model.addAttribute("countProduct", numberOfProducts);
        model.addAttribute("countOrder", numberOfOrders);

        return "admin/dashboard/dashboard";
    }
}
