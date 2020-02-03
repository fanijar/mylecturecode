package lv.alina;

import java.util.Scanner;

public class TestScannerInputArray {

	
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter "+strArr.length+" names: ");
		
	    for(int i = 0; i < strArr.length;i++){
	        
	        strArr[i] = scanner.nextLine();
	    }
	        System.out.println("Dou you wanna print ou?");
	        System.out.println("Type (Yes)");
	        System.out.println("Type (No)");
	        String statusCheck = scanner.nextLine();
	    
	        if(statusCheck.equals("Yes")){
	        	printArray(strArr);
	        	
	        }else if(statusCheck.equals("No")){
	        	System.out.println("Exit");
	        }else{
	        	System.out.println("wrong input");
	        }
		
	
	}

	private static void printArray(String[] str) {
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
		
	}

}
