public class LoanApplicationHarland
{
   public static int numberOfLoanApplications = 0;
   private String firstName;
   private String lastName;
   private double desiredAmountOfLoan;
   private FinancialReportHarland financialReport;
   
   /**
      No arg constructor
   */
   public LoanApplicationHarland()
   {     
      firstName = "";
      lastName = "";
      desiredAmountOfLoan = 0;
      financialReport = new FinancialReportHarland();
      numberOfLoanApplications++;
   }
  
   /**
      Constructor that accepts arguements
      @param 
      @param        
   */
   public LoanApplicationHarland(String firstName, String lastName, double desiredAmountOfLoan, FinancialReportHarland financialReport)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.desiredAmountOfLoan = desiredAmountOfLoan;
      this.financialReport = new FinancialReportHarland(financialReport);
      numberOfLoanApplications++;
   }
   
      
   //setters
   
   /**
      a
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /**
      a
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
      
   /**
      a
   */
   public void setDesiredAmountOfLoan(double desiredAmountOfLoan)
   {
      this.desiredAmountOfLoan = desiredAmountOfLoan;
   }
   
   /**
      a
   */
   public void setFinancialReportHarland(FinancialReportHarland financialReport)
   {
      this.financialReport = new FinancialReportHarland(financialReport);;
   }

  
   //getters
   
   /**
      a
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      a
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      a
   */
   public double getDesiredAmountOfLoan()
   {
      return desiredAmountOfLoan;
   }
   
   /**
      a
   */
   public int getNumberOfLoanApplications()
   {
      return numberOfLoanApplications;
   }
   
   //method to determine risk level
   /**
      a
   */
   public String getRiskLevel()
   {
      final double LOW_LOAN_AMOUNT = 100000;
      final double HIGH_LOAN_AMOUNT = 200000;
      final double LOW_NUMBER_OF_TIMES_LATE_PAYMENT = 1;
      
      String riskLevel;
      
      if(financialReport.getIncomeAmount() < LOW_LOAN_AMOUNT)
      {
         if(financialReport.getNumberOfTimesLatePayment() > LOW_NUMBER_OF_TIMES_LATE_PAYMENT)
            riskLevel = "Medium";
         else
            riskLevel = "Low";
      }
      
      else if(financialReport.getIncomeAmount() > HIGH_LOAN_AMOUNT)
      {
         if(financialReport.getNumberOfTimesLatePayment() > LOW_NUMBER_OF_TIMES_LATE_PAYMENT)
            riskLevel = "Very High";
         else
            riskLevel = "High";
      }
      
      else
      {
         if(financialReport.getNumberOfTimesLatePayment() > LOW_NUMBER_OF_TIMES_LATE_PAYMENT)
            riskLevel = "High";
         else
            riskLevel = "Medium";
      }
    
    return riskLevel;
   }
   
   /**
   public String toString()
   {
      return "Loan Application:" + 
      String.format("\n\t\tFirst Name: " + firstName +
                    "\n\t\tLast Name: " + lastName +
                    "\n\t\tDesired Loan Amount: $%,.2f", desiredAmountOfLoan +
                    "\n" + financialReport +
                    "\nRisk Level: " + getRiskLevel());
                           
   }
   */
   
   public String toString()
   {
      return ("Loan Application:" + 
              "\n\t\tFirst Name: " + firstName +
              "\n\t\tLast Name: " + lastName +
              String.format("\n\t\tDesired Loan Amount: $%,.2f", desiredAmountOfLoan) +            
              "\n" + financialReport +
              "\nRisk Level: " + getRiskLevel());                 

                    
                           
   }

}