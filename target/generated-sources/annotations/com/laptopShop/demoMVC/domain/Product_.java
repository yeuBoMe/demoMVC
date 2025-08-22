package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Product_ {

	public static final String IMAGE = "image";
	public static final String DETAIL_DESC = "detailDesc";
	public static final String SOLD = "sold";
	public static final String FACTORY = "factory";
	public static final String QUANTITY = "quantity";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String SHORT_DESC = "shortDesc";
	public static final String ID = "id";
	public static final String TARGET = "target";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#image
	 **/
	public static volatile SingularAttribute<Product, String> image;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#detailDesc
	 **/
	public static volatile SingularAttribute<Product, String> detailDesc;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#sold
	 **/
	public static volatile SingularAttribute<Product, Long> sold;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#factory
	 **/
	public static volatile SingularAttribute<Product, String> factory;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#quantity
	 **/
	public static volatile SingularAttribute<Product, Long> quantity;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#price
	 **/
	public static volatile SingularAttribute<Product, Double> price;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#shortDesc
	 **/
	public static volatile SingularAttribute<Product, String> shortDesc;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#id
	 **/
	public static volatile SingularAttribute<Product, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product
	 **/
	public static volatile EntityType<Product> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Product#target
	 **/
	public static volatile SingularAttribute<Product, String> target;

}

