/*
 * 5 Write a program that computes your initials from your full name and 
 * displays them.
 */
package stringsandnumbers.homeworkexercices;

/**
 *
 * @author Michaela
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myFirstName = "Mihaela";
        String myLastName = "Golban";
        
        System.out.println("My name is " + myFirstName + " " + myLastName);
        
        char initiala1 = myFirstName.charAt(0);
        char initiala2 = myLastName.charAt(0);
        System.out.println("My initials are: " + initiala1 + ". " + initiala2 + ".");
    }
    
}
