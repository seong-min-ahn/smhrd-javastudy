package hhd;

public class Number {
	public static boolean isdivisor(int base, int divisor) {

//		boolean result = false;
//		if(base%divisor==0) {
//			return true;
//		}		
		//삼항 연산자
//	    boolean result = base%divisor==0?true:false;
		return base%divisor==0;  
	}

	public static String getdivisors(int number) {
		String result = "";
		
		for(int i = 1; i< number; i++) {
			if(isdivisor(number,i)) {
				result += (i+",");
			}
		}
		return result+number;
	}
	
	
	public static boolean isprimenumber(int number) {
		String divisors = getdivisors(number);
		//split은 쪼개는 기능이 있음
		String[] array=  divisors.split(",");
//		System.out.println(Arrays.toString(array));
		//위에서 구한 약수들을 이용해 소수인지 아닌지 판별하는 알고리즘
		//힌트 : 배열의 길이
		
		return array.length ==2;
	}
	
}
