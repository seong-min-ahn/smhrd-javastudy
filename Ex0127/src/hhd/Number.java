package hhd;

public class Number {
	public static boolean isdivisor(int base, int divisor) {

//		boolean result = false;
//		if(base%divisor==0) {
//			return true;
//		}		
		//���� ������
//	    boolean result = base%divisor==0?true:false;
		return base%divisor==0;  
	}

	public static String getdivisors(int number) {
		String result = "";
		
		for(int i = 1; i< number; i++) {
			if(isdivisor(number,i)) {
				result += (i+",");
			}
		}
		return result+number;
	}
	
	
	public static boolean isprimenumber(int number) {
		String divisors = getdivisors(number);
		//split�� �ɰ��� ����� ����
		String[] array=  divisors.split(",");
//		System.out.println(Arrays.toString(array));
		//������ ���� ������� �̿��� �Ҽ����� �ƴ��� �Ǻ��ϴ� �˰���
		//��Ʈ : �迭�� ����
		
		return array.length ==2;
	}
	
}
