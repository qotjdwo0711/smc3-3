import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[ 1:���� 2:���� 3:�� ]");
		
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3+1-1)+1;
		
		game(user, com);
	}
	public static void game(int user, int com){
		
		
		String user = null;
		switch (user){
		case 1:
			user = "����!";
			break;
		case 2:
			user = "����!";
			break;
		case 3:
			user = "���ڱ�!";
			break;
		}
		String coms = null;
		switch (com) {
		case 1:
			coms = "����!";
			break;
		case 2:
			coms = "������!";
			break;
		case 3:
			coms = "��!";
			break;	
		}
		System.out.println("--------���� ���� �� !--------");
		System.out.println("[��: %s]VS[��ǻ��: %s]\n",user, com);
		
		if((com == 1 && user == 1)VS (com == 2 && user ==2))
	}

}
