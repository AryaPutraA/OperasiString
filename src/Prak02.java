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
		String convert = vocal2Angka(kalimat);
		tampilPerKata(kalimat, convert);
		tampilHasil(convert);
	}
	private static String tampilInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan Kalimat: ");
		String kalimat = scanner.nextLine();
		System.out.println("Kalimat Asli : " + kalimat);
		
		return kalimat;
	}
	private static String vocal2Angka(String kalimat)
	{
		char[][] arConvert =
		{{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
		
		kalimat = kalimat.toLowerCase();
		for (int i = 0; i < arConvert.length; i++) 
		kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
		
		return kalimat;
	}
	private static void tampilPerKata(String kalimat, String convert)
	{
		String[] arrKal = kalimat.split(" ");
		String[] arrCon = convert.split(" ");
		
		for (int i = 0; i < arrCon.length; i++)			
		System.out.println(arrKal[i] + "=> " + arrCon[i]);	
	}
	private static void tampilHasil(String convert)
	{
		System.out.println("Kalimat Alay Angka : " + convert);
	}
}
