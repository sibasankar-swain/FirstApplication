package com.siba.main.test;

public class FindSum {

	public int sumOfUpToNumber(int number){
		int sum=0;
		for(int i=0;i<number;i++){
			sum=sum+i;
		}
		return sum;
	}
}
