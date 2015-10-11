
public class Ggt1 {

	public static void main(String[] args) {
		int x = 1675;
		int y = 10;
		if (x > 0 && y > 0) {
			
			while (x > 0 && y > 0) {
				if (y == 0) {
					System.out.println(x);
				}
				if (x == 0) {
					System.out.println(y);
				}
				if (x > y) {
					x = x%y;

				} else {
					y = y%x;

				}

			}
			System.out.println(x);
			System.out.println(y);

		}
		else{
			System.out.println("GGT kann nicht berechnet werden. Es gibt einen Fehler");
		}
	}

}
