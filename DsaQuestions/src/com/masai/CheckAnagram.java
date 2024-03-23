package com.masai;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckAnagram {
   
	public static boolean checkAnagram(String s,String t) {
		   if(s.length()!=t.length()){
	            return false;
	        }
	            Map<Character,Integer> map= new LinkedHashMap<>();
	            Map<Character,Integer> map1= new LinkedHashMap<>();
	            for(int f=0;f<s.length();f++){
	                if(map.containsKey(s.charAt(f))){
	                map.put(s.charAt(f),map.get(s.charAt(f))+1);
	                } else{
	                  map.put(s.charAt(f),1);   
	                }
	            }
	             for(int g=0;g<t.length();g++){
	                if(map1.containsKey(t.charAt(g))){
	                map1.put(t.charAt(g),map1.get(t.charAt(g))+1);
	                } else{
	                  map1.put(t.charAt(g),1);   
	                }
	            }
	            for(Map.Entry<Character,Integer> m:map.entrySet()){
	                if(!map1.containsKey(m.getKey())){
	                         return false;
	                }else{
	                    if(map1.get(m.getKey())<m.getValue()){
	                        return false;
	                    }
	                }
	            }
	            return true;
	}
	
	public static void main(String[] args) {
		String a="abddd";
		String b="dabdd";
		System.out.println(checkAnagram(a,b));

	}

}
