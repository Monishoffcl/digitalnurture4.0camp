public class FinancialForecasterexample {
    
    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;  
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        // Example usage
        double initialInvestment = 10000.0;  
        double annualGrowthRate = 0.09;     
        int investmentPeriod = 8;           
        
        double futureValue = predictValue(initialInvestment, annualGrowthRate, investmentPeriod);
        
        System.out.println("Financial Forecast Results:");
        System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
        System.out.printf("Annual Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.printf("Investment Period: %d years%n", investmentPeriod);
        System.out.printf("Projected Future Value: $%.2f%n", futureValue);
    }
}
