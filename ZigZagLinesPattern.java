package com.company.PatternMaker;


public class ZigZagLinesPattern extends Pattern {

    public ZigZagLinesPattern(){
        super(0.0);
        createPattern();
    }

    private void createPattern() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                stitchesPattern.add(new ZigZag());
            }
            for (int k = 0; k <= 3; k++) {
                stitchesPattern.add(new FillStitch());
            }
        }
    }
}
