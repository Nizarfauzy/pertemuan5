/*
 * NAMA       : Nizar Fauzy Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Nama
 */
package pbo.if2.pkg3.pkg10117059.latihan52.siapakamu;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Oktavian Triwinata Putra");
        mhs.setKelas("IF-2");
        mhs.setNim("10117053");
        mhs.setUmur(19);
        System.out.println("NIM MAHASISWA "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
