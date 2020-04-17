import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryWordListing {
    public static void main(String[] args){
        /*
        Dictionary Word Listing:
        1. initialize string array of length 10
        2. take user inputs to populate the array using a for loop
        3. use an if statement in a for loop to compare each string
        to one another.
        4. put the for loop in a for loop to repeat process enough times.

         */
        Scanner scn = new Scanner(System.in);
        String original[] = new String [10];
        //for loop + user prompt to populate array "original".
        System.out.println("Enter 10 different words to be sorted alphabetically: ");
        for (int i=0; i < 10; i++){
            original[i] = scn.nextLine();
        }
        //print out original entries.
        System.out.println("Entries: "+Arrays.toString(original));
        //for loop within a for loop to repeat the inside for loop
        //as many times as necessary to finish.
        String temp = "";
        for (int i=0; i<10; i++){
            for (int x=i+1; x<10; x++){
                if (original[i].compareTo(original[x])>0) {
                    //if 2 strings need to be swapped, assign the value of
                    //'index[1]' to a temporary variable 'temp' to hold. Then put the value
                    //of the other index 'index[2]' into the first index. Then assign the
                    //original index(now in the temporary variable) to the other index.
                    temp = original[i];
                    original[i] = original[x];
                    original[x] = temp;

                }
            }
        }
        //Print of ordered array
        System.out.println("A to Z: "+Arrays.toString(original));
        //Now to arrange the array in reverse alphabetical order
        //change the '>' in "if (original[i].compareTo(original[x])>0)
        //to a '<'.
        for (int i=0; i<10; i++){
            for (int x=i+1; x<10; x++){
                if (original[i].compareTo(original[x])<0) {
                    temp = original[i];
                    original[i] = original[x];
                    original[x] = temp;

                }
            }
        }
        System.out.println("Z to A: "+Arrays.toString(original));


    }
}
