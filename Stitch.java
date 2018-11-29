package com.company.PatternMaker;

public class Stitch {
    private String oneStitch;
    public Stitch(String oneStitch){
        this.oneStitch = oneStitch;
    }
    protected void sewStitch() {
        System.out.print(oneStitch);
    }
}
