import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class dispatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        driver dr1 = new driver(1,"Vladimir", 150, true);
        driver dr2 = new driver(2,"Costache", 400, true);
        driver dr3 = new driver(3,"Marian", 750, true);
        driver dr4 = new driver(4,"Alexandra", 1100, true);
        System.out.println("Ati apelat la ProTaxi, va rugam sa: ");
        System.out.println("Introduceti numele dumneavoastra: ");
        String nume = sc.next();
        System.out.println("Introduceti numarul de telefon: ");
        String nrtel = sc.next();
        System.out.println("Introduceti suma de bani de care dispuneti: ");
        double nrbani = sc.nextDouble();
        System.out.println("Introduceti locatia la care va aflati: ");
        int loc = sc.nextInt();
        client cl = new client(nume, nrtel, nrbani, loc);
        int min = 9999;
        driver daux = dr1;
        if(Math.abs(cl.get_locatie() - dr1.get_locatie()) < min )
        {
            min = Math.abs(cl.get_locatie() - dr1.get_locatie());
            daux = dr1;
        }
        if(Math.abs(cl.get_locatie() - dr2.get_locatie()) < min )
        {
            min = Math.abs(cl.get_locatie() - dr2.get_locatie());
            daux = dr2;
        }
        if(Math.abs(cl.get_locatie() - dr3.get_locatie()) < min )
        {
            min = Math.abs(cl.get_locatie() - dr3.get_locatie());
            daux = dr3;
        }
        if(Math.abs(cl.get_locatie() - dr4.get_locatie()) < min )
        {
            min = Math.abs(cl.get_locatie() - dr4.get_locatie());
            daux = dr4;
        }
        System.out.println("Cel mai apropiat sofer este: " + daux.get_nume()+ " si se afla la distanta de: " + min);
        daux.set_locatie(loc);
        System.out.println("Soferul a ajuns, introduceti locatia la care vreti sa ajungeti:");
        int locfinal = sc.nextInt();
        int distantafinala = (Math.abs(locfinal - loc));
        System.out.println("Doriti sa ajungeti la: " + locfinal + " care se afla la: " + distantafinala + " metrii de adresa actuala.");
        order comanda1 = new order(distantafinala, daux, cl);
        comanda1.create_receipt();
        comanda1.cursa();
    }
}
