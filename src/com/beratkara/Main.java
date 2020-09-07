package com.beratkara;

public class Main {

    /**
     * Class Tanımlamaları
     */
    public static UserInput userInput = new UserInput();

    /**
     * Proje çalıştırıldığında başlayacak fonksiyon
     * String[] args
     */
    public static void main(String[] args) {

        userInput.uniqueUserInput();//kullanıcıdan inputları alıp benzersiz karakter kontrolü yapan fonksiyon

        userInput.sumUserInput();//kullanıcıdan pozitif tam sayıları alıp toplama işlemini operatörsüz yapan fonksiyon
    }

}
