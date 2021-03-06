package com.wordpress.httpspandareaktor.mechanism.generators;

import android.util.Log;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by brian on 6/12/17.
 */

public class GenUtils {

    public static String generateRandomCode(int eqLength){
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int n = r.nextInt(eqLength);

        for (int ctr = 0; ctr < eqLength; ctr ++) {
            if (ctr != n) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }


    public static Double generateRandomInRange(Double floor, Double ceil){
        Random random = new Random();
        Double n = floor + ((ceil + floor * -1) * random.nextDouble());
        Log.v("GenUtils.java", " generated random " + n + " from range min/max: " + floor + ceil);
        return n;

    }

    public static Double generateRandomInRange(int floor, int ceil){
        //will not hit the ceiling #
        Random random = new Random();
        int n = floor + random.nextInt(ceil + floor * -1);
        return Double.parseDouble(String.valueOf(n));

    }

    public static Double truncateDecimals(Double num, int places){
        //this new truncate method handles exponents as well :)
        StringBuilder sb = new StringBuilder();
        sb.append("#.");
        for (int i = 0; i < places; i++){
            sb.append("0");
        }
        sb.append("E000");
        DecimalFormat df = new DecimalFormat(sb.toString());
        return Double.parseDouble(df.format(num));
    }


    public static String quantumObject(){
        //EXTREMELY small numbers, should be used in Tier1/2 exclusively
        String[] objects = new String[]{"electron", "proton", "hadron", "particle", "nucleon", "meson"};
        Random r = new Random();
        int idx = r.nextInt(objects.length);
        return objects[idx];
    }

    public static String normalObject(){
        String[] objects = new String[]{"dog", "cat", "hamster", "bird", "box", "human", "car",
                "sailboat", "bike", "moose", "mouse", "block", "raccoon", "velociraptor", "monkey", "elephant",
        "deer", "baseball", "penguin", "truck", "tank", "wolf"};
        Random r = new Random();
        int idx = r.nextInt(objects.length);
        return objects[idx];
    }

    public static String massiveObject(){
        String[] objects = new String[]{"planet", "asteroid", "alien mothership", "moon", "comet",
        "star", "quasar", "UFO"};
        Random r = new Random();
        int idx = r.nextInt(objects.length);
        return objects[idx];
    }

    public static String randomPlanet(){
        String[] objects = new String[]{"Omicron Persei 8", "Arrakis", "Yavin", "Shi'ar", "Namek", "LV-426", "Eden Prime",
        "Dagobah", "Korriban", "Coruscant", "Hoth"};
        Random r = new Random();
        int idx = r.nextInt(objects.length);
        return objects[idx];
    }
}
