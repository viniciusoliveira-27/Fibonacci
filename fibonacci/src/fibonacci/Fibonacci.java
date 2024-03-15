package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite um número para verificar se pertence a sequencia de Fibonacci: ");
        int numero = sc.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
        sc.close();
    }
	

    public static boolean verificarFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return false;
    }
   
}