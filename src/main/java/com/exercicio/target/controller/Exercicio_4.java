package com.exercicio.target.controller;

public class Exercicio_4 {

    public void calculoPercentual(){
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double soma = SP + RJ + MG + ES + Outros;

        double porSP = ((SP * 1.0)/soma)*100;
        double porRJ = ((RJ * 1.0)/soma)*100;
        double porMG = ((MG * 1.0)/soma)*100;
        double porES = ((ES * 1.0)/soma)*100;
        double porOutros = ((Outros * 1.0)/soma)*100;

        System.out.println("SP = "+ porSP + "%");
        System.out.println("RJ = "+ porRJ + "%");
        System.out.println("MG = "+ porMG + "%");
        System.out.println("ES = "+ porES + "%");
        System.out.println("Outros = "+ porOutros + "%\n");


    }
}
