package com.company;

public class MetsikBanaan extends Banaan {
    private Integer koverus;
    private int sailivus;


    public MetsikBanaan(double kaal, int kypsus, String nimi, double baashind, Integer koverus) {
        super(kaal, kypsus, nimi, baashind);
        this.koverus = koverus;
    }

    @Override
    public String toString() {
        return "MetsikBanaan{" +
                "kaal=" + this.getKaal() +
                " g, kypsus=" + this.getKypsus() +
                ", sailivus=" + this.getSailivus() +
                ", nimi='" + this.getNimi() + '\'' +
                " koverus=" + this.getKoverus() +
                ", baashind=" + this.getBaashind() +
                " €, hind=" + this.getHind() +
                " €}";
    }

    @Override
    public int getSailivus() {
        return 10 - 2 * this.getKypsus();
    }

    @Override
    public void setSailivus(int sailivus) {
        this.sailivus = sailivus;
    }

    public Integer getKoverus() {
        return koverus;
    }

    public void setKoverus(Integer koverus) {
        this.koverus = koverus;
    }
}
