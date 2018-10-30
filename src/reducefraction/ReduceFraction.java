/*
 * Jared Craig
 * 24/10/2018
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n1, n2,n3,n4, ans;
          String Num = JOptionPane.showInputDialog("Enter the numerator for your fraction"); 
          String Den = JOptionPane.showInputDialog("Enter the denonimator for your fraction"); 
int Num1 = Integer.parseInt(Num);
    int Den1 = Integer.parseInt(Den);
    n1  = Num1;
    n2 = Den1;
    ans = gcd(n1, n2);
    n3 = n1/ans;
    n4 = n2/ans;
  
    System.out.println("The fraction " + n1 + "/" + n2 + " can be reduced to " + n3 + "/" + n4);
  }

  public static int gcd(int a, int b){
    if(b == 0) {
      return a;
    }
    else {
      //% is modulus, also known as the remainder function
      return gcd(b, a%b);
    }
    }
    
}
