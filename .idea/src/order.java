public class order
{
    private int UID;
    private int _dist;
    public double _pretpekm=2.1;
    driver sofer1 = new driver(1,"Vladimir", 162, true);
    client pers1 = new client("Marin", "0748293732", 163.55, 110);
    public String numesofer = sofer1.get_nume();
    public String numeclient = pers1.get_nume();
}
