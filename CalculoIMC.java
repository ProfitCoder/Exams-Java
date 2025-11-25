import java.util.Scanner;

public class CalculoIMC
{
	public static void main(String [] args)
	{
		
		//Creacion e inicializacion de variables y objetos
		String nom;
		int dni,Imc;
		double peso,altura;
		char Letra;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Introduce tu nombre (hasta 10 caracteres): ");
		nom = sc.nextLine();
		System.out.print("Número del DNI (8 números): ");
		dni = Integer.parseInt(sc.nextLine());	
		System.out.print("Letra del DNI: ");
		Letra = sc.nextLine().charAt(0);
		System.out.print("Introduce tu peso en kilogramos (ej. 75,5): ");
		peso = sc.nextDouble();
		System.out.print("Introduce tu altura en metros (ej. 1,75) : ");
		altura = sc.nextDouble();
		
		Imc = (int)(peso)/(int)(Math.pow(altura,2));
			
		
		
		
		//La tabla
		System.out.print("\n******************************************");
		System.out.printf("\n*Nombre: %s *       NIF:%d%c		     *",nom,dni,Letra);
		System.out.print("\n******************************************");
		System.out.printf("\n* IMAC: %d *     Estado:",Imc);
		if(Imc<18)
		{
			System.out.print("Bajo Peso");
		}
		else if(Imc<=25)
		{
			System.out.print("Normal");
		}
		else if(Imc<=30)
		{
			System.out.print("Sobrepeso");
		}
		else 
		{
			System.out.print("Obesidad");
		}
		
		System.out.print("       *\n******************************************");
	}
}