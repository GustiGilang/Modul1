import java.util.Locale;

public class main {
    public static void main (String[]args){

        String namaDepan = "Gusti";
        String namaTengah = "Gilang";
        String namaBelakang = "Haifa Fadillah";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println (namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan + namaTengah + namaBelakang;
        System.out.println (namaLengkap);
        System.out.println (namaLengkap.length());
        System.out.println (namaLengkap.indexOf("lang"));
        System.out.println (namaLengkap.substring(17));
        System.out.println (namaLengkap.substring(5,11));
        System.out.println (namaLengkap.replace("Gilang","Iyang"));
        System.out.println (namaLengkap.toLowerCase());
        System.out.println (namaLengkap.toUpperCase());
        System.out.println (namaLengkap.length());
        System.out.println (namaLengkap.charAt(0));

        String[] namaArray = namaLengkap.split(" ");

        for (String nama : namaArray)
            System.out.println(nama);

    }
}
