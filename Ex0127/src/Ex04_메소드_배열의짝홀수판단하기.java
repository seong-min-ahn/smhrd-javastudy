import java.util.Arrays;

public class Ex04_�޼ҵ�_�迭��¦Ȧ���Ǵ��ϱ� {

	public static void main(String[] args) {
		//������ �迭�� �Է����� ������ �� ���� ¦������ Ȧ������ �Ǵ��ؼ�
		//�迭�� ��ȯ�ϴ� �޼ҵ� isoddevenarray�� ������.
		//¦����� true, Ȧ����� false�� �����Ѵ�.
		int[] inputarray = {9,10,5,1};
		boolean[]result = isoddevenarray(inputarray);
		System.out.println(Arrays.toString(result));

	}
	public static boolean[]isoddevenarray(int[]array){
		boolean[]result = new boolean[array.length];
		
		for(int i =0; i<array.length; i++) {
//			if(array[i]%2==0) {
//				result[i] = true;
//			}else {
//				result[i]= false;
//			}
			result[i]=array[i]%2 ==0? true : false;
			
		}
		return result;
	}
	
	

}
