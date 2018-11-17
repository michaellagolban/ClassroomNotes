/*
 * programul creeaza 3 liste de cuvinte 
 * apoi alege la intamplare cate un cuvant din fiecare lista
 * si afiseaza rezultatul.
 */
package personalclassroomnotes;

/**
 *
 * @author Michaela
 */
public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creeaza 3 seturi de cuvinte pentru selectie
        String[] wordListOne = {"24/7","multi-Tier","B-to-B","30,000 Foot","win-win",
            "pervasive","smart","six-sigma","critical-path","dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added","oriented",
            "focused","networked","shared","target","cooperative","aligned"};
        String[] wordListThree = {"process","tipping-point",
            "solution","space","paradigm","mission","leveraged",
            "competency","vision"};
        
        //Afla cate cuvinte sunt in fiecare lista
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        //genereaza trei numere aleatorii
        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);
        
        //Comstruieste o fraza
        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        
        //Si o afiseaza
        System.out.println("What we need is a " + phrase);
    }
    
}
