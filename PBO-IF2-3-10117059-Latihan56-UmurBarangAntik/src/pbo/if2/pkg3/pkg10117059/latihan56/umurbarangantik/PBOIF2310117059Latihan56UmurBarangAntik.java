/*
 * NAMA       : Nizar Fauzi Rymizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Umur Barang Antik.
 */
package pbo.if2.pkg3.pkg10117059.latihan56.umurbarangantik;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        radio.tampilUmur();
  }
}