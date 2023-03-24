package org.example;

public class Main {
    public static void main(String[] args) {


        MaquinaCafe mc = new MaquinaCafe();

        mc.setAcucarDisponivel(30);

        mc.fazerCafe(10);
        mc.fazerCafe(15);
        mc.fazerCafe();
    }
}