package com.main;

import java.util.Iterator;

import com.model.Book;
import com.model.Phanso;
import com.model.Sohoc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sohoc sh1 = new Sohoc();
		sh1.setNumber1(10);
		sh1.setNumber2(4124);
		System.out.println("Tong 2 so: "+sh1.tong());
		System.out.println("Hieu 2 so: "+sh1.hieu());
		System.out.println("Tich 2 so: "+sh1.tich());
		System.out.println("Thuong 2 so: "+sh1.thuong());
		System.out.println("==================");
		Sohoc sh2=new Sohoc(22,156);
		System.out.println("Tong 2 so: "+sh2.tong());
		System.out.println("Hieu 2 so: "+sh2.hieu());
		System.out.println("Tich 2 so: "+sh2.tich());
		System.out.println("Thuong 2 so: "+sh2.thuong());
		System.out.println("=================");
		
		Phanso ps1 = new Phanso(1, 2);
		Phanso ps2 = new Phanso(3, 4);
		Phanso tong = ps1.tongps(ps2); 
		System.out.println("Tu cua tong: "+ tong.tu);
		System.out.println("Mau cua tong: "+tong.mau);
		System.out.println("=================");
		
		
		Book b1 = new Book('1', "Hoa vang tren co xanh", 844163, "Jonny");
		Book b2 = new Book('2', "The coujuring", 2646879, "Toony");
		Book b3 = new Book('3', "Khoa hoc may tinh", 123456, "Jerry");
		b1.maxPrice(b1, b2, b3);

		Book[] arrBook = new Book[3]; //tao mang cho doi tuong
		arrBook[0]= b1;
		arrBook[1]=b2;
		arrBook[2]=b3;
		
		 for (int i = 0; i < arrBook.length; i++) { 
			 arrBook[i].displayInfo(); 
			 }
		 

		
	
		
		
		

		
	}
	
	

}
