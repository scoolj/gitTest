// programmer :Scoolj, Oluwajuwonlo
// course :java
// Student grade calculation
import java.util.Scanner;

public class gitW {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Please enter first number :" );
        int number1 = input.nextInt();

        System.out.print("Please enter second number:" );
        int number2 = input.nextInt();
     
    if (number1 > number2) {
            System.out.println(" first person is the Oldest");
    }
    else if ( number2 > number1 ) {
            System.out.println("second person is the Youngest");
         }

    else{ 
            System.out.println(" You're both mate");
    }
    }
}
