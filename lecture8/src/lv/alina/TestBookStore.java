package lv.alina;

import lv.alina.bookstore.Author;
import lv.alina.bookstore.Book;

public class TestBookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowling", "rowling@gmail.com", 'f');//konstruktors
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
		rowling.setEmail("newrowling@gmail.com");
		System.out.println(rowling.getEmail());
		
		Author test3 = new Author("Kārlis Sklabe");
		
		Book kakisaDzirnavas = new Book ("Kakisa Dzirnavas", test3, 10.99, 500);//konstruktors
		
		System.out.println(kakisaDzirnavas.toString());
		
		Book harrypotter = new Book ("Harry Potter", rowling, 15.99, 1000);
		
		System.out.println(harrypotter.toString());
		
		
		
		
		
		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		
		
		
		Author test1 = new Author("name", "e-mail", 'f');
		Author test2 = new Author("name1", "e-mail1", '0');
		
		System.out.println(test1.toString());
		
		System.out.println("---");
		
		System.out.println(test2.toString());
		System.out.println("---");
		
		
		
		
		char m = 'm';
		char f = 'f';
		char o = 'j';
		
		if(m == o || f == o){
			System.out.println( "It is M or F");			
		}else{
			System.out.println("It is not M or F");
		}
		System.out.println("----");
		
		switch(o){
			case 'm':
				System.out.println("Its m");
				break;
			case 'f':
				System.out.println("Its f");
				break;
			default:
				System.out.println("Not in list");
				
		}

	}

}
