package com.advance.set.operations;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperationsA {

	public static void main(String[] args) {
		Set<String> carBrands=new HashSet<>();
		carBrands.add("kia");
		carBrands.add("Innova");
		carBrands.add("Benz");
		carBrands.add("Tesla");
		System.out.println("original set of car brands:" +carBrands );
		Set<String> newCarBrands=new HashSet<>();
		newCarBrands.add("maruti");
		newCarBrands.add("volvo");
		newCarBrands.add("breeza");
		newCarBrands.add("tata");
		carBrands.addAll(newCarBrands);
		System.out.println("the new cars:" +carBrands);
		Set<String> leastReliableCarBrands=new HashSet<>();
		leastReliableCarBrands.add("breeza");
		leastReliableCarBrands.add("volvo");
		leastReliableCarBrands.add("Innova");
		leastReliableCarBrands.add("tata");
		System.out.println("least reliable car brands:"+carBrands.containsAll(leastReliableCarBrands));
		carBrands.retainAll(leastReliableCarBrands);
		System.out.println("least reliable brands found:" +carBrands);
		carBrands.removeAll(leastReliableCarBrands);
		System.out.println("least reliable cars sold:"+carBrands);
		
		
		

	}

}
