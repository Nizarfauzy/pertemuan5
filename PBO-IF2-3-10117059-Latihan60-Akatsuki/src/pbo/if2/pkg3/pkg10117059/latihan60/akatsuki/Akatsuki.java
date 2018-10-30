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
public class Akatsuki {
   protected String nama;
    protected String asalDesa;
    protected String pasangan;
    protected String jurus;
    
    
    public Akatsuki(String nam, String asalDesa, String pasangan, String jurus){
        this.nama=nam;
        this.asalDesa=asalDesa;
        this.pasangan=pasangan;
        this.jurus=jurus;
        
}

    public String getNama() {
        return nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public String getPasangan() {
        return pasangan;
    }

    public String getJurus() {
        return jurus;
    }
    
    
    public void tampil(){
        System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        
    }
    
    public void jurus(){
        System.out.println(nama+" Memiliki Jurus : ");  
 }
}