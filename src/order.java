public class order
{
    private static int UID = 1033;
    private static int _dist;
    private static double _pretmetru=0.0021;
    public static driver sofer;
    public static client cli;
    public order(int dist, driver d, client c)
    {
        _dist = dist;
        sofer = d;
        cli = c;
    }
    public static void create_receipt()
    {
        System.out.println("Bon fiscal pentru cursa cu numarul "+ (++UID) + " :");
        System.out.println("Suma de platit: " + (_dist*_pretmetru) + " RON, pentru distanta: " + _dist );
        System.out.println("Cursa efectuata de soferul: " + sofer.get_nume() + " avand ca pasager pe: " + cli.get_nume());
    }
    public static void cursa()
    {
        cli.set_bani((cli.get_nrbani()) - (_dist*_pretmetru));
    }
}
