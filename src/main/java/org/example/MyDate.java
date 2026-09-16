package org.example;

public class MyDate {

	private int year, month, day;

	public MyDate(int year, int month, int day) {
		this.year = year;

		if (month < 1 || month > 12)
			throw new IllegalArgumentException();
		this.month = month;
		
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

}
