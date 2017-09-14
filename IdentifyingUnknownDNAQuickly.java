package rosalind.info;
import java.io.*;

public class IdentifyingUnknownDNAQuickly {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		String maxID = "";
		String s;
		String stringSoFar = "";
		
		while( ( s = br.readLine()) != "" ){
		//String s = br.readLine();
		String id = "";
		
		//System.out.println(max);
		boolean first = true;
		if(s.charAt(0) == '>'){
			if(first){
				first = false;
				for (int i = 1; i < s.length(); i++) {
					id += s.charAt(i);
				}
			}
			else{
			
			int GC = output(stringSoFar);
			stringSoFar = "";
			if(GC > max){
				max = GC;
				maxID = id;
			}
			
			for (int i = 1; i < s.length(); i++) {
				id += s.charAt(i);
			}
		}
		}
			 
		else{
			//System.out.println("entered");
			for (int i = 0; i < s.length(); i++) {
				stringSoFar += s.charAt(i);
			}
			System.out.println("stringSoFar is "+stringSoFar);
		}
		
		}
		
		System.out.println(maxID);
		System.out.println(max);
	}
	
	public static int output(String s){
		System.out.println("output working on "+s);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'G' || s.charAt(i) == 'C')
				count++;
		}
		//System.out.println("count is "+count);
		return (count/s.length()) * 100;
	}

}
