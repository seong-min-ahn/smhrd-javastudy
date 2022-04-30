import java.util.Arrays;
import java.util.Scanner;

public class Ex0128°úÁ¦1 {

	public static void main(String[] args) {
		
	}
	public static String getmiddle(String word) {
		String[]arr = word.split("");
		if(arr.length%2==0) {
			return arr[(arr.length-2)-1]+arr[arr.length/2];
			
		}else {
			return arr[arr.length/2];
		}
		
	}

}

