import java.util.Scanner;
import java.util.Random;
public class guessgame{
    public  static void main(String[] args){
        System.out.println("enter your first guess");
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = 0;
        while(true){
            Scanner scan = new Scanner(System.in);
            int guess;
            guess = scan.nextInt();    
                //Scanner scan2 = new Scanner(System.in); 
                //guess = scan2.nextInt();
                if(guess < x){
                    System.out.println("too low! L!");
                    y += 1;
                }else if(guess > x){
                    System.out.println("Too HIGH!!!");
                    y += 1;
                }else if(guess == x){
                    System.out.println("CORRECT!");
                    y += 1;
                    break; 
                }      
        }
        System.out.println("YOU GOT IT IN " + y + " TRIES!");
        if(y <= 7){
            System.out.println("You got an Impossible Sore!");

        }else if(y <= 10){
            System.out.println("You did a great job!");

        }else{
            System.out.println("Try the divide and conquer strategy next time!");

        }
    }
}