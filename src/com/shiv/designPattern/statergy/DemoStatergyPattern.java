package com.shiv.designPattern.statergy;

public class DemoStatergyPattern {

	public static void main(String[] args) {
		
		SortingStatergy sortByName = new SortByName();
		SortingStatergy sortById = new SortById();
		
		StatergyContext context = new StatergyContext(sortByName);
		context.executeSortStatergy();
		
		context.setSortingStatergy(sortById);
		context.executeSortStatergy();
	
	}
	
	
	

}
