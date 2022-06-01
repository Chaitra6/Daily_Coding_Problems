package DailyProblems;
//14

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem_10 {

    /*
    Question:

    The area of a circle is defined as πr^2.
    Estimate π to 3 decimal places using a Monte Carlo method.
    Hint: The basic equation of a circle is x2 + y2 = r2.

     */

    public static void main (String[] args){
        int circle_points = 0;
        int square_points = 0;

        double x, y;

        for(int i = 0 ; i < 1000000 ; i++){

            x = Math.random();
            y = Math.random();

            if(x*x + y*y <=1 ){
                circle_points++;
            }

            square_points++;
        }//for

        double pi = 4*(double)circle_points/(double)square_points;
        BigDecimal bd = new BigDecimal(pi).setScale(3, RoundingMode.HALF_EVEN);
        pi = bd.doubleValue();
        System.out.println("Pi : " + pi);
    }




}
