
public class Ex0119����2 {

	public static void main(String[] args) {
		int a = 0;
		for(int i= 1; i<=100; i++) {
			if(i%2==0) {
				a-= i;
				System.out.print(-i+" ");
			}else {
				a+=i;
				System.out.print(+i+" ");
			}
		}
		System.out.println();
		System.out.println("��� : " +a);

	}

}
