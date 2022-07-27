package com.phase.one;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Mapping 	{

public static void main(String[] args) {
	
	HashMap<Integer,String> s=new HashMap<Integer,String>();      
      s.put(1,"Karthick");    
      s.put(2,"ViratKholi");    
      s.put(3,"KVK");   
       
      System.out.println("\nHashmap: ");  
      for(Map.Entry m:s.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }
      
     //HashTable
       
      Hashtable<Integer,String> s1=new Hashtable<Integer,String>();  
      
      s1.put(4,"Sathya");  
      s1.put(5,"Prasanth");  
      s1.put(6,"HariKrishnan");  
      s1.put(7,"Jadeja");  

      System.out.println("\nHashTable:");  
      for(Map.Entry n:s1.entrySet()){    
       System.out.println(n.getKey()+" "+n.getValue());    
      }
      
      
      //TreeMap
      
      TreeMap<Integer,String> s2=new TreeMap<Integer,String>();    
      s2.put(8,"Delhi");    
      s2.put(9,"Mumbai");    
      s2.put(10,"Chennai");       
      
      System.out.println("\n TreeMap:");  
      for(Map.Entry l:s2.entrySet()){    
       System.out.println(l.getKey()+" "+l.getValue());    
      }    
      
}  
}