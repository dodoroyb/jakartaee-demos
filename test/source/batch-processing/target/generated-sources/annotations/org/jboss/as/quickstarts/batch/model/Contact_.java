package org.jboss.as.quickstarts.batch.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static volatile SingularAttribute<Contact, String> phone;
	public static volatile SingularAttribute<Contact, String> name;
	public static volatile SingularAttribute<Contact, Integer> id;

	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";

}

