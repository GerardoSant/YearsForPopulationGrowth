
public class YearsForPopulationGrowth {
    public static int of(double initialPopulation, double annualIncreasePercentage, int populationToSurpass ) {
        return initialPopulation<1 ? -1 : initialPopulation>populationToSurpass? 0:
                getYearsToSurpass(initialPopulation, annualIncreasePercentage, populationToSurpass);
    }

    private static int getYearsToSurpass(double increasingPopulation, double annualIncreasePercentage, int populationToSurpass) {
        int yearsToSurpass=0;
        while (increasingPopulation<=populationToSurpass){
            increasingPopulation += getOneYearIncrease(increasingPopulation, annualIncreasePercentage);
            yearsToSurpass++;
        }
        return yearsToSurpass;
    }

    private static double getOneYearIncrease(double increasingPopulation, double annualIncreasePercentage) {
        return increasingPopulation*(annualIncreasePercentage/100);

    }


}
