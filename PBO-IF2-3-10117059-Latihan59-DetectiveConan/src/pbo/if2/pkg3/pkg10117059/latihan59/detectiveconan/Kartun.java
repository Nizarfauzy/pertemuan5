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
public class Kartun extends Conan {
    private String makanan;
    private String name;
    
    public Kartun(String name,boolean sifat,String Hobby,String makanan) {
        super(sifat,Hobby);
        this.name=name;
        this.sifat=sifat;
        this.Hobby=Hobby;
        this.makanan=makanan;
    
    }

    public String getMakanan() {
        return makanan;
    }

    public String getName() {
        return name;
    }
 }