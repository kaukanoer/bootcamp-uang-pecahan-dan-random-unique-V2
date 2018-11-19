package perhitungan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kalkulasi {
    
    static String randomAngka(int panjangData) {
        ArrayList<Integer> angka = new ArrayList<>(); 
        ArrayList<Integer> shuffle = new ArrayList<>();
        for (int element = 0; element <= 9; element++) {
            angka.add(element);
        }
        Collections.shuffle(angka); 
        for (int count = 0; count < panjangData; count++) {
            shuffle.add(angka.get(count));
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = shuffle.size() - 1; i >= 0; i--) {
          int num = shuffle.get(i);
          sb.append(num);
        }
        String result = sb.toString();
        return result;
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
    
    public static void main(String[] args) {
        Kalkulasi panggil = new Kalkulasi();
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Masukkan panjang data: ");
            int masukAngka = s.nextInt();
            if (masukAngka >= 11) 
            {
                System.err.println("Angka maksimal adalah 10");
            } else 
            {
                System.out.println(panggil.randomAngka(masukAngka));   
            }
        } while (true);
    
        Scanner s = new Scanner(System.in);  
        System.out.print("Masukkan sejumlah uang: ");
        panggil.hitungPecahan(s.nextInt());
    }
}
