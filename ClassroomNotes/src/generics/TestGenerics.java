/*
 * Java program to test Generics
 */
package generics;

/**
 *
 * @author Michaela
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // create a box for Integers
        GenericBox<Integer> boxForInteger = new GenericBox<>();
        Integer value = 5;
        boxForInteger.setContent(value);
        
        System.out.println("Box for Integer contains: " + boxForInteger.getContent().toString());
        
        //Create a box for String
        GenericBox<String> boxForString = new GenericBox<>();
        String message= "Hello Java 9 collegues";
        boxForString.setContent(message);
        
        System.out.println("Box for String contains: " + boxForString.getContent());
        
        //Create a box for viezure
        GenericBox<Viezure> boxForViezure = new GenericBox<>();
        Viezure viezurelePrim= new Viezure();
        boxForViezure.setContent(viezurelePrim);
       
        System.out.println("Box for Viezure contains: " + boxForViezure.getContent().getNumarPicioareViezure());
        
    }
    
}
