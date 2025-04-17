import java.util.Random;
import java.util.Scanner;

public class Rpsgame{
    public static void main(String[] args){

        int rock=1;
        int paper=2;
        int scissors=3;

        Scanner sc=new Scanner(System.in);
        Random rn=new Random();

        System.out.println("Choose: rock=1, paper=2, scissors=3");

         int userNumber=sc.nextInt();

         int computorNumber =rn.nextInt(3) + 1; // computor picks rock, paper or scissors

        System.out.println("Computor picks "+computorNumber+" you picked "+userNumber);

         if(userNumber==computorNumber){
              System.out.println("Tie");
          }
         else if  (userNumber == rock && computorNumber == scissors){
          System.out.println("Your the Winner!!!");
          
         }
         else if  (userNumber == paper && computorNumber == rock){
          System.out.println("Your the Winner!!!");
          
         }
         else if  (userNumber == scissors && computorNumber == paper){
          System.out.println("Your the Winner!!!");
         
         }
         else{
          System.out.println("You lost");
          
         }
         
    }
}