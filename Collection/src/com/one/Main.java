package com.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 

There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map.*/
	public static void main(String[] args) {
		ArrayList<BookSale> BSal =new ArrayList();
		BSal.add(new BookSale(new Book(1,"pratik",120.0f),10));
		BSal.add(new BookSale(new Book(2,"Osaabi",100.8f),22));
		BSal.add(new BookSale(new Book(3,"shiv",195.0f),50));
		BSal.add(new BookSale(new Book(4,"aron",90.0f),45));
		BSal.add(new BookSale(new Book(5,"con",50.0f),30));
		
		HashMap <Integer,Float> hm = new HashMap();
		hm.put(1,10.5f);
		hm.put(2,2.5f);
		hm.put(5,12.5f);
		
		Iterator itr =BSal.iterator();
		while(itr.hasNext()) {
			BookSale bs=(BookSale) itr.next();
			
			if(hm.containsKey(bs.b.bookId)) {
				float total = hm.get(bs.b.bookId)+bs.b.price*bs.copiesSold;
				hm.put(bs.b.bookId,total);
			}
			else {
				float total = bs.b.price*bs.copiesSold;
				hm.put(bs.b.bookId,total);
				
			}
		}
		System.out.println(hm);
	}

}
