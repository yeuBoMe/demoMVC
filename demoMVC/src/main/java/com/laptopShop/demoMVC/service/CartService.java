package com.laptopShop.demoMVC.service;

import com.laptopShop.demoMVC.domain.Cart;
import com.laptopShop.demoMVC.domain.User;
import com.laptopShop.demoMVC.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart getCartByUser(User user) {
        return this.cartRepository.findByUser(user);
    }
}
