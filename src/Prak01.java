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
    }
}
