//Pablo Manuel Fernández Velázquez
import java.util.Scanner;

public class MenuString
{
	public static void main(String [] args)
	{
		//Creación de variables
		char opcion;
		char numcar;
		String cadenaus = "", palabrabus, posicionpa, palabracad, palabrarep;
		int x = 0, caractotal, cadenaexis, i, poss, palabraexis;

		Scanner sc = new Scanner(System.in);

		try
		{
			do
			{
				// Menú
				System.out.print("\n---MENÚ DE OPCIONES ---");
				System.out.print("\n (1) Cargar un texto");
				System.out.print("\n (2) Contar caracteres");
				System.out.print("\n (3) Buscar texto");
				System.out.print("\n (4) Posición de una palabra");
				System.out.print("\n (5) Reemplazar una palabra");
				System.out.print("\n (s) Salir y finalizar");
				System.out.print("\n------------------------");
				System.out.print("\n Seleccione una opción (1-5 o s): ");

				String entrada = sc.nextLine();
				opcion = entrada.toLowerCase().charAt(0);

				// OPCIÓN 1: cargar texto
				if (opcion == '1')
				{
					System.out.print("\nBienvenido, ¿qué cadena deseas definir? (Solo se guardarán 100 caracteres): ");
					cadenaus = sc.nextLine().toLowerCase();

					// Limitar a 100 caracteres
					if (cadenaus.length() > 100)
					{
						cadenaus = cadenaus.substring(0, 100);
					}

					System.out.print("\nCadena creada correctamente");
					x = 1;
				}

				// OPCIÓN 2: contar caracteres
				else if (opcion == '2' && x == 1)
				{
					caractotal = 0;

					for (i = 0; i < cadenaus.length(); i++)
					{
						numcar = cadenaus.charAt(i);
						caractotal++;
					}
					System.out.printf("\nHay un total de %d caracteres en tu cadena.", caractotal);
				}

				// OPCIÓN 3: buscar texto
				else if (opcion == '3' && x == 1)
				{
					System.out.print("\nIntroduce una palabra y te diré si está en tu cadena: ");
					palabrabus = sc.nextLine().toLowerCase();

					cadenaexis = cadenaus.indexOf(palabrabus);

					if (cadenaexis == -1)
					{
						System.out.print("\nEsa palabra no está en tu cadena.");
					}
					else
					{
						System.out.print("\nEsa palabra SÍ está en tu cadena.");
					}
				}

				// OPCIÓN 4: posición de una palabra
				else if (opcion == '4' && x == 1)
				{
					System.out.print("\nDime una palabra y te diré su posición: ");
					posicionpa = sc.nextLine().toLowerCase();

					poss = cadenaus.indexOf(posicionpa);

					if (poss == -1)
					{
						System.out.print("\nEsa palabra no está en la cadena.");
					}
					else
					{
						System.out.printf("\nTu palabra está en la posición %d.", poss);
					}
				}

				// OPCIÓN 5: reemplazar una palabra
				else if (opcion == '5' && x == 1)
				{
					System.out.print("\n¿Qué palabra quieres reemplazar? ");
					palabracad = sc.nextLine().toLowerCase();

					palabraexis = cadenaus.indexOf(palabracad);

					if (palabraexis == -1)
					{
						System.out.print("\nEsa palabra no está en la cadena.");
					}
					else
					{
						System.out.print("\n¿Con qué palabra quieres reemplazarla?: ");
						palabrarep = sc.nextLine().toLowerCase();

						cadenaus = cadenaus.replace(palabracad, palabrarep);
						System.out.print("\nReemplazo realizado.");
					}
				}

				// OPCIÓN S: salir
				else if (opcion == 's')
				{
					System.out.print("\nAdiós.");
				}

				// OPCIONES NO VÁLIDAS
				else
				{
					System.out.print("\nOpción inválida o no has cargado un texto (opción 1).");
				}

			} while (opcion != 's');
		}

		catch (StringIndexOutOfBoundsException e)
		{
			System.out.print("\nError: Introdujiste una opción vacía.");
		}
		catch (NumberFormatException e)
		{
			System.out.print("\nError: Debes escribir un número válido (1-5) o 's'");
		}
		catch (IllegalStateException e)
		{
			System.out.print("\nError del escáner: " + e.getMessage());
		}
		catch (Exception e)
		{
			System.out.print("\nERROR inesperado: " + e);
		}
	}
}
