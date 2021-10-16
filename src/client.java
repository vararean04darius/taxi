public class client
{
    private String _nume;
    private double _bani;
    private int _locatie;
    public String _nrtel;
    public client(String _nume, String _nrtel, double _bani, int _locatie)
    {
        this._nume = _nume;
        this._nrtel = _nrtel;
        this._bani = _bani;
        this._locatie = _locatie;
    }
    public String get_nume()
    {
        return _nume;
    }
    public String get_nrtel()
    {
        return _nrtel;
    }
    public double get_nrbani()
    {
        return _bani;
    }
    public void set_bani(double nrbani)
    {
        _bani = nrbani;
    }
    public int get_locatie()
    {
        return _locatie;
    }

}
