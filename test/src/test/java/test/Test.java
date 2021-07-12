package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
	
	//List b = new ArrayList();
//	ArrayList a = new ArrayList();
//	
//	a.add(5);
//	a.add("Velocity");
//	a.add('$');
//	a.add(10.56f);
//	
//	System.out.println(a.size());
//	System.out.println(a.get(2));
//	
//	ArrayList<Integer> b = new ArrayList<Integer>();
//	
//	b.add(56);
//	b.add(86);
	
		
//		HashSet<String> h = new HashSet<String>();
//		
//		h.add("23");
//		h.add("$");
//		h.add("34.8f");
//		h.add("Velocity");
//		
//		Iterator<String> i = h.iterator();
//		
//		for(String s : h)
//		{
//			System.out.println(i.next());
//		}
//		
//		i = h.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		
		
		
		
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put(20, "Velocity");
//		map.put(21, "Class");
//		map.put(22, "Feb");
//		map.put(23, "2021");
//		map.put(24, "batch");
//		
//		
//		for(Map.Entry<Integer,String>  e : map.entrySet() )
//		{
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
//	
//		map.put(22, "Mar");
//		
//		
//		for(Map.Entry<Integer,String>  e : map.entrySet() )
//		{
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
		
		
		Hashtable<Character, String> table = new Hashtable<Character, String>();
		
		table.put('a', "Velocity");
		table.put('4', "Class");
		table.put('r', "Feb");
		table.put('y', "2021");
		table.put('o', "batch");
		
		
		for(Map.Entry<Character,String>  e : table.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
