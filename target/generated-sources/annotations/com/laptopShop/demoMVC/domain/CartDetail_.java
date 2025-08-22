package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CartDetail.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class CartDetail_ {

	public static final String PRODUCT = "product";
	public static final String QUANTITY = "quantity";
	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String CART = "cart";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail#product
	 **/
	public static volatile SingularAttribute<CartDetail, Product> product;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail#quantity
	 **/
	public static volatile SingularAttribute<CartDetail, Long> quantity;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail#price
	 **/
	public static volatile SingularAttribute<CartDetail, Double> price;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail#id
	 **/
	public static volatile SingularAttribute<CartDetail, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail
	 **/
	public static volatile EntityType<CartDetail> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.CartDetail#cart
	 **/
	public static volatile SingularAttribute<CartDetail, Cart> cart;

}

