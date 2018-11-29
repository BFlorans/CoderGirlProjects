package com.company.PatternMaker;

public class CrossStitchWigglePattern extends Pattern {

    public CrossStitchWigglePattern(){
    super(0.05);
    createPattern();
}
    private void createPattern(){
        for(int i = 0; i < 5; i++) {
            stitchesPattern.add(new SmallCrossStitch());
            stitchesPattern.add(new LargeCrossStitch());
        }
    }
}
