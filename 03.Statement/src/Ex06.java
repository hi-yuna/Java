
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String month = "10월";
		String season = null;

		switch (month) {
		case "1월":
			season = "겨울";
			break;
		case "3월":
			season = "봄";
			break;
		case "7월":
			season = "여름";
			break;
		case "10월":
			season = "가을";
			break;
		}

		System.out.println(month + "은 " + season + "입니다!");
	}

}
