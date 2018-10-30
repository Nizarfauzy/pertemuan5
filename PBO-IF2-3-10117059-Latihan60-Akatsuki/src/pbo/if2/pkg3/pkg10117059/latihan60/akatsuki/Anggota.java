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
public class Anggota extends Akatsuki {
    private String buruan;

    public Anggota(String nam, String asalDesa, String pasangan, String jurus, String buruan) {
        super(nam, asalDesa, pasangan, jurus);
        this.buruan=buruan;        
    }

    public String getBuruan() {
        return buruan;
    }

    @Override
    public void tampil() {
         System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        System.out.println("Target Buruan : "+buruan);
    }
}