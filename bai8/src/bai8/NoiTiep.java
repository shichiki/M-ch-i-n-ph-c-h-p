package bai8;
import java.util.Scanner;

public class NoiTiep  extends DienTro{
	public String ten;
	public int value;
	public NoiTiep()
	{
		super();
		ten="R1";
		value=2;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten dien tro");
		ten=scan.nextLine();
		System.out.println("nhap vao gia tri cua dien tro");
		value=scan.nextInt();
	}
	public double Tinh_Dientro()
	{
		return value;
	}

}
