/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan56.umurbarangantik;

/**
 *
 * @author kitttyyyy
 */
public class Radio extends BarangAntik {
     private String name;

    public Radio(int umur) {
        super(umur);
        this.umur=umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}