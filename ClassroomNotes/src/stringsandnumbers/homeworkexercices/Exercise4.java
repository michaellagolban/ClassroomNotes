/*
 * 4 Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
 * String hi = "Hi, ";
 * String mom = "mom.";
 */
package stringsandnumbers.homeworkexercices;

/**
 *
 * @author Michaela
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hi = "Hi,";
        String mom = "mom.";
        
        //1 way to concatinate
        String greetMom = hi + " " + mom;
        System.out.println(greetMom);
        
        //2 way to concatinate
        StringBuilder sb = new StringBuilder(10);
        sb.append(hi).append(" ").append(mom);
        System.out.println(sb.toString());
            
    }
    
}
