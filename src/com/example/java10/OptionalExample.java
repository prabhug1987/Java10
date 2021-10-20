/* class name 
 * version info
 * about the class
 * copyright notice
 * @copyright
 * 
 */

package com.example.java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OptionalExample {
	
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("hello");
		//optional.orElseThrow(new Exception());
		List<String> list1 = new ArrayList<String>();
		//copying a list
		List<String> list2 = List.copyOf(list1);
		
		Set<String> set = new HashSet<String>();
		//coptying a set
		Set<String> set2 = Set.copyOf(set);
		//copying a map
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = Map.copyOf(map);
		
		
		List<String> list3 = Stream.of("1","2","3").distinct().collect(Collectors.toUnmodifiableList());
		Map<String,Integer> map3 = Stream.of(Map.entry("one",1),Map.entry("two",1),Map.entry("three",1)).collect(Collectors.toUnmodifiableList());
		
		Collectors.toUnmodifiableSet();
		
	}

}
