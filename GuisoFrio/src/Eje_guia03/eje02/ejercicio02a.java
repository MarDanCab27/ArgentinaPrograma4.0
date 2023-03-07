package Eje_guia03.eje02;

public class ejercicio02a {
    public static void main(String[] args) {
        String prueba = "hola que tal", mostrarC, mostrarD;
        int dsplz= 1;
        mostrarC = codificar(prueba, dsplz);
        System.out.println("Codificado: " + mostrarC );
        mostrarD = decodificar(mostrarC,dsplz);
        System.out.println("Decodificado: " + mostrarD);

    }
    public static String codificar(String palabra, int desplazamiento){
        char [] vect = palabra.toCharArray();
        for (int i = 0; i < vect.length; i++) {
            int val = (int) vect[i] + desplazamiento;
            if(val > 122){
                val = 96 + (val-122);
            }
            vect[i]=(char)val;
        }
        return String.valueOf(vect);
    }
    public static String decodificar(String codificado, int desplazamiento){
       char[] arr = codificado.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int val = (int) arr[i] - desplazamiento;
            if(val<97){
                val = 123 - (97 - val);
            }
            arr[i] = (char) val;
        }
        return String.valueOf(arr);
    }

}
