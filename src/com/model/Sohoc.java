package com.model;

public class Sohoc {
	private int number1;
	private int number2;
	
	public Sohoc() {
		
	}
	public Sohoc(int a,int b) {
		this.number1=a;
		this.number2=b;
	}
	
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int tong() {
		return this.number1+this.number2;
	}
	public int hieu() {
		return Math.abs(this.number1-this.number2);
	}
	public int tich() {
		return this.number1*this.number2;
	}
	public float thuong() {
		float thuong;
		if(this.number1>this.number2)
			thuong =  (float) this.number1/this.number2;
		else
			thuong = (float) this.number2/this.number1;
		return thuong;
	}
}



