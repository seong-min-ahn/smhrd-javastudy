
public class Ex0127과제1 {

	public static void main(String[] args) {
		//알파벳 순으로 모래시계 배열 만들기
		
		char[][]arr = new char[5][5]; //숫자가 아니라 char로 배열생성
        int h = arr.length/2;  //모래시계 높이 반값
        
        int a = 'A';
        for(int i =0; i<arr.length; i++) {
        	if(i<=h) {//3행까지 줄어듬
        		for(int j=i; j<arr.length -i; j++) {
        			arr[i][j]= (char) (a++);	
        		}
        	}else if(i>h) {//4행부터 늘어남
        		//모래시계 높이값에서 3행까지의 값을 빼준게 j
        		for(int j= h*2 -i; j<= i; j++ ) {
        			arr[i][j]=(char)(a++);	
        		}
        	}
        }
        for(int j =0; j<arr.length; j++) {
        	for(int k=0; k<arr.length;k++) {
        		System.out.print(arr[j][k]+"\t");
        	}
        	System.out.println();
        }
	}
}
