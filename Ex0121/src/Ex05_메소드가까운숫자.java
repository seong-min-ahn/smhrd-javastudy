import java.util.Scanner;

public class Ex05_�޼ҵ尡������ {

	public static void main(String[] args) {
		//�ΰ��� ������ ���޹޾� 10�� ����� ���� �����ϴ� �޼ҵ� �����ϱ�
		Scanner scan = new Scanner(System.in);
	    System.out.print("���� 1 �Է�: ");
		int num1 =scan.nextInt();
		System.out.print("���� 2 �Է�: ");
		int num2 =scan.nextInt();
	    System.out.print(ten(num1,num2));
	}
	//���밪 ���ϴ� �޼ҵ� //if����� �������ϱ� ���׿����� ���
	//�˾ƺ��ϱ� ���밪 �Լ� math.abs()�� �ִٰ� �Ѵ�...
	public static int abs(int num) {
		return (num>0)? num:-num;  //num�� 0���� ������ -�� �ٿ� +�� �ٲ����
	}
	public static int ten(int num1, int num2) {
		int result =0;
		if((abs(10-num1))==(abs(10-num2))) {
			result = 0;
		}else if((abs(10-num1))>(abs(10-num2))) {
			result = num2;
		}else if((abs(10-num1))<(abs(10-num2))) {
			result = num1;
		}
		return  result;
	} 
}
