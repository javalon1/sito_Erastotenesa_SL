package com.sda.sito.erastotenesa;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Eratotenes (200);
        {
            int k = 2;
            while (k < 200) ;
            {
                int licznik = 0;


                for (int i = 2; i < k; i++) {
                    if (k % i == 0) {
                        licznik++;
                    }
                }
                if (licznik == 0) {
                    System.out.println(k + "jest liczba pierwsza");
                } else {
                    System.out.println(k + "nie jest liczba pierwsza");
                }
                k++;
            }
        }
    }
}



