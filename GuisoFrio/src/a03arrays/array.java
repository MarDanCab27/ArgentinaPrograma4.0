package a03arrays;

import com.sun.org.apache.xpath.internal.objects.XString;

public class array {
    public static void main(String[] args) {
        int [] arraydenumeros = new int[5];
        arraydenumeros[0] = 12;
        arraydenumeros[1] = 22;
        arraydenumeros[2] = 32;
        arraydenumeros[3] = 42;
        arraydenumeros[4] = 52;
        for (int i = 0; i < arraydenumeros.length; i++) {
            System.out.println(arraydenumeros[i]);

        }
        String [] arraydenombres = {"juan","pedro","carlos","tomas","eduardo"};
        for (int i = 0; i < arraydenombres.length; i++) {
            System.out.println(arraydenumeros[i] +")" + arraydenombres[i]);
        }


        String [] arraydenomynum = new String[10];

        for (int i = 0; i < arraydenombres.length; i+=2) {
            arraydenomynum[i] = "" + (arraydenumeros[i]);
            arraydenomynum[i+1] = arraydenombres[i];
         }

    }

}
