package com.ankitprasad.indianmonuments.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MonumentController {

	@RequestMapping(value = "/citylst", method = RequestMethod.GET)
	public String referenceData(HttpServletRequest request) throws Exception {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("AGRA");
		cityList.add("MUMBAI");
		cityList.add("HYDERABAD");
		cityList.add("DELHI");
		cityList.add("JAIPUR");
		return "success";
		
		
}		

}
