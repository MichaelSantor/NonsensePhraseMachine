package nonsensephrasemachine;

public class NonsensePhraseMachine {

    public static void main(String[] args) {
    /* This program creates a random statement */
       /* Create three String arrays with random words */
       String[] wordListOne = {"behavior", "well-to-do", "stitch", "stingy", "joyous", "wiry", "brake", "faint", "obsolete", "heavy", "cake", "trains"};
       String[] wordListTwo = {"damage", "agree", "cave", "stamp", "equal", "glass", "ring", "soup"};
       String[] wordListThree = {"math", "science", "history", "geography", "language", "school", "art"};
       
       /* Determine the length of each array */
       int oneLength = wordListOne.length;
       int twoLength = wordListTwo.length;
       int threeLength = wordListThree.length;
       
       /* Create an int "x" to use in for loop; loop 5 times */
       for(int x = 0; x < 5; x = x + 1){
       
       /* Create a random number associated with each String array using the length of the String arrays themselves */
       int rand1 = (int) (Math.random() * oneLength);
       int rand2 = (int) (Math.random() * twoLength);
       int rand3 = (int) (Math.random() * threeLength);
       
       /* Create a random phrase by selecting one word from each String array randomely using the random numbers generated above */
       String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
       /* Print out the phrase*/
       System.out.println(phrase);
       }
    }
}
