package oppgave1uke7.demo;



public class motorObjekter {
    private String eier;
    private String personnummer;
    private String adress;
    private String kjentegn;
    private String merke;
    private String biltype;

    public motorObjekter(String eier, String personnummer, String adress, String kjentegn, String merke, String biltype) {
        this.eier = eier;
        this.personnummer = personnummer;
        this.adress = adress;
        this.kjentegn = kjentegn;
        this.merke = merke;
        this.biltype = biltype;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setKjentegn(String kjentegn) {
        this.kjentegn = kjentegn;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getEier() {
        return eier;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public String getAdress() {
        return adress;
    }

    public String getKjentegn() {
        return kjentegn;
    }

    public String getMerke() {
        return merke;
    }

    public String getBiltype() {
        return biltype;
    }
}
