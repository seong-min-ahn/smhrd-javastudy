import java.util.Random;

public class Ex0121����1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[]arr = new int[6];
		for(int i=0;i <arr.length;i++) {
			arr[i]=rand.nextInt(1,46);//�ζǴ� 45������..
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.println("����� ���� : "+arr[i]);
		}

	}

}
