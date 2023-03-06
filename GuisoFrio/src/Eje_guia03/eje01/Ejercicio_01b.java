package Eje_guia03.eje01;

public class Ejercicio_01b {
    public static void main(String[] args) {
        int n0 = 4, n1 = 2, n2 = 15, aux,max;
        boolean orden = true;
        int[] ordenado= new int[]{n0,n1,n2};


        for (int i = 0; i < ordenado.length; i++) {
            max=i;
            for (int j = i  +1; j < ordenado.length; j++) {
                if (ordenado[j] < ordenado[i]){
                    max=j;
                }
            }
            aux=ordenado[i];
            ordenado[i]=ordenado[max];
            ordenado[max]=aux;
        }
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(ordenado[i]);

        }
    }
}
