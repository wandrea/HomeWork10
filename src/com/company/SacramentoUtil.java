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

    public static void printCSVFromSacramentoList(ArrayList<Sacramento> crimes, String pathName) {
        //bufferedwriter-rel ki�rtam a megadott fileba minden egyes objektumot a list�b�l
        //toCSV met�dust haszn�ltam a CSV file form�tum el��ll�t�s�ra
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathName))) {
            //fejl�c l�trehoz�sa
            bw.write("cdatetime,address,district,beat,grid,crimedescr,ucr_ncic_code,latitude,longitude\n");
            for (Sacramento sacramento : crimes) {
                bw.write(sacramento.toCSV());
                bw.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findBiggestGridByDistricts(ArrayList<Sacramento> sacramentos) {
        //l�trehoztam egy HashMapet, amelybe ker�lnek majd a felt�telnek megfelel� sacramento objektumok.
        // megvizsg�lom, hogy van e map-ben az �ppen aktu�lis sacramento objektum district �rt�k�nek megfelel� objektum,
        // ha nincs akkor belerakom, ha van �s nagyobb az aktu�lis objektum grid �rt�ke, akkor belerakom(fel�l�rom az el�z�t).
        //mappen v�gig iter�lva ki�ratom az objektumokat.
        HashMap<Integer, Sacramento> map = new HashMap<>();
        for (Sacramento sacramento : sacramentos) {
            Sacramento s = map.get(sacramento.getDistrict());
            if (s == null) {
                map.put(sacramento.getDistrict(), sacramento);
            } else if (sacramento.getGrid() > s.getGrid()) {
                map.put(sacramento.getDistrict(), sacramento);
            }
        }
        for (Map.Entry<Integer, Sacramento> entry : map.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public static void getStreets(ArrayList<Sacramento> sacramentos) {
        //elk�rtem a c�meket az objektumokt�l �s megn�ztem hogy ST-re v�gz�dik-e, ha igen akkor ki�rattam az objektumokat.

        for (Sacramento sacramento : sacramentos) {
            if (sacramento.getAddress().endsWith("ST")) {
                System.out.println(sacramento.toString());
            }
        }

    }
}
