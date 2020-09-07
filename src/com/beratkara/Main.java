package com.beratkara;

import java.util.Scanner;

public class Main {

    /**
     * Class Tanımlamaları
     */
    public static UserInput userInput = new UserInput();
    public static Print print = new Print();

    /**
     * Proje çalıştırıldığında başlayacak fonksiyon
     * String[] args
     */
    public static void main(String[] args) {

        test();//Sonuçları gösteren örnek işlemler

        userInput.uniqueUserInput();//kullanıcıdan inputları alıp benzersiz karakter kontrolü yapan fonksiyon

        userInput.sumUserInput();//kullanıcıdan pozitif tam sayıları alıp toplama işlemini operatörsüz yapan fonksiyon
    }

    /**
     * Test işlemlerinin yapıldığı fonksiyon
     */
    public static void test()
    {
        String text = "1234567890";
        System.out.println("## unique text ##");
        print.uniquePrint(text);//1234567890 tekrar eden karakter olmadığı için unique true geliyor ve yazdırıyorum

        text = "12345167890";
        System.out.println("## non-unique text ##");
        print.uniquePrint(text);//12345167890 tekrar eden 1 karakterini bulup yazdırıyorum

        int a = 3;
        int b = 7;
        print.sumPrint(a, b);//3 ve 7 sayısını hem Integer kütüphanesi hemde logic olarak toplayıp yazdıran fonksiyon

        System.out.println("");
    }





}
