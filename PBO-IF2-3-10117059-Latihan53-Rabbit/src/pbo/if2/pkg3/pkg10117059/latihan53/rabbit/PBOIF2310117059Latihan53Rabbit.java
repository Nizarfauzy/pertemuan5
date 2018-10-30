/*
 * NAMA       : Nizar Fauzi Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       program Rabbit.
 */
package pbo.if2.pkg3.pkg10117059.latihan53.rabbit;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit kelinci = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is "+kelinci.getName());
        System.out.println(kelinci.getName()+" is Vegetarian? "+kelinci.isVegetarian());
        System.out.println(kelinci.getName()+" eats "+kelinci.getEats());
        System.out.println(kelinci.getName()+" has "+kelinci.getNoOfLegs()+" legs.");
        System.out.println(kelinci.getName()+" color is "+kelinci.getColor());
    }
    
}
