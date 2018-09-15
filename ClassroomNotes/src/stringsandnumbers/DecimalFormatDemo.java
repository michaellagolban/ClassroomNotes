/*
 * Clasa cu 2 metode
 * 2 parametri
 */
package stringsandnumbers;

import java.text.DecimalFormat;

/**
 *
 * @author Michaela
 */
public class DecimalFormatDemo {
    /**
     * @param args the command line arguments
     */
    
    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    static public void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);
    }
}
