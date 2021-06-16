package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] dersler = {"Matematik","Fizik","Kimya","Türkçe","Tarih","Müzik"};
        int[] notlar = new int[dersler.length];


        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i<dersler.length;i++){
            System.out.println(dersler[i]+ " İçin Notunu Gir ");
            notlar[i] = scanner.nextInt();
        }
        int notToplam=0;
        for (int not:notlar
        ) {
            notToplam = not+notToplam;
        }
        if (notToplam/dersler.length >= 50){
            System.out.println("Ders Ortalamanız : " + notToplam/ dersler.length+ " Geçtiniz !");
        }else
            System.out.println("Ders Ortalamanız : " + notToplam/ dersler.length+ " Kaldınız !");





    }


}
