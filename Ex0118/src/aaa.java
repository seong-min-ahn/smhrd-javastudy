
public class aaa {

	public static void main(String[] args) {
		//�迭 ����� ���
				//1. ������ ����(�ʱ�ȭ)�ϸ鼭 �迭 ����!
//				 int[]numbers = {1,2,3,4,5,};
				//2.�� �� nĭ ¥�� �迭 ����!
//				int[] num2 = new int[10]; 
				// new : ���Ӱ� �޸𸮸� ������ �� ���� Ű����! int�� 10ĭ �迭 �޸� ����!
				
				//1).������ �����ϴ� season�̶�� �迭 ����!
			     String[] season = {"��","����","����","�ܿ�"};
				
				
				//2)���� �̸��� �����ϴ� team��� �迭 5ĭ ����!
				String[] team= new String[4];
				 //[Ljava.lang.String;@6504e3b2   ---->�̷��� �ߴµ� �̰� �迭 �޸��� �ּ���!!
				//2-1) ���� ĭ�� �̸� �����ϱ�~~
				team[0] = "��";
				team[1] = "��";
				team[2] = "��";
				team[3] = "��";
				team[4] = "��";
				//team[5] = "������" ���� �߻�!! 5���ε��� ����!!
				
				season = team;
				
				System.out.println(season[2]);
				//1)team�� 5ĭ,seaon�� 4ĭ�ε� �̰� ��� ������?
				
				team[2] = "Į����"; //2? ���� �ٲ۰Ŵ� team�ε� ��  
				System.out.println(season[2]);
				//�� season�� �ٲ�??
				System.out.println(season[4]);
				//3)�̰� ��� ��? 
				System.out.println(team[4]);
			}

	}


