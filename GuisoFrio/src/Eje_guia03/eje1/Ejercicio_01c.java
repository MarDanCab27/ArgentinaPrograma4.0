package Eje_guia03.eje1;

import java.util.Scanner;

public class Ejercicio_01c {
    public static void main(String[] args) {
        int x,sum=0;
        int[] vector = new int[]{5,7,2,8,3,53,12,10};
        Scanner leer = new Scanner(System.in);
        x=leer.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>x){
                sum+=vector[i];
            }
        }
        System.out.println(sum);
    }

}
