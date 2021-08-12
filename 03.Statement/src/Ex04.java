import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("점수입력!");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("입력하신 점수는 " + score + " 입니다.");
		System.out.println("학점은 " + grade + " 입니다.");

	}

}
