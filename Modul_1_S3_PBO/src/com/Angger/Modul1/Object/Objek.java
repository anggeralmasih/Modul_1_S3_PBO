package com.Angger.Modul1.Object;

public class Objek {

    public static void main(String[] args) {

        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Angger");
        mahasiswaTanpa.setNim(19104073);

        System.out.println("Mahasiwa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());


        //Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 1234567);

        System.out.println("Mahasiwa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());

    }
}
