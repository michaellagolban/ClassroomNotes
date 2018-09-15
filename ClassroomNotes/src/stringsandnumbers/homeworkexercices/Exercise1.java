/*
 * 1 What is the initial capacity of the following string builder?
 * StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
 */
package stringsandnumbers.homeworkexercices;

/**
 *
 * @author Michaela
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Able was I ere I saw Elba.");
        System.out.println(sb);
        int lungime = sb.length();
        System.out.println(lungime);
    }

}
