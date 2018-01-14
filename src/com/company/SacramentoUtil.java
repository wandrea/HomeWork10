package com.company;

import com.company.Sacramento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.*;

public class SacramentoUtil {

    private ArrayList<Sacramento> crimes;

    public ArrayList<Sacramento> getCrimes() {
        return crimes;
    }

    public SacramentoUtil() {
        this.crimes = new ArrayList<>();
    }

    public void readSacramentoCSV() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(
                        new File("d:\\HELIXLAB_TANFOLYAM\\JAVA\\9ora\\SacramentocrimeJanuary2006.txt")))) {

            String line;

            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i > 0) {
                    String[] csvRow = line.split(",");
                    Sacramento crime = new Sacramento();
                    crime.setcDateTime(csvRow[0]);
                    crime.setAddress(csvRow[1]);
                    crime.setDistrict(Integer.parseInt(csvRow[2]));
                    crime.setBeat(csvRow[3]);
                    crime.setGrid(Integer.parseInt(csvRow[4]));
                    crime.setCrimeDescr(csvRow[5]);
                    crime.setUcrNcicCode(Integer.parseInt(csvRow[6]));
                    crime.setLatitude(Float.parseFloat(csvRow[7]));
                    crime.setLongitude(Float.parseFloat(csvRow[8]));

                    crimes.add(crime);
                }
                ++i;
            }
            System.out.println(crimes.size());
        }
    }


}
