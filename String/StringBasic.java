import java.util.*;
public class StringBasic {
    public static void main(String[] args) {
        // declaration
        String name = "Tony";

        //taking input
        // Scanner sc = new Scanner(System.in);
        // name = sc.next();

        // concatenation

        String firstName = "Tony";
        String secondName = "Stark";
    
        String fullName = firstName+secondName;
        System.out.println(fullName);

        // print length of a string
        String fName = "Tony";
        String sName = "Stark";
    
        String fulName = firstName + " " + sName;
        System.out.println(fulName);
        System.out.println(fulName.length());

        // Access Character of a string
        for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
        }

        String name1 = "Tony";
        String name2 = "Tony";
    
        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
    
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
    
        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // substring
        String name3 = "TonyStark";
        System.out.println(name3.substring(0, 4));
    }
}
