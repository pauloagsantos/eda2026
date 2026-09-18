/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author IPT
 */
public class Ficha0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object n1 = new Number(2);
        Object n2 = new Number(2);
        
        if (n1.equals(n2))
            System.out.println("equals");
        else
            System.out.println("not equals");
        
        Number a[] = new Number[4];
        a[0] = new Number(5);
        a[1] = new Number(2);
        a[2] = new Number(1);
        a[3] = new Number(3);
        
        
        
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        
        
    }
    
    
}
