package bai8;

import java.util.Scanner;

public class SongSong extends DienTro {
	// mach // gom co 2 tro mac voi nhau 
	private String ten_1;
	private String ten_2;
	private int value1;
	private int value2;
	public SongSong()
	{
		super();
		ten_1="R1";
		value1 =2;
		ten_2="R2";
		value2=3;
		
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten dien tro 1");
		ten_1=scan.nextLine();
		System.out.println("nhap vao gia tri cua dien tro 1");
		value1=scan.nextInt();
		scan.nextLine();
		System.out.println(" nhap vao ten dien tro 2");
		ten_2=scan.nextLine();
		System.out.println("nhap vao gia tri cua dien tro 2");
		value2=scan.nextInt();
	}
	public double Tinh_Dientro()
	{
		return ((value1*value2)/(value1+value2));
	}
	
	
}
