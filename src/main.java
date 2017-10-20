import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaramos variables
		int num1,num2;
		
		//Mensaje
		System.out.println("Introduce 2 números");
		
		//Creamos objeto
		Scanner teclado= new Scanner(System.in);
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		
		System.out.println("Estos son los números " +num1+num2);
		/*otra forma
		 System.out.print("Estos son los números ");
		 System.out.print(num1);
		 System.out.print(num2);
		*/

	}

}
