/**
 * 
 */
package com.dr.ezOrganise.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author divyarattan
 *
 */

@Service
public class WelcomeService {

	public String getDesc() {

		return "Welcome to EzOrganise";

	}

	public String getTitle(String name) {

		if (StringUtils.isEmpty(name)) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}

	}

}
