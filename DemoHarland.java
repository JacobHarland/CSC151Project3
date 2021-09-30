/**
Jacob Harland
04/21/2021
CSC 151 Exam 2
*/

import java.util.Scanner;//for reading user input
import java.io.*;
import java.util.ArrayList;

public class DemoHarland
{
   public static void main(String[] args)
   {
      final double MAX_LOAN_AMOUNT = 300000;
      
      String firstName, lastName;
      double desiredAmountOfLoan, incomeAmount;
      int numberOfTimesLatePayment;
      char goAgain;
      String title = "Loan Application Report";
      
      Scanner keyboard = new Scanner(System.in);
      ArrayList<LoanApplicationHarland> loanList = new ArrayList<LoanApplicationHarland>();//array list
      
      do//start of do while loop
      {
         System.out.print("What is the applicant’s first name? ");
         firstName = keyboard.nextLine();

         System.out.print("What is the applicant’s last name? ");
         lastName = keyboard.nextLine();
                  
         System.out.print("What is the applicant’s desired loan amount? ");
         desiredAmountOfLoan = keyboard.nextDouble();
         while (desiredAmountOfLoan > MAX_LOAN_AMOUNT)//makes sure the loan amount is smaller than the upper limit of loan amounts
         {
            System.out.print("Loan amount too high.What is the applicant’s desired loan amount? ");
            desiredAmountOfLoan = keyboard.nextDouble();
         }

         
         System.out.print("What is the applicant’s income amount? ");
         incomeAmount = keyboard.nextDouble();
         
         System.out.print("How many late payments has the applicant made? ");
         numberOfTimesLatePayment = keyboard.nextInt();
         
         System.out.println();
         
         loanList.add(new LoanApplicationHarland(firstName, lastName, desiredAmountOfLoan, new FinancialReportHarland(incomeAmount, numberOfTimesLatePayment)));
      
         System.out.print ("Do you wish to enter information for another loan application (Y/N)? ");
         goAgain = keyboard.next().charAt(0);
         System.out.println();
      }
      while(goAgain == 'Y' || goAgain == 'y');//repeats the above if Y is entered
      
      for(LoanApplicationHarland loanApplicationHarland : loanList)               
         {   
            System.out.print("" + title); 
            System.out.println(loanApplicationHarland);
            System.out.println();     
         }
         
       System.out.println("Total Number of Loan Applications: " + LoanApplicationHarland.numberOfLoanApplications);
   }
}