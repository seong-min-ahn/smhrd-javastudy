
public class Ex03_0118����2 {

	public static void main(String[] args) {
		//�迭�� ���� 13 , 5, 7, 17, 3, 16, 19, 20, 2, 1, �����ϰ�
		//1)¦�� ���� �ε����� ���
		//2)Ȧ�� � ���� ���
		//3)��� ���� ��� ���ϱ�
		
		int[] number = {13 , 5, 7, 17, 3, 16, 19, 20, 2, 1};
		int i;
		
		for(i = 0; i <= 9; i++) {
			if((1+i)%2==0) {
				System.out.print(number[i]+ " ");
			}
		}
		System.out.println();
		
		int count_number= 0 ;
		for(i = 0; i<=9; i++) {
			if(number[i]%2!=0) { 
				System.out.print(number[i]+" ");
				count_number++;			
			}
		}	System.out.print("�̸� Ȧ���� ���� "+ count_number+"�� �̴�");
		System.out.println();
		
		int sum = 0;
		for(i=0; i<=9; i++) {
			sum+= number[i];
		}System.out.println("����� "+ (sum/10f)+ "�̴�.");
		

	}

}
