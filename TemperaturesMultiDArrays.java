package com.company;
import static java.lang.System.out;
public class TemperaturesMultiDArrays {
    public static void main(String[] args){
        int temperatures[][] = {
                {68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}
        };

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
