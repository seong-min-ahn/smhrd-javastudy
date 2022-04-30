import hhd.Number;

public class Ex03_메소드_사용자정의클래스_사용하기 {

	public static void main(String[] args) {
		Number nb = new Number();
		
		boolean result = nb.isdivisor(10,3);
		System.out.println(result);
		
		String result2 = nb. getdivisors(50);
		System.out.println(result2);
		
		boolean result3 = nb.isprimenumber(17);
		System.out.println(result3);
	}

}
