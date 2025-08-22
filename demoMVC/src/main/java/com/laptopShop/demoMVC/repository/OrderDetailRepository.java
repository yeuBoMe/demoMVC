package com.laptopShop.demoMVC.repository;

import com.laptopShop.demoMVC.domain.OrderDetail;
import com.laptopShop.demoMVC.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    List<OrderDetail> findByProduct(Product product);
}
