/*
 * Ttry to open a file
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Michaela
 */
public class OpenFileBuffer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader r; 
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\Michaela\\Desktop\\1.txt"));
            try { 
              String firstLine = r.readLine();
              System.out.println("Am citit din fisier: "+ firstLine);
            } catch (IOException ex) {
                //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Exceptia contine mesajul: "+ex.getMessage());
            } finally { 
                try { 
                    r.close();
                } catch (IOException ex) {
                    //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Exceptia a dat mesajul: "+ ex.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exceptia are mesajul:"+ex.getMessage());
        }
        

    }
    
}