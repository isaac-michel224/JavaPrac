import java.io.Console;
import java.util.*;


import static java.lang.Integer.sum;

public class Arrays {
    public static void main(String[] args) {


        //sum of values

        int array[] = {2,4,6,8,10};

        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array elements= " + sum);


        //Output of Example Array
/*
        double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length>; i++){
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }
        System.out.println(index);
*/
    }
}


//Answer for Question 2 - Output: Java - Illegal Start of Expression

/*
Write a program to sum all the values of a given Array in Java.
What is the output?
          double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = examplesArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index);