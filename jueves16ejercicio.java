import java.util.Scanner;
public class jueves16ejercicio {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese tu nombre");
    String nombre =sc.nextLine();
    System.out.println("Hola " +nombre);
    System.out.println("Introduce un numero:");
    int numero = sc.nextInt();

    if(numero<= 10) {
        System.out.println("Hola "+nombre);
        System.out.println("El numero que ingreso es nemor que 10");
}else{
    System.out.println("Hola "+nombre);
    System.out.println("El numero que ingreso es mayor que 10");
    }                   
    }
}