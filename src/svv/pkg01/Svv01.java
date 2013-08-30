/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svv.pkg01;

/**
 *
 * @author MEW
 */
public class Svv01 {

    /**
     * @param args the command line arguments
     */
    public static String checkTriType (int a, int b, int c){
    
        String triTypeString = "";
        
        if(a<=0 || b<=0 || c<=0 || a>b+c || b > a+c || c>a+b){
            triTypeString = "Invalid Triangle !!";
        }
        if(a==b && b==c && a==c){
            triTypeString = "Equilateral Triangle";
        }
        else if(a==b || b==c || a==c){
            triTypeString = "Isosceles Triangle";
        }
        else if(a!=b && b!=c && a!=c){
            triTypeString = "Scalene Triangle";
        }
        
        return triTypeString;
        
       
                
            
        
        // TODO code application logic here
    }
}
