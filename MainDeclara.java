import java.util.Arrays;

public class MainDeclara {
    public static void main(String[] args) {
    	
        int[] numeros = new int[15];
        String[] nombres = new String[20];
        
        numeros[9] = 5;        
        nombres[0] = "Francisco";
        
        mostrarArreglo(numeros);
        mostrarArreglo(nombres);
        
        int posicion = buscarValor(numeros, 5);
        System.out.println("El valor 5 se encuentra en la posición: " + posicion);
        
        eliminarValor(nombres, "Francisco");
        mostrarArreglo(nombres);
    }
    
    public static void mostrarArreglo(int[] arr) {
        System.out.println("Contenido del arreglo de enteros: " + Arrays.toString(arr));
    }
    
    public static void mostrarArreglo(String[] arr) {
        System.out.println("Contenido del arreglo de nombres: " + Arrays.toString(arr));
    }
    
    public static int buscarValor(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    
    public static void eliminarValor(String[] arr, String valor) {
        int posicion = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(valor)) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            for (int i = posicion; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = null;
        }
    }
}