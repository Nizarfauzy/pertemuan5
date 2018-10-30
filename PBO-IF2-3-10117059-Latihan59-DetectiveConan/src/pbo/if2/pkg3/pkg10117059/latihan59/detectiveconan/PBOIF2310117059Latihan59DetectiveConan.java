/*
 * NAMA       : Nizar Fauzy Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Tokoh.
 */
package pbo.if2.pkg3.pkg10117059.latihan59.detectiveconan;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Kartun mnc = new Kartun("Conan Edogawa",false,"mancing","Sushi");
        System.out.println("Nama Saya Adalah "+ mnc.getName());
        System.out.println(mnc.getName()+" Sifat Saya tidak mudah menyerah "+ mnc.isSifat());
        System.out.println(mnc.getName()+ " Hobby saya adalah "+ mnc.Hobby);
        System.out.println(mnc.getName()+" Makanan Kesukaan "+mnc.getMakanan());
    }
    
}
