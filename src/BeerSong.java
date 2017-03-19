public class BeerSong {

    public static void main(String[] args) {
        // Settings for the song
        int drinksNumTotal = 99;
        String containerSingle = "bottle";
        String containerMultiple = "bottles";
        String drink = "beer";
        int numberOfDrinksToTake = 1;

        // Song data
        String container = containerMultiple;
        String word;

        while (drinksNumTotal > 0) {

            System.out.print('\n');

            if (drinksNumTotal == 1) {
                container = containerSingle;
            }

            System.out.print(drinksNumTotal + " " + container + " of "
                    + drink + " on the wall, ");
            System.out.print(drinksNumTotal + " " + container + " of "
                    + drink + ".\n");

            if (numberOfDrinksToTake > drinksNumTotal) {
                numberOfDrinksToTake = drinksNumTotal;
            }

            System.out.print("Take " + numberOfDrinksToTake + " down");

            if (numberOfDrinksToTake > 1) {
                word = "them";
            } else {
                word = "it";
            }

            System.out.print(" and pass " + word + " around, ");
            drinksNumTotal = drinksNumTotal - numberOfDrinksToTake;

            if (drinksNumTotal > 0) {
                if (drinksNumTotal == 1) {
                    container = containerSingle;
                }
                System.out.print("You've got " + drinksNumTotal + " "
                        + container + " of " + drink + " on the wall.\n");
            } else {
                System.out.print("No more " + containerMultiple + " of "
                        + drink + " on the wall!\n");
            }
        }
    }
}
