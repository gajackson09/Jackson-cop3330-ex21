/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program converts a number from 1 to 12 to the corresponding month.
import java.util.Scanner;
class ex21{
    public String getMonth(int month){
        switch (month){
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";  
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }//end of switch
    }//end of NumberstoName

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        NumbersToName ntn = new NumbersToName();
        System.out.print("Please enter the number of month: ");
            int month = input.nextInt();
        String result = ntn.getMonth(month);
        if(month>0 && month<12)
            System.out.print("The name of month is "+result);
        else
            System.out.print(result+" :please enter correct month number"); 
       
    }//end of main
}//end of class