package com.findbugs.examples;

@Deprecated
public class CalendarYear {
	//FIXME : Remove this class after usage
	private String[] months;

	public String[] getMonths() {
		String[] gmonths = this.months;
		return gmonths ;
	}
	
	//TODO : Code cleanup

	public void setMonths(String[] months) {
		this.months = months;
	}

}
