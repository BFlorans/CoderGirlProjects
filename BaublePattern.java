package com.company.PatternMaker;

public class BaublePattern extends Pattern {
    public BaublePattern(){
        super(0.0);
        createPattern();
    }

    private void createPattern(){
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                stitchesPattern.add(new ShortLineStitch());
            }
            stitchesPattern.add(new CircleStitch());
        }
    }
}