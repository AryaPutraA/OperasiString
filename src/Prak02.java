import java.util.*;
public class Prak02
{
	private static void tampilJudul(String identitas)
	{
	System.out.println("Identitas" + identitas);
	System.out.println("\nCovert Kalimat Alay Angka (Vokal Ke Angka)\n");
	}
	public static void main(String[] args)
	{
		String identitas = " Arya Putra Adyartama / XR3 / 7";
		tampilJudul(identitas);
		String kalimat = tampilInput();
	}
	private static String tampilInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan Kalimat: ");
		String kalimat = scanner.nextLine();
		System.out.println("Kalimat Asli : " + kalimat);
		
		return kalimat;
	}
}
