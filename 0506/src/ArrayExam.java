import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		int j=0;
		for(int i=0; i<arr.length; i++){
			System.out.println((i+1)+"번 입력:");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				j = i+1;
			}
		}
		System.out.println("가장 큰 수는" +j+ "번째 숫자인" + max);
	}

}
