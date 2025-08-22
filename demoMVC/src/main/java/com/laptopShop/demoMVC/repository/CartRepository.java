package com.laptopShop.demoMVC.repository;

import com.laptopShop.demoMVC.domain.Cart;
import com.laptopShop.demoMVC.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM Cart c WHERE c.id = :id")
    void deleteById(long id);

    Cart findByUser(User user);
}
