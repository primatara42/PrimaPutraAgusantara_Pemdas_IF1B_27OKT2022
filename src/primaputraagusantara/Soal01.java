package primaputraagusantara;

import java.util.Scanner;

public class Soal01 
{
	public static void main(String[] args) 
	{
		int banyakAngka = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Banyak Angka = ");
		System.out.print("");
		
		banyakAngka = input.nextInt();
		
		for(int i = 1; i <= banyakAngka; i++)
		{
			int bilangan = 0;
			System.out.print("Bilangan ke " + i + " = ");
			bilangan = input.nextInt();
			
			if(bilangan > 0)
			{
				System.out.println(bilangan + " Merupakan Bilangan Positif");
				System.out.println("");
			}
			
			else if(bilangan < 0)
			{
				System.out.println(bilangan + " Merupakan Bilangan Negatif");
				System.out.println("");
			}
			
			else if(bilangan == 0)
			{
				System.out.println(bilangan + " Merupakan Bilangan Nol");
				System.out.println("");
			}
		}
	}
}
