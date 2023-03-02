package prb2;

public class Vers {
    private String _text;
    private Integer _consoane;
    private Double _rndN = Math.random();
    private boolean areSteluta;
    private Integer _nrCuvinte;
    public Vers(String text, Integer consoane, Double rnd)
    {
        _consoane = consoane;
        _text = text;
        _rndN = rnd;
    }
        public Vers()
        {}
    public void set_text(String t)
    {
        _text = t;
    }
    public void set_nrCuvinte(Integer nr)
    {
        _nrCuvinte = nr;
    }
    public Integer get_nrCuvinte(){return _nrCuvinte;}
    public void set_consoane(int Consoane)
    {
        _consoane = Consoane;
    }
    public String get_text() {
        return _text;
    }
    public Integer get_consoane() {
        return  _consoane;
    }
    public Double get_rndN()
    {
        return _rndN;
    }
    public void setSteluta(boolean are)
    {
        areSteluta = are;
    }
    public boolean areSteluta()
    {
        return areSteluta;
    }
}
