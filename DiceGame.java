import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int D1=rnd.nextInt(5)+1;
        int D2=rnd.nextInt(5)+1;
        
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
        System.out.println("Rolling dice...");
        System.out.println("Die 1:"+D1);
        System.out.println("Die 2:"+D2);
        System.out.println("Total Value:"+(D1+D2));
        if((D1+D2)>7){
            System.out.println(name+" won");
        }
        else System.out.println(name+" lose");
    }
}
