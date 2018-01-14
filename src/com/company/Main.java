package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        SacramentoUtil su=new SacramentoUtil();
        try {
            su.readSacramentoCSV();
            SacramentoUtil.printCSVFromSacramentoList(su.getCrimes(), "d:\\HELIXLAB_TANFOLYAM\\JAVA\\10ora\\Sacramento.csv");
           //System.out.println(SacramentoUtil.countCrimeType(su.getCrimes(), "shoot"));
            SacramentoUtil.findBiggestGridByDistricts(su.getCrimes());
            System.out.println();
            SacramentoUtil.getStreets(su.getCrimes());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}
