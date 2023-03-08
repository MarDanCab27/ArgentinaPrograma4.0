package Clase04;

public class OperacionesEnrte2Numeros {
    public static void main(String[] args) {
        System.out.println(calcular(2,3,"+"));
    }
    public static int calcular(int n0, int n1, String operador){
        switch (operador){
            case "+": return (n0+n1);
            case "-": return  (n0-n1);
            case "*": return (n0*n1);
            case "/": return (n0/n1);
            default: return 0;
        }
    }
}
