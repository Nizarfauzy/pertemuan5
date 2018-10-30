/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan60.akatsuki;

/**
 *
 * @author kitttyyyy
 */
public class Ketua extends Akatsuki {
    private String kekuatanKhusus  ;

    public Ketua(String nama, String asalDesa, String pasangan, String jurus, String kekuatanKhusus) {
        super(nama, asalDesa, pasangan, jurus);
        this.kekuatanKhusus=kekuatanKhusus;
    }

    @Override
    public void tampil() {
        System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        System.out.println("Kekuatan Khusus : "+kekuatanKhusus);
    }
    

    public String getKekuatanKhusus() {
        return kekuatanKhusus;
    }
}