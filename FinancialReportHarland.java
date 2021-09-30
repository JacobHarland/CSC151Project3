public class FinancialReportHarland
{
   private double incomeAmount;
   private int numberOfTimesLatePayment;
   
   /**
      No arg constructor
   */
   public FinancialReportHarland()
   {     
      incomeAmount = 0;
      numberOfTimesLatePayment = 0;
   }
  
   /**
      Constructor that accepts arguements
      @param        
   */
   public FinancialReportHarland(double incomeAmount, int numberOfTimesLatePayment)
   {
      this.incomeAmount = incomeAmount;
      this.numberOfTimesLatePayment = numberOfTimesLatePayment;
   }
   
   /**
      Copy Constructor that returns a copy of the Building object
      @param object2 
   */
   public FinancialReportHarland(FinancialReportHarland object2)
   {
      this.incomeAmount = object2.incomeAmount;
      this.numberOfTimesLatePayment = object2.numberOfTimesLatePayment;
   }
   
   
   //setters
   
   /**
      a
   */
   public void setIncomeAmount(double incomeAmount)
   {
      this.incomeAmount = incomeAmount;
   }
   
   /**
      a
   */
   public void setNumberOfTimesLatePayment(int numberOfTimesLatePayment)
   {
      this.numberOfTimesLatePayment = numberOfTimesLatePayment;
   }
   
   
   //getters
   
   /**
      a
   */
   public double getIncomeAmount()
   {
      return incomeAmount;
   }
   
   /**
      a
   */
   public int getNumberOfTimesLatePayment()
   {
      return numberOfTimesLatePayment;
   }
   
   public String toString()
   {
      return ("Financial Report:" +
               String.format ("\n\t\tIncome Amount: $%,.2f" , incomeAmount) +
               "\n\t\tLate Payments: " + numberOfTimesLatePayment);
   }
   
   
   
}