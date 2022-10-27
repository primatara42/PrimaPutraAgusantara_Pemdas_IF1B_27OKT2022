package primaputraagusantara;

import java.util.Scanner;

public class Latihan01_Prima 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int banyak, jumlah = 0;
		
		System.out.print("Masukkan Banyak Nilai : ");
		banyak = input.nextInt();
		
		for(int i = 1; i <= banyak; i++)
		{
			jumlah += i;
			System.out.println("Deret Ke -" + i);
		}
		
		System.out.println("Hasil Penjumlahan : " + jumlah);
		
		
	}
}
