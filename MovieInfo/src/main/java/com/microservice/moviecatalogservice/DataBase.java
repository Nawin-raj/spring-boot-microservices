package com.microservice.moviecatalogservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
	HashMap<String, ArrayList<String>> map;

	public void filldata() {
		map = new HashMap();
		ArrayList<String> list1 = new ArrayList();
		list1.add("dhruva");
		list1.add("naayak");
		list1.add("orange");

		ArrayList<String> list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");

		ArrayList<String> list3 = new ArrayList();
		list3.add("x");
		list3.add("y");
		list3.add("z");
		
		map.put("naveen", list1);
		map.put("pavan", list2);
		map.put("charan", list3);

	}

}
