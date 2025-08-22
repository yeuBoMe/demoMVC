package com.laptopShop.demoMVC.repository;

import com.laptopShop.demoMVC.domain.Cart;
import com.laptopShop.demoMVC.domain.CartDetail;
import com.laptopShop.demoMVC.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {

    CartDetail findByCartAndProduct(Cart cart, Product product);

    List<CartDetail> findByProduct(Product product);
}
