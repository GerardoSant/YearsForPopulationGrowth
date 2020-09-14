import java.lang.Math;

public class YearsForPopulationGrowth {
    public static int of(double initialPopulation, double annualIncreasePercentage, int populationToSurpass ) {
        return initialPopulation<1 ? -1 : initialPopulation>populationToSurpass? 0:
                getYearsToSurpass(initialPopulation, annualIncreasePercentage, populationToSurpass);
    }

    private static int getYearsToSurpass(
        double initialPopulation,
        double annualIncreasePercentage,
        int populationToSurpass
    ) {
        float yearsToReach = (float)(
            Math.log(populationToSurpass / initialPopulation) /
            Math.log(1 + annualIncreasePercentage / 100)
        );
        return 1 + (int)Math.floor(yearsToReach);
    }
}
