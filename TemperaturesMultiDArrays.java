package com.company;
import static java.lang.System.out;
public class TemperaturesMultiDArrays {
    public static void main(String[] args){
        int temperatures[][] = new int[4][7];
        temperatures[0][0] = 68;
        temperatures[0][1] = 70;
        temperatures[0][2] = 76;
        temperatures[0][3] = 70;
        temperatures[0][4] = 68;
        temperatures[0][5] = 71;
        temperatures[0][6] = 75;
        temperatures[1][0] = 76;
        temperatures[1][1] = 76;
        temperatures[1][2] = 87;
        temperatures[1][3] = 84;
        temperatures[1][4] = 82;
        temperatures[1][5] = 75;
        temperatures[1][6] = 83;
        temperatures[2][0] = 73;
        temperatures[2][1] = 72;
        temperatures[2][2] = 81;
        temperatures[2][3] = 78;
        temperatures[2][4] = 76;
        temperatures[2][5] = 73;
        temperatures[2][6] = 77;
        temperatures[3][0] = 64;
        temperatures[3][1] = 65;
        temperatures[3][2] = 69;
        temperatures[3][3] = 68;
        temperatures[3][4] = 70;
        temperatures[3][5] = 74;
        temperatures[3][6] = 72;

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] times = {"7 AM", "3 PM", "7 PM", "3 AM"};

        out.println("Temperature Calculator");
        out.println("\nAccording the provided data:");
        for(int rows = 0; rows<times.length; rows++){
            out.print("\n" + times[rows] + ": ");
            for(int columns = 0; columns<days.length; columns++){
                out.print(temperatures[rows][columns] + ", ");
                //is there a way to have no comma after last one in line?
            }
        }
        out.println("\n");
        out.println("Based on that data, the following are the average temperatures for the week:");

        for(int day = 0; day < days.length; day++) {
            out.print(days[day] + ": ");
            out.println(findAverage(temperatures, day));
        }

        int sum = 0;
        int count = 0;
        for(int rows = 0; rows < times.length; rows++){
            for (int columns = 0; columns < days.length; columns++){
                sum += temperatures[rows][columns];
                count++;
            }
        }
        //Could probably also find average by sum of weekly average divided by 7
        float totalAverage = (float)sum/count;
        out.println("\nThe final average temperature for the week was:");
        out.println("Total average: " + totalAverage);
    }


    public static float findAverage(int[][] array, int index){
        int columnTotal = 0;
            for (int i=0;i<array.length;i++){
            columnTotal += array[i][index];
        }
        float average = (float)columnTotal/array.length;
        return average;
    }
}
