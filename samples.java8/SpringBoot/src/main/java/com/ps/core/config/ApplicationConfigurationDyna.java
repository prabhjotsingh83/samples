package com.ps.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


public class ApplicationConfigurationDyna {

	@Autowired
	private ApplicationConfiguration configuration;

	/*
	 * @RequestMapping("/dynamic-configuration") public Map dynamicConfiguration() {
	 * // Not the best practice to use a map to store differnt types! Map map = new
	 * HashMap(); map.put("message", configuration.getMessage()); map.put("number",
	 * configuration.getNumber()); map.put("key", configuration.isValue()); return
	 * map; }
	 */
	
}
