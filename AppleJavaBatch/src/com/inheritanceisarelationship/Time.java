package com.inheritanceisarelationship;

public class Time extends Date {
	int hr,min,sec;

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	void display() {
		System.out.println("Hours :"+hr+"\nMin :"+min+"\nSecond :"+sec+"\nDate :"+dd+"\nMonth :"+mm+"\nYear :"+yy);
	}
	
}
