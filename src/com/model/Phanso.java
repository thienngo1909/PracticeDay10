package com.model;

public class Phanso {
	public int tu,mau;
	
	 public Phanso() {
		 
	 }
	 
	 public Phanso(int a,int b) {
		 this.tu=a;
		 this.mau=b;
	 }
	 
	 public Phanso tongps(Phanso ps) {
		 int tuso= this.tu  +  ps.tu;
		 int mausochung = this.mau * ps.mau;
		 Phanso tongPS = new Phanso(tuso, mausochung);
		 return tongPS;
		 
	 }
}
