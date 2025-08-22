package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Order.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Order_ {

	public static final String RECEIVER_ADDRESS = "receiverAddress";
	public static final String ORDER_DETAILS = "orderDetails";
	public static final String RECEIVER_PHONE = "receiverPhone";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String RECEIVER_NAME = "receiverName";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String STATUS = "status";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#receiverAddress
	 **/
	public static volatile SingularAttribute<Order, String> receiverAddress;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#orderDetails
	 **/
	public static volatile ListAttribute<Order, OrderDetail> orderDetails;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#receiverPhone
	 **/
	public static volatile SingularAttribute<Order, String> receiverPhone;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#totalPrice
	 **/
	public static volatile SingularAttribute<Order, Double> totalPrice;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#receiverName
	 **/
	public static volatile SingularAttribute<Order, String> receiverName;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#id
	 **/
	public static volatile SingularAttribute<Order, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order
	 **/
	public static volatile EntityType<Order> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#user
	 **/
	public static volatile SingularAttribute<Order, User> user;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Order#status
	 **/
	public static volatile SingularAttribute<Order, String> status;

}

