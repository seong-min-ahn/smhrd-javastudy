import java.util.Arrays;

public class Ex0121����3 {

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
	public static int abs(int num) { // ���밪 �޼ҵ� ����// ã�ƺ��ϱ� ���밪�Լ� Math.abs()�� �̹� �ִٰ� �� 
		return (num>0)? num:-num;  // num�� 0���� ������ -�� �ٿ� +�� �ٲ����
	}

}
