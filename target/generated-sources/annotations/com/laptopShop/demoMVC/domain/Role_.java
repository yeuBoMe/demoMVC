package com.laptopShop.demoMVC.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Role.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Role_ {

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String USERS = "users";

	
	/**
	 * @see com.laptopShop.demoMVC.domain.Role#name
	 **/
	public static volatile SingularAttribute<Role, String> name;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Role#description
	 **/
	public static volatile SingularAttribute<Role, String> description;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Role#id
	 **/
	public static volatile SingularAttribute<Role, Long> id;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Role
	 **/
	public static volatile EntityType<Role> class_;
	
	/**
	 * @see com.laptopShop.demoMVC.domain.Role#users
	 **/
	public static volatile ListAttribute<Role, User> users;

}

