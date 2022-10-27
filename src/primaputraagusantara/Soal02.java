package primaputraagusantara;

import java.util.Scanner;

public class Soal02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int deretAwal, deretAkhir, deretGenap = 0, deretGanjil = 0, jumlahGanjil = 0, jumlahGenap = 0;
		
		System.out.print("Input Awal Deret : ");
		deretAwal = input.nextInt();
		
		System.out.print("Input Akhir Deret : ");
		deretAkhir = input.nextInt();
		
		for(int i = deretAwal; i <= deretAkhir; i++)
		{
			if(i%2 == 1)
			{
				System.out.println("Deret Ganjil \t: " + i);
				jumlahGanjil = jumlahGanjil + i;
				
			}
			
			else if(i%2 == 0)
			{
				System.out.println("Deret Genap \t: " + i);
				jumlahGenap = jumlahGenap + i;
			}
			
		}
		
		System.out.println("Penjumlahan Genap : " + jumlahGenap);
		System.out.println("Penjumlahan Ganjil : " + jumlahGanjil);
		System.out.println("Bilangan Bulat Positif dari " + deretAwal +" s/d " + deretAkhir);
		
	}
}
