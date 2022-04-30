import java.util.Random;

public class Ex0121과제1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[]arr = new int[6];
		for(int i=0;i <arr.length;i++) {
			arr[i]=rand.nextInt(1,46);//로또는 45번까지..
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.println("행운의 숫자 : "+arr[i]);
		}

	}

}
