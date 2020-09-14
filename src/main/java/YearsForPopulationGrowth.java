import java.lang.Math;

public class YearsForPopulationGrowth {
    public static int of(
        double initialPopulation,
        double annualIncreasePercentage,
        int populationToSurpass
    ) {
        if (initialPopulation < 1) {
            return -1;
        }
        if (initialPopulation > populationToSurpass) {
            return 0;
        }
        return getYearsToSurpass(
            initialPopulation,
            annualIncreasePercentage,
            populationToSurpass
        );  
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
