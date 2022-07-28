package com.xworkz_collectionTest_set_set_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap hashmap=new HashMap();
		hashmap.put(3, 'c');
		hashmap.put(5, 'k');
		hashmap.put(9, 'v');
		hashmap.put(7, 's');
		hashmap.put(9, 'x');
		hashmap.put(2, 'd');
		hashmap.put(3, 'f');
		
		System.out.println(hashmap);
		
		HashMap<String,String> cityAndPin=new HashMap<String,String>();
		cityAndPin.put("bangalore", "560078");
		cityAndPin.put("dharwad", "580114");
		cityAndPin.put("Mudhol", "587313");
		cityAndPin.put("mandya", "571428");
		cityAndPin.put("vijaypur", "546789");
		
		System.out.println(cityAndPin);
		
		System.out.println("pincode of dharwad is:"+ cityAndPin.get("dharwad"));
		
		for(Entry<String, String> entry:cityAndPin.entrySet()) 
		{
			if(entry.getKey().equals("bangaluru")||entry.getKey().equals("vijaypur"))
				System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
