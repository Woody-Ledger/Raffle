
package raffle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Raffle {


    public static void main(String[] args) {
            int i = 0;
            int w = 0;
            int ticket = 0;
            int[] win = new int [100]; 
        try{
        
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Hello");
            System.out.println("Input in the number on the raffle ticket");
            ticket = Integer.parseInt(input.readLine());
        }      catch (Exception e) {
        System.out.println("EXCEPTION: ERROR OCCURED");
        }
        switch(ticket){
            case (1):
                w = w + 1;
                break;
            case (2):
                w = w + 1;
                break;
            case (3):
                w = w + 1;
                break;
            case (5):
                w = w + 1;
                break;
            case (7):
                w = w + 1;
                break;
            case (11):
                w = w + 1;
                break;
            case (13):
                w = w + 1;
                break;
            case (17):
                w = w + 1;
                break;
            case (19):
                w = w + 1;
                break;
            case (23):
                w = w + 1;
                break;
            case (29):
                w = w + 1;
                break;
            case (31):
                w = w + 1;
                break;
            case (37):
                w = w + 1;
                break;
            case (41):
                w = w + 1;
                break;
            case (43):
                w = w + 1;
                break;
            case (47):
                w = w + 1;
                break;
            case (53):
                w = w + 1;
                break;
            case (59):
                w = w + 1;
                break;
            case (61):
                w = w + 1;
                break;
            case (67):
                w = w + 1;
                break;
            case (71):
                w = w + 1;
                break;
            case (73):
                w = w + 1;
                break;
            case (79):
                w = w + 1;
                break;
            case (83):
                w = w + 1;
                break;
            case (89):
                w = w + 1;
                break;
            case (91):
                w = w + 1;
                break;
            case (97):
                w = w + 1;
                break;
            default:
                
        }
        switch(w){
            case (1):
            System.out.println("You found a winning ticket!");
            break;
        default:
            System.out.println("Sorry but you didn't have a winning ticket.");
        }
        }

}    


    