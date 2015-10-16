package belajarRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KarakterDgPanjangTertentu {


	public static void main(String[] args){
		String me = "Zainal Fahruddin bbasddd AB 2720 BK (0274) 513-510 Yogyakarta fnzainal@gmail.com";
		String dua = "1Z aaa {{{ [[[ 3123hjkhk";

		System.out.println("Tampilkan pin :");
		checkRegex("b{2}a", me);
	}

	//menampilkan regex
	public static void checkRegex(String string, String dua) {
		Pattern ptr = Pattern.compile(string);
		Matcher regexMtcr = ptr.matcher(dua);
		
		while(regexMtcr.find()){
			if(regexMtcr.group().length()!=0){
				System.out.print(regexMtcr.group().trim());
			}
		}
	}
}
