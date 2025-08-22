package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Cart.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Cart_ {

	public static final String SUM = "sum";
	public static final String CART_DETAILS = "cartDetails";
	public static final String ID = "id";
	public static final String USER = "user";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.Cart#sum
	 **/
	public static volatile SingularAttribute<Cart, Integer> sum;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Cart#cartDetails
	 **/
	public static volatile ListAttribute<Cart, CartDetail> cartDetails;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Cart#id
	 **/
	public static volatile SingularAttribute<Cart, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Cart
	 **/
	public static volatile EntityType<Cart> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Cart#user
	 **/
	public static volatile SingularAttribute<Cart, User> user;

}

