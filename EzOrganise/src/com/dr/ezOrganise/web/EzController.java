/**
 * 
 */
package com.dr.ezOrganise.web;

import com.google.gson.Gson;

/**
 * @author divyarattan
 *
 */
public abstract class EzController {
	
	Gson gson;
	
	public EzController() {
		gson=new Gson();
	}
	
	String getJSONString(Object obj){
		return gson.toJson(obj);
	}

}
