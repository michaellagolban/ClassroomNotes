/*
 * 2. Consider the following string:
 * String hannah = "Did Hannah see bees? Hannah did.";
 * a What is the value displayed by the expression hannah.length()?
 * b What is the value returned by the method call hannah.charAt(12)?
 * c Write an expression that refers to the letter b in the string referred to by hannah.
 */
package stringsandnumbers.homeworkexercices;

/**
 *
 * @author Michaela
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah);

        //What is the value displayed by the expression hannah.length()?
        int lungime = hannah.length();
        System.out.println(lungime);

        //What is the value returned by the method call hannah.charAt(12)?
        char pozitie = hannah.charAt(12);
        System.out.println(pozitie);

        //Write an expression that refers to the letter b in the string referred to by hannah.
        char pozitieLetterB = hannah.charAt(15);
        System.out.println(pozitieLetterB);

    }

}
