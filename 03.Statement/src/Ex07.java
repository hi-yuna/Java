
public class Ex07 {

	public enum Color {
		RED, BLUE, GREEN
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color c = Color.GREEN;

		switch (c) {
		case RED:
			System.out.println("RED");
			break;
		case BLUE:
			System.out.println("BLUE");
			break;
		case GREEN:
			System.out.println("GREEN");
			break;
		}

	}

}
