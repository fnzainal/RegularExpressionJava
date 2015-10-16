package belajarRegex;
/**
 * Regex mengecek nomor telepon
 * @author Zainal Fahrudin
 * Pondok Programmer, 14 Oct 2015
 */
import java.util.ArrayList;

public class NomorTelepon {

	public static void main(String[] args){
		ArrayList<String> input = new ArrayList<String>();
		input.add("021-24-2412");
		input.add("0898-7654-3210");
		input.add("9812-4-2411");
		input.add("3252-12-1245");
		
		for(String ssn : input){
			if (ssn.matches("^(\\d{4}-?\\d{4}-?\\d{3,4})$")){
				System.out.println("Nomor telepon benar");
			}else{
				System.out.println("Nomor telepon salah");
			}
		}
		
	}
}