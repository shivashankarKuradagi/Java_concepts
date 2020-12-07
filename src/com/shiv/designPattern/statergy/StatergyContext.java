package com.shiv.designPattern.statergy;

public class StatergyContext {
	
	private SortingStatergy sortingStatergy;

	public SortingStatergy getSortingStatergy() {
		return sortingStatergy;
	}

	public void setSortingStatergy(SortingStatergy sortingStatergy) {
		this.sortingStatergy = sortingStatergy;
	}

	public StatergyContext(SortingStatergy sortingStatergy) {
		this.sortingStatergy = sortingStatergy;
	}
	
	public void executeSortStatergy() {
		sortingStatergy.sort();
	}

}
