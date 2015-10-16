package belajarRegex;
/**
 * Regex menampilkan url
 * @author Zainal Fahrudin
 * Pondok Programmer, 14 Oct 2015
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowUrl {

	public static void main(String[] args){
		
		String data = "Candi Prambanan http://www.initempatwisata.com/redirection/apps/lazy/thumb.php?src=http%3A%2F%2Fwww.initempatwisata.com%2Fmediafiles%2F2014%2F11%2FCandi-Prambanan-di-Jogja-600x375.jpg&w=600" +
				" Inilah candi Hindu terbesar di kawasan Asia Tenggara, berketinggian 47 meter dan telah dinyatakan sebagai salah satu warisan kebudayaan dunia pada tahun 1991 oleh UNESCO. Inilah pula candi Hindu paling megah yang ada di Indonesia. Candi Prambanan ini terletak di perbatasan antara 2 provinsi, yakni Jogjakarta dan Jawa Tengah. Objek wisata Jogja ini memiliki panorama nan memikat, sungguh eksotik di kala senja tatkala cahaya matahari menyinari bangunan candi dengan gradasinya yang mempesona. Dari dekat, Anda dapat menyaksikan pemandangan arsitektur dan desain candi yang begitu indah.longitude-7.751919 latitude 110.492006";
		String data2 = "ini bukan url http://kenapacom/asnfkn nndkg http://kena_pa.com/asnfkn/php?100%token?=dgbbnod2480_agng/hop.jpg httaps://coa.coa/vom ftp://sagga.c/sgpa";
		
		//regex
		String regex = "(ht{2}p|ht{2}ps|ftp):/{2}[\\w.-]*[.]\\w{1,3}[\\S]*";

		System.out.println("data :");
		System.out.println("String data = \""+data+"\"");
		System.out.println("String data2 = \""+data2+"\"");
		System.out.println();
		System.out.println("Tampilkan URL :");

		
		System.out.println();
		System.out.println("url dari String data");
		//memanggil method showUrl dg String data
		showUrl(regex,data);
		System.out.println();
		System.out.println("url dari String data2");
		//memanggil method showUrl dg String data2
		showUrl(regex,data2);
	}

	//method showUrl
	public static void showUrl(String regex, String data) {
		Pattern ptr = Pattern.compile(regex);
		Matcher regexMtcr = ptr.matcher(data);
		
		while(regexMtcr.find()){
			if(regexMtcr.group().length()!=0){
				System.out.println(regexMtcr.group().trim());
			}
		}
		
	}

}
