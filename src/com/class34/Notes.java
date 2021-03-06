package com.class34;

public class Notes {
//	Class 34
//
//	Collection - a container object that can have homogeneous and heterogeneous, duplicate and unique objects.
//
//	Homogeneous - objects from same class
//	Heterogeneous - objects from different class
//
//	Collection Framework: group of Interfaces and Classes that help us to store collection.
//
//	Collection Framework:   1. List
//							2. Set
//							3. Queue
//
//	LIST (inteface): - ordered collection that allows duplicates
//
//	Classes that implements List Interface:
//
//	1. ArrayList - best choice if you have to perform retrieval manipulations
//
//			List<String> list=new ArrayList<>();
//			list.add("Java");
//			list.add("is");
//			list.add("fun");
//			
//			System.out.println(list);
//
//	2. LinkedList - best choice if you contantly ading or removing values
//
//			List<String> list=new LinkedList<>();
//			list.add("Java");
//			list.add("is");
//			list.add("fun");
//			
//			System.out.println(list);
//
//	3. Vector--> Stack
//
//	SET - unordered collection that does not allow duplicates
//	Classes that implements SET Interface:
//	1. HashSet - does not preserve the order
//
//		Set<String> set=new HashSet<>();
//			set.add("Java");
//			set.add("is");
//			set.add("fun");
//			set.add("and");
//			set.add("logic based");
//			
//			System.out.println(set);
//			[Java, and, is, fun, logic based]
//
//	2. LinkedHashSet - preserves the insertion order
//
//			Set<String> set=new LinkedHashSet<>();
//			set.add("Java");
//			set.add("is");
//			set.add("fun");
//			set.add("and");
//			set.add("logic based");
//			
//			System.out.println(set);
//			[Java, is, fun, and, logic based]
//
//	3. TreeSet - sort based on values (0-9 , A-Z)
//
//			Set<String> set=new TreeSet<>();
//			set.add("java");
//			set.add("is");
//			set.add("fun");
//			set.add("and");
//			set.add("logic based");
//			
//			System.out.println(set);
//			[and, fun, is, java, logic based]
//
//	MAP - is collection of entries/ collection of key+value Objects
//	Classes that implements MAP Interface:
//
//	1. HashMap - does not preserve insertion order of a keys
//
//			Map<Integer, String> map=new HashMap<>();
//			map.put(1, "A");
//			map.put(2, "B");
//			map.put(3, "C");
//			map.put(4, "D");
//			map.put(null, "E");
//			map.put(5, null);
//			map.put(4, "E");
//			
//			System.out.println(map);
//			{null=E, 1=A, 2=B, 3=C, 4=E, 5=null}
//
//	2. LinkedHashMap - preserves order of Key Objects
//
//			Map<Integer, String> map=new LinkedHashMap<>();
//			map.put(1, "A");
//			map.put(2, "B");
//			map.put(3, "C");
//			map.put(4, "D");
//			map.put(null, "E");
//			map.put(5, null);
//			map.put(4, "E");
//			
//			System.out.println(map);
//			{1=A, 2=B, 3=C, 4=E, null=E, 5=null
//
//	3. TreeMap - sort keys based on values and CANNOT have null keys
//
//			Map<Integer, String> map=new TreeMap<>();
//			map.put(1, "A");
//			map.put(2, "B");
//			map.put(3, "C");
//			map.put(4, "D");
//			//map.put(null, "E");
//			map.put(5, null);
//			map.put(4, "E");
//			
//			System.out.println(map);
//			{1=A, 2=B, 3=C, 4=E, 5=null}
//
//	4. HashTable - similar to a HashMap except it does NOT allow null key
//
//			Map<String, Integer> map1=new Hashtable<>();
//			map1.put("1", 2);
//			//map1.put(null, 3);
//			map1.put("A", 2);
//			System.out.println(map1);
//			{A=2, 1=2}



}
