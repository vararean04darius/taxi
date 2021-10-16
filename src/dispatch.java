import java.util.Scanner;
public class dispatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //soferii care sunt in statii
        driver dr1 = new driver(1,"Vladimir", 150, true);
        driver dr2 = new driver(2,"Costache", 2400, true);
        driver dr3 = new driver(3,"Marian", 3800, true);
        driver dr4 = new driver(4,"Alexandra", 7400, true);
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
        int raspuns = 1;
        while(raspuns!=0)
        {
            System.out.println("1.Apelare taxi");
            System.out.println("2.Verificare taxa/km si SOLD actual");
            System.out.println("3.Anulare");
            int apel=sc.nextInt();
            if(apel ==2)
            {
                System.out.println("Taxa pe km este de: 2.1 RON pe KM");
                System.out.println("Sold-ul dumneavoastra este de : " + cl.get_nrbani() + " RON");
            }
            if(apel ==1)
            {
                //cautarea soferului cel mai apropiat
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
                System.out.println("Doriti ca soferul sa vina sau anulati cursa?");
                System.out.println("1.Continuare");
                System.out.println("2.Anulare");
                int ride_state = sc.nextInt();
                if(ride_state == 1)
                {
                    daux.set_locatie(loc);
                    System.out.println("Soferul a ajuns, introduceti locatia la care vreti sa ajungeti:");
                    int locfinal = sc.nextInt();
                    int distantafinala = (Math.abs(locfinal - loc));
                    System.out.println("Doriti sa ajungeti la: " + locfinal + " care se afla la: " + distantafinala + " metrii de adresa actuala.");
                    order comanda1 = new order(distantafinala, daux, cl);
                    comanda1.create_receipt();
                    comanda1.cursa();
                }
                else
                {
                    apel=3;
                }
            }
            if(apel == 3)
            {
                System.out.println("Comanda a fost anulata.");
            }
            System.out.println("Dorit sa faceti alta actiune?");
            System.out.println("1.Da");
            System.out.println("0.Nu");
            raspuns=sc.nextInt();
        }
    }

    //la amicii

}

