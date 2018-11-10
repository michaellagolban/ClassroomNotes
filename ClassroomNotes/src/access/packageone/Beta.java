/*
 * Clas Beta extends Alpha
 */
package access.packageone;

/**
 *
 * @author Michaela
 */
public class Beta extends Alpha {

    private int privateBetaVariable = 10;
    protected int protectedBetaVariable = 20;
    int packageBetaVariable = 30;
    public int publicBetaVariable = 40;

 public void visibilityInSuperClass(){
 
     //System.out.println("Private member visibility: " + privateAlphaVariable);
     System.out.println("Protected member visibility: " + protectedAlphaVariable);
     System.out.println("Package member visibility: " + packageAlphaVariable);
     System.out.println("Public member visibility: " + publicAlphaVariable);
 } 
    
}
