package com.blog.others;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;


	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int toSearchFor) {
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int [] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("{}", "Post Construct");	
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("{}", "Pre Destroy");
	}
	//sort
	//search
	//return the result
}
