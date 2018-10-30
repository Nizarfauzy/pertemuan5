/*
 * NAMA       : Nizar Fauzi Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       data Handphone.
 */
package pbo.if2.pkg3.pkg10117059.latihan55.handphone;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android andro = new Android("Xiaomi","Android","Redmi 6X",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        Blackberry bb = new Blackberry("Blackberry","BB10","Onyx",2000000);
        bb.setPinBB("ZH455HTT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Microsoft","Windows Phone 10","RM 1090",3500000);
        wp.setWpKeyStore("AX55SB");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
    }
    
}
