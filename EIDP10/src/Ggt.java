
public class Ggt {

	public static void main(String[] args) {
		System.out.println(ggt(24, 14));

	}

	public static int ggt(int x, int y) {

		if (y == 0) {
			return x;
		}
		if (x == 0) {
			return y;
		}
		if (x > y) {
			return ggt(x%y, y);
		} else {
			return ggt(x, y%x);

		}

	}

}
