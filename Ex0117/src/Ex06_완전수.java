
public class Ex06_������ {

	public static void main(String[] args) {
		
		
		
		
		for(int  i=1; i<=1000; i++) {//���ڸ� �Է��ϸ� 1���� �� ���ڱ���
			int sum=0;
			for(int j=1; j<i; j++) {
				//1. ��� ���ϱ�
				if(i%j==0) {//���ʴ�� �������� ������ ��������
					sum+=j; //�ϳ��� �����ؼ� ����
				}
			}
			if (sum==i) { //���� ������ ������ �ڱ� �ڽŵ� ���ԵǾ� �����Ƿ� �ѹ� �� ��
				System.out.println(i+"�� ������ �Դϴ�! ");
			}
			
		}

	}

}
