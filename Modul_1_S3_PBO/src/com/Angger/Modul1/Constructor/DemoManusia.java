package com.Angger.Modul1.Constructor;

import java.util.jar.Manifest;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia(); //Constructur pertama
        manusia1.setNama("Ruby");
        manusia1.setUmur(19);

        Manusia manusia2 = new Manusia("Jamal"); //Constructur kedua
        Manusia manusia3 = new Manusia("Raizel", 21);//Constructur ketiga

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for(Manusia x : arrayManusia){
            System.out.println("Character ");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
