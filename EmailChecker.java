package regex;
/**
 * Email Checker
 * @author Zainal Fahrudin
 * Pondok Programmer, 16 Oct 2015
 */

import java.util.Scanner;

public class EmailChecker {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an email : ");
		String emails=input.nextLine();
		
		String regex ="^([a-z0-9\\+_\\-]+)(\\.[a-z0-9\\+_\\-]+)*@([a-z0-9\\-]+\\.)+[a-z]{2,6}$";
		if(emails.matches(regex)){
			System.out.println(emails+" is valid email.");
		}else{
			System.out.println(emails+" is invalid email.");
		}
		input.close();
}
}
