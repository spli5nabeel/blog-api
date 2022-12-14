package com.blog.others;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

	
	public int[] sort(int[] numbers) {
		//Bubble sort logic
		return numbers;
	}
}
