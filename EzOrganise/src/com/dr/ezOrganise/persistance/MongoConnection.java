/**
 * 
 */
package com.dr.ezOrganise.persistance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.dr.ezOrganise.config.SpringMongoConfig;

/**
 * @author divyarattan
 *
 */
public class MongoConnection {

	public static MongoOperations getMongoOperation() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		return (MongoOperations) ctx.getBean("mongoTemplate");

	}

}
