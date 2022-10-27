package primaputraagusantara;

import java.util.Scanner;

public class Soal03 
{
	public static void main(String[] args) 
	{
		int gajiPokok = 0, jumlahKaryawan = 0, masaKerja = 0, tunjangan = 0, totalGaji;
		String namaKaryawan = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah Karyawan = ");
		jumlahKaryawan = input.nextInt();
		
		for(int i = 1; i <= jumlahKaryawan; i++)
		{
			totalGaji = 0;
			System.out.println("");
			
			System.out.println("Data Karyawan ke -" + i);
			System.out.print("Masukkan Nama \t: ");
			namaKaryawan = input.next();
			
			
			System.out.print("Masukkan Masa Kerja (tahun) \t: ");
			masaKerja = input.nextInt();
			
			System.out.println("-------------------------------------------");
			
			//PROSES
			if(masaKerja < 5)
			{
				tunjangan = 1000000;
			}
			
			else if(masaKerja >= 5 && masaKerja < 10)
			{
				tunjangan = 1500000;
			}
			
			else if(masaKerja >= 10)
			{
				tunjangan = 2000000;
			}
			
			//OUTPUT AKHIR
			gajiPokok = 3500000;
			gajiPokok += tunjangan;
			System.out.println("Total Gaji " + namaKaryawan + "\t: Rp" + gajiPokok);
			
		}
		
		
		
		
		
		
		
		
	}
}
