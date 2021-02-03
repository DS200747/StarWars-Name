
package starwars;

import java.util.Scanner;

public class Starwars {

    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        System.out.println("Find out your StarWars name!");

        System.out.println("What is you first name?");
        String FName = input.next();
        System.out.println("What is your last name?");
        String SName = input.next();
        System.out.println("What is your mother's first name?");
        String MName = input.next();
        System.out.println("What is the name of the town you live in?");
        String Town = input.next();
        
        String FirstStar = SName.substring(0,3)+FName.substring(0, 2);
        String LastStar = MName.substring(0,2)+Town.substring(0,3);
        
        System.out.println("Your StarWars name is: ");
        System.out.println("\u001b[32m"+FirstStar+" "+"\u001b[31m"+LastStar);
        
    }
    
}
