package perhitungan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kalkulasi {
    
    static void randomAngka(int panjangData) {
        ArrayList<Integer> angka = new ArrayList<>();
        for (int element = 0; element <= 9; element++) {
            angka.add(element);
        }
        Collections.shuffle(angka);
        int count;
        for (count = 0; count < panjangData; count++) {
            System.out.print(angka.get(count));            
        }
        System.out.println("");
    }
    //Optimalisasi metod untuk menghitung pecahan, menggunakan array
    static void hitungPecahan(int inputUang) {
        int[] uangPecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50};
        int[] counterUangPecahan = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < uangPecahan.length; i++) {
            while (inputUang >= uangPecahan[i]) {
                inputUang -= uangPecahan[i];
                counterUangPecahan[i]++;
            }
        }
        for (int i = 0; i < uangPecahan.length; i++) {
            if (counterUangPecahan[i] != 0) {
                System.out.println(uangPecahan[i] + ": " + counterUangPecahan[i]);
            }
        }
    }    
    // metod uang pecahan lama
//    static void hitungUang(int inputUang) {        
//        int seratusRibu = 0;
//        int limaPuluh = 0;
//        int duaPuluh = 0;
//        int sepuluh = 0;
//        int limaRibu = 0;
//        int duaRibu = 0;
//        int seribu = 0;
//        int limaRatus = 0;
//        int duaRatus = 0;
//        int seratus = 0;
//        int limaPuluhPerak = 0;
//        
//        while (inputUang > 49) {
//            if (inputUang >= 100000) {
//                inputUang -= 100000;
//                seratusRibu++;
//            } else if (inputUang >= 50000) {
//                inputUang -= 50000;
//                limaPuluh++;
//            } else if (inputUang >= 20000) {
//                inputUang -= 20000;
//                duaPuluh++;
//            } else if (inputUang >= 10000) {
//                inputUang -= 10000;
//                sepuluh++;
//            } else if (inputUang >= 5000) {
//                inputUang -= 5000;
//                limaRibu++;
//            } else if (inputUang >= 2000) {
//                inputUang -= 2000;
//                duaRibu++;
//            } else if (inputUang >= 1000) {
//                inputUang -= 1000;
//                seribu++;
//            } else if (inputUang >= 500) {
//                inputUang -= 500;
//                limaRatus++;
//            } else if (inputUang >= 200) {
//                inputUang -= 200;
//                duaRatus++;
//            } else if (inputUang >= 100) {
//                inputUang -= 100;
//                seratus++;
//            } else if (inputUang >= 50) {
//                inputUang -= 50;
//                limaPuluhPerak++;
//            } else {
//                System.out.println("sisa: " + inputUang);
//            }
//        }
//        
//        System.out.println("Uang Pecahan: ");
//        if (seratusRibu != 0) {
//            System.out.println("100.000 " + seratusRibu);
//        }
//        if (limaPuluh != 0) {
//            System.out.println("50.000 \t" + limaPuluh);
//            
//        }
//        if (duaPuluh != 0) {
//            System.out.println("20.000 \t" + duaPuluh);
//            
//        }
//        if (sepuluh != 0) {
//            System.out.println("10.000 \t" + sepuluh);
//            
//        }
//        if (limaRibu != 0) {
//            System.out.println("5.000 \t" + limaRibu);
//            
//        }
//        if (duaRibu != 0) {
//            System.out.println("2.000 \t" + duaRibu);
//            
//        }
//        if (seribu != 0) {
//            System.out.println("1.000 \t" + seribu);
//            
//        }
//        if (limaRatus != 0) {
//            System.out.println("500 \t" + limaRatus);
//            
//        }
//        if (duaRatus != 0) {
//            System.out.println("200 \t" + duaRatus);
//            
//        }
//        if (seratus != 0) {
//            System.out.println("100 \t" + seratus);
//        }
//        if (limaPuluhPerak != 0) {
//            System.out.println("50 \t" + limaPuluhPerak);
//        }
//        if (inputUang != 0) {
//            System.out.println("Sisa:" + inputUang);
//        }
//        
//    }
    
    public static void main(String[] args) {
        Kalkulasi panggil = new Kalkulasi();
//        Boolean ulangi = false;
//        do {
//            
//            int masukAngka = s.nextInt();
//            if (masukAngka >= 11) {
//                System.err.println("Angka maksimal adalah 10");
//                ulangi = true;
//            } else {
//                panggil.randomAngka(masukAngka);
//
//            }
//        } while (ulangi = true);

//        System.out.print("Masukkan sejumlah uang: ");
//        panggil.hitungUang(s.nextInt());
        Scanner s = new Scanner(System.in);  
        System.out.print("Masukkan sejumlah uang: ");
        panggil.hitungPecahan(s.nextInt());
    }
}
