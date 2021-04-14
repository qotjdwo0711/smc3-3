import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[ 1:가위 2:바위 3:보 ]");
		
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3+1-1)+1;
		
		game(user, com);
	}
	public static void game(int user, int com){
		
		
		String user = null;
		switch (user){
		case 1:
			user = "가위!";
			break;
		case 2:
			user = "바위!";
			break;
		case 3:
			user = "보자기!";
			break;
		}
		String coms = null;
		switch (com) {
		case 1:
			coms = "가위!";
			break;
		case 2:
			coms = "바위ㅏ!";
			break;
		case 3:
			coms = "보!";
			break;	
		}
		System.out.println("--------가위 바위 보 !--------");
		System.out.println("[나: %s]VS[컴퓨터: %s]\n",user, com);
		
		if((com == 1 && user == 1)VS (com == 2 && user ==2))
	}

}
