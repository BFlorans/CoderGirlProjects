package com.company.PatternMaker;

import java.util.ArrayList;

public class Pattern {

    protected ArrayList<Stitch> stitchesPattern;
    private double jamRate;

    public Pattern(double jamRate) {
        this.stitchesPattern = new ArrayList<>();
        this.jamRate = jamRate;
    }

    protected void printPattern() {
        boolean needleJam = (Math.random() < jamRate);      //this random() can generate from 0 - .9999 (just below 1)
        int printLength = stitchesPattern.size();
        if (needleJam) {
            printLength = stitchesPattern.size() / 2;
        }
        for (int i = 0; i < printLength; i++) {
            stitchesPattern.get(i).sewStitch();
        }
    }
}
