
public class Ex0127����1 {

	public static void main(String[] args) {
		//���ĺ� ������ �𷡽ð� �迭 �����
		
		char[][]arr = new char[5][5]; //���ڰ� �ƴ϶� char�� �迭����
        int h = arr.length/2;  //�𷡽ð� ���� �ݰ�
        
        int a = 'A';
        for(int i =0; i<arr.length; i++) {
        	if(i<=h) {//3����� �پ��
        		for(int j=i; j<arr.length -i; j++) {
        			arr[i][j]= (char) (a++);	
        		}
        	}else if(i>h) {//4����� �þ
        		//�𷡽ð� ���̰����� 3������� ���� ���ذ� j
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
