public class driver
{
    private int UID;
    private String _nume;
    private int _locatie;
    public boolean shift;
    public driver(int UID, String _nume, int _locatie, boolean shift)
    {
        this.UID = UID;
        this._nume = _nume;
        this._locatie = _locatie;
        this.shift = shift;
    }
    public int get_UID()
    {
        return UID;
    }
    public String get_nume()
    {
        return _nume;
    }
    public int get_locatie()
    {
        return _locatie;
    }
    public boolean get_shift()
    {
        return shift;
    }
    public void set_shift(boolean shft)
    {
        shift = shft;
    }
}
