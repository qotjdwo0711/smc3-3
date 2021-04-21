import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Grade me = new Grade();
		Scanner scan = new Scanner(System.in);
		System.out.print("수학,거ㅏ학,영어 순으로 3개의 점수입력:");
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		System.out.print("평균은" + me.average() + "점 입니다");
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math + science + english)/3;		
	}
}