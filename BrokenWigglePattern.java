package com.company.PatternMaker;

public class BrokenWigglePattern extends Pattern {

    public BrokenWigglePattern() {
        super(0.40d);                               //jam rate: 40% of the time, will fail (with random number in base class)
        createPattern();
    }

    private void createPattern() {
        for (int i = 0; i < 5; i++) {
            this.stitchesPattern.add(new SmallCrossStitch());
            this.stitchesPattern.add(new LargeCrossStitch());
        }
    }
}
