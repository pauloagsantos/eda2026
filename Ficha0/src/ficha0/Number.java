package ficha0;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IPT
 */
public class Number extends Object implements Comparable{
    
    int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Number{" + "n=" + n + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Number other = (Number) obj;
        return this.n == other.n;
    }

    @Override
    public int compareTo(Object o) {
        if (n<((Number)o).n) return -1;
        else if (n>((Number)o).n) return 1;
        else return 0;
    }
    
    
    
}
