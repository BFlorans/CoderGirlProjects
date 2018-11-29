package com.company.PatternMaker;

public class BlockyBaublePattern extends Pattern {

    public BlockyBaublePattern(){
        super(0.10);
        createPattern();
    }

    private void createPattern() {
        for (int i = 0; i <= 3; i++) {
            stitchesPattern.add(new BlockStitch());
            for (int j = 0; j <= 2; j++) {
                stitchesPattern.add(new FillStitch());
            }
            stitchesPattern.add(new CircleStitch());
            for (int k = 0; k <= 2; k++) {
                stitchesPattern.add(new FillStitch());
            }
        }
    }



 /*
    public void sewPattern(){
        for(int i = 0; i <= 3; i++) {
            BlockStitch.sewStitch();
            for (int j = 0; j <= 2; j++) {
                FillStitch.sewStitch();
            }
            CircleStitch.sewStitch();
            for (int k = 0; k <= 2; k++) {
                FillStitch.sewStitch();
            }
        }
    }
    */
    }
