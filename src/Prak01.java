
import java.util.Locale;

public class Prak01 
{
    public static void main(String[] args)
    {
        String identitas = "Arya Putra Adyartama / X RPL 3 / 7";
        System.out.println("Identitas : " + identitas);
        
        String x ="Operasi";
        System.out.println("Isi Variabel x : " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi Variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi Variabel z : " + z);
        System.out.println("Isi x sama dengan z (Case Sensitive) : " + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isi Variabel r : " + r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : " + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive) : " + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan z (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
        
        String s ="Operasi";
        System.out.println("Isi Variabel s : " + s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
        
        System.out.println("Pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("Isi Variabel x besar semua : " + x.toUpperCase());
        System.out.println("Isi Variabel x kecil semua : " + x.toLowerCase());
        
        String t = "    Operasi String    ";
        System.out.println("Isi Variabel t : \""+ t +"\"");
        System.out.println("Isi Variabel t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("Gabungkan isi Variabel x dan r : " + x.concat(r));
        
        System.out.println("Karakter mulai posisi 3 di Variabel x : " + x.substring(3));
        System.out.println("Karakter dari posisi 3-5 di Variabel x : " + x.substring(3,6));
        
        String tclean = t.trim();
        System.out.println("Isi Variabel tclean : " + t.trim());
        System.out.println("Rubah 'i' jadi 'E' di Variabel tclean : " + tclean.replace("i","E"));
        
        String[] arrT = tclean.split(" ");
        System.out.println("Pecah kata di Variabel tclean : ");
        for (int i = 0; i < arrT.length; i++)
            System.out.println(arrT[i]);
        
        String[] arrTr = tclean.split("r");
        System.out.println("Pecah berdasarkan huruf 'r' di Variabel tclean : ");
        for (int i = 0; i < arrTr.length; i++)
            System.out.println(arrTr[i]);
        
        double d = 1545454000;
        System.out.println(String.format("Uang saya %,.4f", d));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"),"Uang saya Rp %,.2f", d));
    }
}
