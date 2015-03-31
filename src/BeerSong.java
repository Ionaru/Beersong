public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 100;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}
			System.out.println();
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take two down.");
			System.out.println("Pass them around");
			beerNum = beerNum - 2;

			if (beerNum > 0) {
				if (beerNum == 1) {
					word = "bottle";
				}
				System.out.println("You've got " + beerNum + " " + word
						+ " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
