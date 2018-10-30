/*
 * NAMA       : Nizar Fauzi Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       program Koordinat.
 */
package pbo.if2.pkg3.pkg10117059.latihan54.koordinat;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan54Koordinat {
    private static Object Kordinat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat kordinat = new WarnaKoordinat(0,0,"");
        kordinat.setNamaWarna("Jingga");
        kordinat.setX(10);
        kordinat.setY(4);
        System.out.println("Warna Koordinat "+kordinat.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+kordinat.getX()+", y : "+kordinat.getY());
    }
    
}
