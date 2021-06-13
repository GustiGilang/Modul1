package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args){
        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630321";
        mahasiswa.nama = "GustiGilangHaifaFadillah";
        mahasiswa.tanggallahir = new Date();

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggallahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630123";
        mahasiswa2.nama = "GustiGhithaHaifaFadillah";
        mahasiswa2.tanggallahir = new Date();

        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("Tanggal Lahir \t : " + mahasiswa2.tanggallahir);
    }
    }
}
