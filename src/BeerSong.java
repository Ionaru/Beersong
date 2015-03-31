public class BeerSong {

	public static void main(String[] args) {
		//Settings for the song
		int drinksNumTotal = 100;
		String containerSingle = "can";
		String containerMultiple = "cans";
		String drink = "soda";
		int numberOfDrinksToTake = 1;
		
		//Song data
		String container = containerMultiple;
		String word;

		while (drinksNumTotal > 0) {
			if (drinksNumTotal == 1) {
				container = containerSingle;
			}
			System.out.println();
			System.out.println(drinksNumTotal + " " + container + " of " + drink + " on the wall");
			System.out.println(drinksNumTotal + " " + container + " of " + drink + ".");
			System.out.println("Take " + numberOfDrinksToTake + " down.");
			
			if (numberOfDrinksToTake > 1){
				word = "them";
			}
			else {
				word = "it";
			}
			System.out.println("Pass " + word + " around");
			drinksNumTotal = drinksNumTotal - numberOfDrinksToTake;

			if (drinksNumTotal > 0) {
				if (drinksNumTotal == 1) {
					container = containerSingle;
				}
				System.out.println("You've got " + drinksNumTotal + " " + container
						+ " of " + drink + " on the wall");
			} else {
				System.out.println("No more " + containerMultiple + " of " + drink + " on the wall");
			}
		}
	}
}
