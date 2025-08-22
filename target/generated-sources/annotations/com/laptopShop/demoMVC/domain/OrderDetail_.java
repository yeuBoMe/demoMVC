package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrderDetail.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class OrderDetail_ {

	public static final String PRODUCT = "product";
	public static final String QUANTITY = "quantity";
	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String ORDER = "order";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail#product
	 **/
	public static volatile SingularAttribute<OrderDetail, Product> product;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail#quantity
	 **/
	public static volatile SingularAttribute<OrderDetail, Long> quantity;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail#price
	 **/
	public static volatile SingularAttribute<OrderDetail, Double> price;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail#id
	 **/
	public static volatile SingularAttribute<OrderDetail, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail
	 **/
	public static volatile EntityType<OrderDetail> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.OrderDetail#order
	 **/
	public static volatile SingularAttribute<OrderDetail, Order> order;

}

