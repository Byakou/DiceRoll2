import java.text.DecimalFormat;
import java.util.*;

public class DiceRoll2 {

    //creating method
    public static void diceRoll(int n){
        //formatting a decimal placement
        DecimalFormat w = new DecimalFormat(".00");
        //initializing var
        int i = 0, face_1 = 0, face_2 = 0, face_3 = 0, face_4 = 0, face_5 = 0, face_6 = 0;

        /*
           creating loop to generate numbers and adding respective
           numbers to each face value

           could also use for loop, but professor clarified a while
           loop to be used for some reason
         */
        while(i < n){
            int rand = (int)(Math.random() * 6 + 1);
            if(rand == 1)
                face_1++;
            else if(rand == 2)
                face_2++;
            else if(rand == 3)
                face_3++;
            else if(rand == 4)
                face_4++;
            else if(rand == 5)
                face_5++;
            else
                face_6++;
            i++;
        }

        //having the system print out the values
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("[When the NUMBER_OF_ROLL is " + n + "]");
        System.out.println("Occurrence of each face is\n1: 2: 3: 4: 5: 6:");
        System.out.println(face_1 + ", " + face_2 + ", " + face_3 + ", " + face_4 + ", " + face_5 + ", " + face_6 +
                ": " + (double)n);
        System.out.println();
        System.out.println("Therefore the probability of each face is");
        System.out.println(w.format((double)face_1/n) + ", " + w.format((double)face_2/n) + ", " +
                w.format((double)face_3/n) + ", " + w.format((double)face_4/n) + ", " +
                w.format((double)face_5/n) + ", " + w.format((double)face_6/n));
    }
    public static void main(String[] args) {
        //inputting a scanner
        Scanner a = new Scanner(System.in);
        //invoking a user input
        System.out.println("How many times do you want the dice to roll?");
        diceRoll(a.nextInt());
    }
}
