package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.blog.others.BinarySearchImpl;

@SpringBootApplication
public class OtherController {
	
	//identify beans
	//identify dependencies
	//search for beans in spring

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext applicationContext =  SpringApplication.run(OtherController.class, args);
		BinarySearchImpl binarySearch =  applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
	}
	
}
