package com.company.PatternMaker;

public class TapestryController {

    public static void printEightByThree(Pattern p) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 8; j++){
                p.printPattern();
            }
            System.out.println();
        }
    }

    public static void printSixByEight(Pattern p) {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 6; j++){
                p.printPattern();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printEightByThree(new BaublePattern());
        printEightByThree(new BlockyBaublePattern());
        printEightByThree(new BrokenWigglePattern());
        printEightByThree(new CrossStitchWigglePattern());
        printEightByThree(new ZigZagLinesPattern());
        System.out.println("\n\n\n");
        printSixByEight(new BaublePattern());
        printSixByEight(new BlockyBaublePattern());
        printSixByEight(new BrokenWigglePattern());
        printSixByEight(new CrossStitchWigglePattern());
        printSixByEight(new ZigZagLinesPattern());
    }
}