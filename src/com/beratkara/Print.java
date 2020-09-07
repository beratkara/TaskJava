package com.beratkara;

public class Print {

    /**
     * Verilen task için hazırladığım class
     */
    public static Task task = new Task();

    /**
     * Verilen yazıda tekrar eden karakter varmı kontrolünü yaptıktan sonra yazdıran fonksiyon
     * String text
     */
    public void uniquePrint(String text)
    {
        System.out.println("Text : " + text);
        System.out.println("isUnique ( Map ) : " + task.isUnique(text));
        System.out.println("isUnique ( - ) : " + task.isUniqueCustom(text));
        System.out.println("");
    }

    /**
     * Verilen sayıların aritmetik operatör kullanmadan toplama işlemini yaptıktan sonra yazdıran fonksiyon
     * String text
     */
    public void sumPrint(int a, int b)
    {
        System.out.println("sum ( Integer Library ) : " + task.sum(a,b));
        System.out.println("sum ( Logic ) : " + task.sumLogic(a,b));
        System.out.println("");
    }
}
