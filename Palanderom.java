package second;

import java.util.Scanner;

public class Palanderom {

	public static void main(String[] args) {
		
		Scanner statement =new Scanner(System.in);
	System.out.println("Enter The String / number to check if it is palindrome");
	
		String word =statement.nextLine();
		
		
		int length=word.length(); String original=""; String reverse =""; int difference=0; boolean palindrome=true;
	
		for (int i=0;i<=length-1;i++){

		if ((word.charAt(i)>='1')&&(word.charAt(i)<='9'))
			
		original +=word.charAt(i);
			
		else if ((word.charAt(i)<='Z'&& word.charAt(i)>='A')||(word.charAt(i)<='z' && word.charAt(i)>='a')) 
		original +=word.charAt(i);
		}
		original= original.toLowerCase();
		length=original.length();
		for (int i=length-1 ;i>=0;i-- ){
		reverse=reverse+original.charAt(i);
			
			}
		//	System.out.println(original);
		//	System.out.println(reverse);

		
		if (original.equals(reverse))
		System.out.println("True");
		
		else
		System.out.println("False");
			
		
		
	}

}

