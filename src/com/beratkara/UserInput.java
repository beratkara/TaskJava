package com.beratkara;

import java.util.Scanner;

public class UserInput {

    /**
     * Fonksiyonların sonuçlarını ekrana yazdırmak için kullandığım class
     */
    public static Print print = new Print();

    /**
     * Kullanıcıdan yazıyı alıp gerekli işlemleri yaptırdığım fonksiyon
     */
    public void uniqueUserInput()
    {
        Scanner input = new Scanner(System.in);//kullanıcıdan input alma işlemi için kullanılan kütüphane

        System.out.print("Enter a text : ");
        String text = input.nextLine();//kullanıcının girdiği texti aldım

        System.out.println("## unique check from user input ##");

        print.uniquePrint(text);//uniquePrint fonksiyonuna aldığım texti parametre olarak verdim

        System.out.println("");
    }

    /**
     * Kullanıcıdan sayıları alıp gerekli işlemleri yaptırdığım fonksiyon
     */
    public void sumUserInput()
    {
        Scanner input = new Scanner(System.in);//kullanıcıdan input alma işlemi için kullanılan kütüphane

        int a, b;

        System.out.print("Enter the first number : ");

        while (!input.hasNextInt()) {//girilen sayımı değilmi kontrolü yaptım
            System.out.println("Entered data is not numbers!");
            System.out.print("Enter the first number : ");
            input.next();
        }

        a = input.nextInt();//kullanıcıdan a sayısını aldım

        System.out.print("Enter the second number : ");

        while (!input.hasNextInt()) {
            System.out.println("Entered data is not numbers!");
            System.out.print("Enter the second number : ");
            input.next();
        }

        b = input.nextInt();//kullanıcıdan b sayısını aldım

        if(a <= 0 || b <= 0){//kullanıcıdan pozitif tam sayı girmesini bekliyoruz
            System.out.println("Please enter a positive integer !");
            System.out.println("");

            sumUserInput();//Hatalı veri girdiği için tekrar çalıştırdık input alma işlemini
        }
        else
        {
            System.out.println("## sum process from user input ##");

            print.sumPrint(a, b);//Toplama işlemini yapmak için sumPrint fonksiyonuna parametre olarak a sayısını ve b sayısı verdim

            System.out.println("");
        }
    }
}
