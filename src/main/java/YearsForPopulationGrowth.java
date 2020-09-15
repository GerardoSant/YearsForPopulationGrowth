import java.lang.Math;

public class YearsForPopulationGrowth {
    /**
     * Calculates the number of whole years required to surpass
     * the provided population with a steady annual growth rate
     *
     * @param initialPopulation           Initial population, must be greater
     *                                    than 0 to calculate any growth time
     *
     * @param annualIncreasePercentage    Yearly population growth percentage
     *                                    100 duplicates population in a year
     *
     * @param populationToSurpass         Population to surpass. The function
     *                                    will return 0 if initial population
     *                                    is already greater than this amount
     *
     * @return                            -1 for initial populations that are
     *                                    less or equal to 0, exactly 0 given
     *                                    an initial population exceeding the
     *                                    population to surpass, or any other
     *                                    positive integer when none of these
     *                                    conditions are met
     */
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
