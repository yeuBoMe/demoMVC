package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class User_ {

	public static final String PASSWORD = "password";
	public static final String ADDRESS = "address";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String ROLE = "role";
	public static final String FULL_NAME = "fullName";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String AVATAR = "avatar";
	public static final String EMAIL = "email";
	public static final String CART = "cart";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#address
	 **/
	public static volatile SingularAttribute<User, String> address;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#phoneNumber
	 **/
	public static volatile SingularAttribute<User, String> phoneNumber;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#role
	 **/
	public static volatile SingularAttribute<User, Role> role;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#fullName
	 **/
	public static volatile SingularAttribute<User, String> fullName;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#orders
	 **/
	public static volatile ListAttribute<User, Order> orders;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#id
	 **/
	public static volatile SingularAttribute<User, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#avatar
	 **/
	public static volatile SingularAttribute<User, String> avatar;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.User#cart
	 **/
	public static volatile SingularAttribute<User, Cart> cart;

}

