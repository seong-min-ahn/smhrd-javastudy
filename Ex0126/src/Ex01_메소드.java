
public class Ex01_�޼ҵ� {
	//2���� ����� �Է¹޾� �� ū ���� ��ȯ�ϴ� �޼ҵ�
	//largerNumner�� ����� ����. ��, �� ���� ũ�Ⱑ ���ٸ� 0�� ��ȯ�Ѵ�.
	//�޼ҵ� ȣ��(���)

	public static void main(String[] args) {
		int result = largerNumber(10,10);
		System.out.println(result);

	}				
	//�޼ҵ� ����
	public static int largerNumber(int num1, int num2) {
		//�� ū ���� ��ȯ�ϴ� �˰��� �ۼ�
		int result=0; //�޼ҵ��� ��� ���� ��� ���� 
		
		if(num1 >num2) {
			result = num1;
		}else if(num2>num1) {
			result = num2;
		}else {
			result = 0;
		}
		
		return result;
	}

}
