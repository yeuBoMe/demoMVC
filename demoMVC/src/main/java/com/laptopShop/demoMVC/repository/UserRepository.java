package com.laptopShop.demoMVC.repository;

import com.laptopShop.demoMVC.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(long id);

    long count();

    User findByEmail(String email);

    boolean existsByEmail(String email);

    Page<User> findAll(Pageable pageable);
}
