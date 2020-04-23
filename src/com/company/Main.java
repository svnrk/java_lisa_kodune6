package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Banaan> kollektsioon = new ArrayList<>();

    public static void main(String[] args) {
        kollektsioon.add(new Banaan(300, 6, "Cavendish", 0.99));
        kollektsioon.add(new Banaan(250, 9, "Chicita", 1.29));
        kollektsioon.add(new Banaan(150, 2, "Chicita", 0.89));
        kollektsioon.add(new MetsikBanaan(350, 2, "India", 0.89, 10));
        kollektsioon.add(new MetsikBanaan(250, 2, "India", 0.89, 20));
        kollektsioon.add(new MetsikBanaan(150, 2, "India", 0.89, 25));
        kollektsioon.add(new MetsikBanaan(170, 2, "India", 1.89, 35));
        kollektsioon.add(new MetsikBanaan(150, 2, "India", 1.19, 30));
        kollektsioon.add(new MetsikBanaan(140, 2, "India", 1.15, 45));
        kollektsioon.add(new MetsikBanaan(50, 2, "India", 1.15, 25));

        for (Banaan banaan : kollektsioon){
            System.out.println(banaan.toString());
        }
    }
}
