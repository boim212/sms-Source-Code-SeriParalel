/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seriparalel;

/**
 *
 * @author Personal
 */
public class SeriParalel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Googling cara perhitungan
        // rangkaian seri dan paralel resistor
        // Buat Perhitungan untuk rSeri
        // Outputkan hasil perhitungan rSeri
        // Buat Perhitungan untuk rParalel
        // Outputkan hasil perhitungan rParalel
        
        //Deklarasi dulu
        double r1, r2, rSeri, RParalel;
        
        //Buat Variabel
        r1 = 4.0;
        r2 = 2.0;
        
        //Perhitungan
        rSeri = r1 + r2;
        RParalel = (r1 * r2) / (r1 + r2);
        //Print
        System.out.print("Diketahui r1 = " + r1);
        System.out.print(" r2 = " + r2);
        System.out.print(" ");
        System.out.print("Ditanya: rSeri, RParalel ?");
        System.out.println("");
        System.out.println("Rseri = r1 + r2 = " +rSeri);
        System.out.println("Rparalel = " +RParalel);
        
    }
}
