public class Ex03메소드배열총합구하기 {

	public static void main(String[] args) {
		int[]array = {3,10,8,7,1};	
		int result =  getarraysum(array);
		System.out.println(result);		
	}
	
	//call by value(값의 복사)
	public static void change(int a) {
		a = 4;
	}
	
	// call by reference(주소 값)
	public static int getarraysum(int[]arr) {
		arr[0] = 4;
		
		int sum=0;
		for(int i =0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
}
