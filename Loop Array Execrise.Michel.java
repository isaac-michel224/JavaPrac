
import java.io.Console;
import java.util.*;

import static java.lang.Integer.sum;
import java.util.Arrays;
import java.util.Scanner;


public class NumbersArray2 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(34);
        list.add(5);
        list.add(12);
        list.add(20);
        list.add(40);

        ///Sort values
  /*      Collections.sort(list);
        for(Integer number:list)
        System.out.println(number);
   */

        //Sum of Numbers
        int sum = 0;

        for (int i: list) {
            sum += i;
        }

        System.out.println("Sum =" + sum);


        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int product = 1;
        System.out.println("Enter the elements of the array one by one ");
        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            product = product * myArray[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(myArray));
        System.out.println("Product of the elements of the array ::"+product);
        //Smallest Number

     int[] arrValues = {34,5,12,20,40};
     int small = arrValues[0];

        for(int i=0;i<arrValues.length;i++) {
            for(int j=i+1;j<arrValues.length;j++) {
                if(arrValues[i] > arrValues[j]) {
                    small = arrValues[i];
                    arrValues[i] = arrValues[j];
                    arrValues[j] = small;
                }
            }
        }

        System.out.println("The smallest element is:" + arrValues[0]);

        int largest = Integer.MIN_VALUE;

        //find largest element of array
        int index = 0;
        while( index < arrValues.length ) {
            //check if largest is smaller than element
            if( largest < arrValues[index] ) {
                //update largest
                largest = arrValues[index];
            }
            index++;
        }

        System.out.println("The largest number is : "+ largest);





    }
}
