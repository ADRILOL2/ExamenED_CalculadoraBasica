package CalculadoraBasica;
import java.util.Scanner;
public class SumaNumeros {

	public static void main(String[] args) {
		//Añade dos numeros en distintas variables para luego mostrar estos mismos y ademas de la suma de ambos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		int suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

	}

}
