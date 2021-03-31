import java.util.Scanner;

public class prob_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scan=new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력:");
		Grade me = new Grade();
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		System.out.println("평균은"+me.average());
	}

}

class Grade{
	int math;
	int science;
	int english;
	public int average(){
		return(math+science+english)/3;
	}
}