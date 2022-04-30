import java.util.Arrays;

public class Ex0121과제3 {

	public static void main(String[] args) {
		int[]arr = {92,32,52,9,81,2,68};
		int point = abs(arr[0]-arr[1]);
		int a = 0;
		int b = 0;
		
		for(int i =0; i<arr.length;i++ ) {
			for(int j=0; j<arr.length;j++) {
				if(i!=j) { 
					if(point>abs(arr[i]-arr[j])) {
						point= abs(arr[i]-arr[j]);
						a=i;
						b=j;
					}                  
				}	
			}
		}System.out.println("result = ["+a+","+b+"]");
	}
	public static int abs(int num) { // 절대값 메소드 생성// 찾아보니까 절대값함수 Math.abs()가 이미 있다고 함 
		return (num>0)? num:-num;  // num이 0보다 작으면 -를 붙여 +로 바꿔야지
	}

}
