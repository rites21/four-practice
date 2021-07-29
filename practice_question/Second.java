package practice_question;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a site to check if it is secure or not:");
		String str=sc.nextLine();
		if(str.startsWith("https")) {
			System.out.println(" secure ");
		}
		else if(str.startsWith("http")){
			System.out.println("not secured");
			
		}
				
			
		

	}

}
