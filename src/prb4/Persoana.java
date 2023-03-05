package prb4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persoana {
    private Integer _varsta;
    private String _cnp;
    private String _nume;
    public Integer get_varsta() {
        return _varsta;
    }
    public String get_cnp()
    {
        return _cnp;
    }
    public void set_nume(String n)
    {
        this._nume = n;
    }
    public void set_cnp(String s)
    {
        _cnp = s;
    }
    public boolean isValidCnp(String cnp)
    {
        return (cnp.matches("^{1256}[0-9]{13}$")) && (Character.getNumericValue(cnp.charAt(cnp.length()-1)) == getCifraControl(cnp));
    }
    public int getCifraControl(String cnp)
    {
        String control = "279146358279";
        int sum = 0;
        for(int i = 0; i < 12; i ++)
        {

            sum+=Character.getNumericValue(cnp.charAt(i)) * Character.getNumericValue(control.charAt(i));
        }

        return sum%11;
    }
    public LocalDate getBirthdateFromCNP(String cnp)
    {
        String date = "";
        switch(Character.getNumericValue(cnp.charAt(0)))
        {
            case 1:
                date += "19";
                break;
            case 2:
                date += "19";
                break;
            case 5:
                date +="20";
                break;
            case 6:
                date += "20";
                break;
        }
        date+=cnp.substring(1,3)+"-"+cnp.substring(3,5)+"-"+cnp.substring(5,7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(date,formatter);
        this._varsta = getVarstaFromBirthDate(birthDate);
        return birthDate;
    }
    public Integer getVarstaFromBirthDate(LocalDate Varsta)
    {
        Period period = Period.between(LocalDate.now(),Varsta);
        return Math.abs(period.getYears());
    }
    @Override
    public String toString()
    {
        return "Nume: "+ " "+this._nume+"\nCNP: " + this._cnp + "\nVarsta: " + this._varsta;
    }
}
