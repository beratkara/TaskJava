package com.beratkara;

import java.util.HashMap;
import java.util.Map;

public class Task {

    /**
     * Map yapısını kullanıp benzersiz karakter kontrolü yaptığım fonksiyon
     *
     * String text
     * return boolean
     */
    public boolean isUnique(String text) {

        try{
            Map<Character, Integer> list = new HashMap<Character, Integer>();//map veri yapısını kullandım

            /*
            textin uzunluğunu alıp text içerisindeki karakterleri tek tek alarak list de varmı kontrolü yaptıktan sonra
            yoksa listeye ekledim varsa false dönüp yazı unique değil sonucunu döndürdüm yoksa true döndüm
             */
            for(int i=0; i<text.length(); i++) {
                if(list.get(text.charAt(i)) == null)
                    list.put(text.charAt(i), 1);
                else
                    return false;
            }

            return true;
        }
        catch (Exception e)
        {
            System.out.println("An error occurred isUnique : " + e.getMessage());
            return false;
        }

    }

    /**
     * Map,list vb. yapıları kullanmadan benzersiz karakter kontrolü yaptığım fonksiyon
     *
     * String text
     * return boolean
     */
    public boolean isUniqueCustom(String text) {

        try{
            /*
            Gelen yazının i karakterinden sonraki kısmı substring ile ayırdım ve içerisinde i deki karakter varmı kontrolü yaptım
            varsa yazı false yoksa true döndüm
             */
            for (int i = 0; i < text.length() - 1; i++)
                if (text.substring(i+1,text.length()).contains(text.charAt(i)+""))
                    return false;

            return true;
        }
        catch (Exception e)
        {
            System.out.println("An error occurred isUnique : " + e.getMessage());
            return false;
        }

    }

    /**
     * Toplama işlemini Integer kütüphanesinin sum fonksiyonunu kullanarak yaptığım fonksiyon
     *
     * Integer a
     * Integer b
     * return Integer
     */
    public int sum(int a, int b) {
        try {
            return Integer.sum(a,b);
        }
        catch (Exception e)
        {
            System.out.println("An error occurred while collecting : " + e.getMessage());
            return 0;
        }
    }

    /**
     * Toplama işlemini Logic işlemlerini kullanarak yaptığım fonksiyon
     *
     * Integer a
     * Integer b
     * return int
     */
    public int sumLogic(int a, int b) {
        try{
            if (b == 0) //b sayısı 0 a eşitse a yı döndür
                return a;
            else
                return sumLogic( a ^ b, (a & b) << 1); //a ile b xor lanıp a ya 2 lik tabanda atılıyor , a ve b and operatörü ile 2 lik tabana çevrilip kaydırır
        }
        catch (Exception e)
        {
            System.out.println("An error occurred while collecting : " + e.getMessage());
            return 0;
        }
    }

}
