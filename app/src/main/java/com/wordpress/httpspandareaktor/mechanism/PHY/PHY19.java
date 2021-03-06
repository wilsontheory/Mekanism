package com.wordpress.httpspandareaktor.mechanism.PHY;

import android.text.Spanned;

import com.wordpress.httpspandareaktor.mechanism.PHYutils;

/**
 * Created by Brian on 3/15/2017.
 */

public class PHY19 {
    //!!!DEFINE VARIABLES & METHODS FOR THIS EQN HERE!!!

    //descriptionGeneral is a general description of the equation for the ArrayAdapter
    public final String descriptionGeneral = "Equation determines the energy stored within a moving object";

    //descriptorText contains all the variables used and their descriptions
    public final Spanned[] descriptorArray = {PHYutils.PHYvarDescKineticEnergy,
            PHYutils.PHYvarDescMass,
            PHYutils.PHYvarDescVelocity};

    //set up the solver page with the following

    public Spanned symbolValA = PHYutils.PHYvarSymKineticEnergy;
    public Spanned symbolValB = PHYutils.PHYvarSymMass;
    public Spanned symbolValC = PHYutils.PHYvarSymVelocity;
    public Spanned unitValA = PHYutils.PHYvarUnitKineticEnergy;
    public Spanned unitValB = PHYutils.PHYvarUnitMass;
    public Spanned unitValC = PHYutils.PHYvarUnitVelocity;

    public static String solveMissing(String arrayCode, double firstVar, double secondVar){
        switch (arrayCode) {
            case "011":
                return  String.valueOf(0.5 * firstVar * Math.pow(secondVar, 2));
            case "101":
                return String.valueOf((2 * firstVar) / Math.pow(secondVar, 2));
            case "110":
                return String.valueOf(Math.sqrt((2 * firstVar)/secondVar));
            default:
                return "error in solution method";

        }
    }


    //!!!DONE DEFINING UNIQUE STUFF !!!

    //variables for the actual inputs
    double varA;
    double varB;
    double varC;

    //array of the parameters to fill ThreeVar form
    public Spanned[] resourceArray = {symbolValA, symbolValB, symbolValC, unitValA, unitValB, unitValC};

    public PHY19() {
    }
}




