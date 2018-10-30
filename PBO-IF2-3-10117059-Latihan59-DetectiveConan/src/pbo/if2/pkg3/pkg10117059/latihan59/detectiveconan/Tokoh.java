/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan59.detectiveconan;

/**
 *
 * @author kitttyyyy
 */
public class Tokoh {
      protected String nama;
    protected String sifat;
    protected String makanan;
    
    public Tokoh(String nama, String sifat, String makanan){
        this.nama=nama;
        this.sifat=sifat;
        this.makanan=makanan;
}
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("sifat : "+sifat);  
}
}
