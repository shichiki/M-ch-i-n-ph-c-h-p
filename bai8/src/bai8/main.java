package bai8;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("doan mach co n doan mac mac voi nhau");
		int n= scan.nextInt();
		DienTro a[] = new DienTro[n];
		for(int i=0;i<n;i++)
		{
			System.out.println(" 1 nhap vao mach noi tiep"+"\n"+"2 nhap mach song song");
			int x= scan.nextInt();
			if (x==1)
			{
				a[i] = new NoiTiep();
				a[i].nhapthongtin();
			}
			if (x==2)
			{
				a[i]= new SongSong();
				a[i].nhapthongtin();
			}
		}
		
		double Rtd = 0;
		for(int i=0;i<n;i++)
		{
			Rtd = Rtd + a[i].Tinh_Dientro();
		}
		System.out.println(" tong tro cua mach dien phúc hop da cho la : " + Rtd);
			
		

	}

}
