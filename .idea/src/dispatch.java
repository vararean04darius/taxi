import java.util.Scanner;
import java.util.Random;
public class dispatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numele dumneavoastra: ");
        String nume = sc.next();
        System.out.println("Introduceti numarul de telefon: ");
        String nrtel = sc.next();
        System.out.println("Introduceti suma de bani de care dispuneti: ");
        double nrbani = sc.nextDouble();
        System.out.println("Introduceti locatia la care va aflati: ");
        int loc = sc.nextInt();
        new client(nume, nrtel, nrbani, loc);
        new driver(1,"Vladimir", 162, true);

    }
}
