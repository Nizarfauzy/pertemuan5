/*
 * NAMA       : Nizar Fauzy R
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Bicycle.
 */
package pbo.if2.pkg3.pkg10117059.latihan57.vehicle;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        System.out.println("");
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLeght(54.5);
        System.out.println("Brand : "+skate.getMyBrand());
        System.out.println("Model : "+skate.getMyModel());
        System.out.println("Panjangnya Board : "+skate.getMyBoardLeght());
    }
    
}
