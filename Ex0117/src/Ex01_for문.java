import java.util.Scanner;

//������ 5�ñ���!!!!!!
public class Ex01_for�� {

	public static void main(String[] args) {
		/*
		 * // for�� ���� // for(�ʱⰪ; ���ǽ�; ������){ // ���๮���~~; }
		 * 
		 * 
		 * for(int i = 0; i<10; i++) { System.out.println(i);
		 * 
		 * }
		 */

		// 1. for�� ���� for���� ����Ͽ� 21���� 57���� ����Ͻÿ�.
//		for(int i = 21; i<58; i++) {
//			 System.out.println(i);
//		}

		// 2. for���� ����Ͽ� 96���� 53���� ���
//		for(int i = 96; i>52; i--) {
//			System.out.println(i);
//		}
		// 3. for���� ����Ͽ� 21���� 57������ �� �� Ȧ���� ���

//		for (int i = 21; i < 58; i += 2) {
//			System.out.println(i);
//		}

		// 3.1 �ٸ����
//		for (int i = 21; i < 58; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}

		// 4. 1���� 100������ �� ���ϱ�
//		int sum = 0;
//		int i = 0;
//		for (i = 1; i < 101; i ++) {
//			sum+=i;
//		}
//		System.out.println(sum);

		// 5. 1-2+3-4 ... ���ϱ�
//		int num=0; 
//		int i=0;
//		for(i=1; i<101; i++) {
//			if(i%2==0) {
//				num-=i;
//			}else {
//				num+=i;
//			}
//		}
//		System.out.println(num);

//		int sum=0;
//		int i = 0;
//		for(i=1; i<=77; i++) {
//			sum+=i *(78-i);
//		}
//		System.out.println(sum);

//		Scanner scan = new Scanner(System.in);
//		
//        System.out.print("����1 �Է�>>");
//		int Base = scan.nextInt();
//	    System.out.print("����2 �Է�>>");
//		int n = scan.nextInt();
//		int a = 1;
//		int i = 0;
//		for (i = 1; i <= n; i++) {
//			a = a * Base;
//			System.out.println(a);
//		}
		
		//������ �����
//		Scanner scan = new Scanner(System.in);		
//        System.out.print("�� �Է�: ");
//        int a = scan.nextInt();
//        System.out.print("���� �Է�: ");
//        int b = scan.nextInt();
//        
//		for (int i= 1; i<= b; i++) {
//			System.out.println(a+" * "+ i + " = " + a*i);
//		}
//		
//		
		int hap=0;
		int sw=1;
				for(int i =1; i<=10;i++) {
					hap+=(sw*i);
					sw*=-1;
		
				}
				System.out.println(hap);
	}

}
