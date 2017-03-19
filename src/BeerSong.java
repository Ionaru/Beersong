public class BeerSong {

    public static void main(String[] args) {
        // Settings for the song
        final int songRuns = 1;

        final int totalDrinksOnTheWall = 99;
        final int numberOfDrinksToTake = 1;

        final String containerSingle = "bottle";
        final String containerMultiple = "bottles";
        final String drinkName = "beer";

        // Song data
        String container = containerMultiple;
        String pronoun;
        int drinksLeft = totalDrinksOnTheWall;
        int runsLeft = songRuns;
        int drinksToTake;

        while (runsLeft > 0) {

            while (drinksLeft > 0) {

                System.out.print('\n');

                if (drinksLeft == 1) {
                    container = containerSingle;
                }

                System.out.print(drinksLeft + " " + container + " of " + drinkName + " on the wall, ");
                System.out.print(drinksLeft + " " + container + " of " + drinkName + ".\n");

                drinksToTake = numberOfDrinksToTake;
                if (numberOfDrinksToTake > drinksLeft) {
                    drinksToTake = drinksLeft;
                }

                System.out.print("Take " + drinksToTake + " down");

                if (drinksToTake > 1) {
                    pronoun = "them";
                } else {
                    pronoun = "it";
                }

                System.out.print(" and pass " + pronoun + " around, ");
                drinksLeft = drinksLeft - drinksToTake;

                if (drinksLeft > 0) {
                    if (drinksLeft == 1) {
                        container = containerSingle;
                    }
                    System.out.print(drinksLeft + " " + container + " of " + drinkName + " on the wall.\n");
                } else {
                    System.out.print("no more " + containerMultiple + " of " + drinkName + " on the wall.\n");
                }
            }
            runsLeft--;

            if (runsLeft > 0) {
                System.out.print('\n');
                System.out.print("No more " + containerMultiple + " of " + drinkName + " on the wall, " +
                        "no more + " + containerMultiple + " of " + drinkName + ".\n");

                drinksLeft = totalDrinksOnTheWall;

                System.out.print("Go to the store and buy some more, " +
                        "" + drinksLeft + " " + container + " of " + drinkName + " on the wall.\n");
            }

        }
    }
}
