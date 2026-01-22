//Pablo Manuel Fernández Velázquez

import java.util.regex.*;
import java.util.Scanner;

public class EjercicioPrueba
{
	public static void main(String [] args)
	{
		//Creacion de variables y de matrices
		char [][] Tabla = new char [5][5];
		int contador = 0,n1 = 0,n2 = 0;
		String regex = "[a-zA-Z\\ ]*";
		Scanner sc = new Scanner(System.in);
		String Mensaje,resultado = "";
		char letra;
		
		
		//Rellenar la matriz
		Tabla [0][0] = 'A';
		Tabla [0][1] = 'B';
		Tabla [0][2] = 'C';
		Tabla [0][3] = 'D';
		Tabla [0][4] = 'E';
		Tabla [1][0] = 'F';
		Tabla [1][1] = 'G';
		Tabla [1][2] = 'H';
		Tabla [1][3] = 'I';
		Tabla [1][4] = 'K';
		Tabla [2][0] = 'L';
		Tabla [2][1] = 'M';
		Tabla [2][2] = 'N';
		Tabla [2][3] = 'O';
		Tabla [2][4] = 'P';
		Tabla [3][0] = 'Q';
		Tabla [3][1] = 'R';
		Tabla [3][2] = 'S';
		Tabla [3][3] = 'T';
		Tabla [3][4] = 'U';
		Tabla [4][0] = 'V';
		Tabla [4][1] = 'W';
		Tabla [4][2] = 'X';
		Tabla [4][3] = 'Y';
		Tabla [4][4] = 'Z';
		
		do
		{
			try
				{
					//Preguntar por la frase a cifrar
					System.out.print("\nMensaje a cifrar: ");
					Mensaje = sc.nextLine();
					
					//Comprobar regex
					Pattern p = Pattern.compile(regex);
					Matcher m = p.matcher(Mensaje);
					
					if (m.matches())
					{
						
						//Asiganción del la letra a los numeros
						for (int fila = 0;fila < Tabla.length;fila++)
						{
							for (int col = 0;col < Tabla[fila].length;col++)
							{
								for (int pos = 0;pos < Mensaje.length();pos++)
								{
									letra = Mensaje.charAt(pos);
									
									if (letra == Tabla[fila][col])
									{
										n1 = (fila + 1);
										n2 = (col + 1);
										
										resultado += n1;
										resultado += n2;
									}
								}
							}
						}
						System.out.print("\nMensaje cifrado: "+resultado);
						contador += 1;
					}
					else
					{
						System.out.print("\nCaracter incorrecto.Solamente se pueden introducir letras acentuadas y espacios en banco ");
					}
				}
			catch (IndexOutOfBoundsException F)
			{
				System.out.print("\nError"+F);
			}
			catch (Exception E)
			{
				System.out.print("Error: "+E);
			}
		}
		while (contador == 0);
		System.out.print("\nPrograma terminado.");
	}
}
