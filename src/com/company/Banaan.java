package com.company;

public class Banaan {
    private double kaal;
    private int kypsus;
    private int sailivus;
    private String nimi;
    private double baashind;
    private double hind;

    public Banaan(double kaal, int kypsus, String nimi, double baashind) {
        this.kaal = kaal;
        this.kypsus = kypsus;
        this.sailivus = 10 - kypsus;
        this.nimi = nimi;
        this.baashind = baashind;
        this.hind = hinnaKalkulaator();
    }

    public double hinnaKalkulaator(){
        double allahindlus = (this.getKaal() > 200) ? 0.95 : 1;
        hind = this.getBaashind()/1000 * this.getKaal() * this.getSailivus() * allahindlus;
        return hind;
    }

    @Override
    public String toString() {
        return "Banaan{" +
                "kaal=" + kaal +
                " g, kypsus=" + kypsus +
                ", sailivus=" + sailivus +
                ", nimi='" + nimi + '\'' +
                ", baashind=" + baashind +
                " €, hind=" + hind +
                " €}";
    }

    public double getKaal() {
        return kaal;
    }

    public void setKaal(double kaal) {
        this.kaal = kaal;
    }

    public int getKypsus() {
        return kypsus;
    }

    public void setKypsus(int kypsus) {
        this.kypsus = kypsus;
    }

    public int getSailivus() {
        return sailivus;
    }

    public void setSailivus(int sailivus) {
        this.sailivus = sailivus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getBaashind() {
        return baashind;
    }

    public void setBaashind(double baashind) {
        this.baashind = baashind;
    }

    public double getHind() {
        return hind;
    }

    public void setHind(double hind) {
        this.hind = hind;
    }
}
