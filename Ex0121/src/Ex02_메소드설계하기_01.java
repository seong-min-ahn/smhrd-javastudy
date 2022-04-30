
public class Ex02_메소드설계하기_01 {

	public static void main(String[] args) {   
	
		int num = add(3,5);
		System.out.println(num);
		
		float num2 = B(3,5);
		System.out.println(num2);
		
		float num3 = C(3,5);
		System.out.println(num3);
		
		float num4 = D(10,4);
		System.out.println(num4);
	}

	public static int add(int num1, int num2) {  
		
		int result = num1 + num2;
		return result; 
	}

	public static float B(float num1, float num2) {
		float result = num1 - num2;
		return result;
	}
	public static float C(float num1, float num2) {
		float result = num1 * num2;
		return result;
	}
	public static float D(float num1, float num2) {
		float result =  num1  / num2;
		return result; 
	}

	
	

}
