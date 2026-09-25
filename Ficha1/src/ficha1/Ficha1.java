/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha1;

/**
 *
 * @author IPT
 */
public class Ficha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Math.factorialBigI(0);
        // TODO code application logic here
        for(int i = 1000; i <= 20000; i+=1000) {
            System.out.println(i+"! takes " + runXTimesFactorialI(10, i));
        }
        System.out.println("---------------------");
        for(int i = 1000; i <= 20000; i+=1000) {
            System.out.println(i+" takes " + runXTimesFactorialR(10, i));
        }
    }
    
    public static long runXTimesFactorialI(int x, int number) {
        long sum=0;
        for(int i = 0; i < x; i++) {
            long start = System.nanoTime();
            Math.factorialBigI(number);
            long end = System.nanoTime();
            sum += end-start;
        }
        return sum/x;
    }
    
    public static long runXTimesFactorialR(int x, int number) {
        long sum=0;
        for(int i = 0; i < x; i++) {
            long start = System.nanoTime();
            Math.factorialBigR(number);
            long end = System.nanoTime();
            sum += end-start;
        }
        return sum/x;
    }
}

