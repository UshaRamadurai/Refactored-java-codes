package JavaDay1Assignments;
//Goal : Code to find the given character is lowercase or uppercase

import java.util.Scanner;

public class FindLowerOrUpperCase {

    public void findCaseOfCharacter(){

        //getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character between a-z/A-Z");
        char character = sc.next().charAt(0);

        //providing condition to find if it is a lowercase or not
          if (character>='a' && character<='z')
            System.out.println("The character is Lowercase");
       else if(character>='A' && character<='Z')
            System.out.println("The character is Uppercase");
        else
              System.out.println("It is not a character");

    }

    public static void main(String[] args) {
        FindLowerOrUpperCase obj = new FindLowerOrUpperCase();
        obj.findCaseOfCharacter();
    }
}
