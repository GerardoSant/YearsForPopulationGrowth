import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class YearsForPopulationGrowth_ {

    /* Example invocation:
     *
     * YearsForPopulationGrowth.of(
     *     initialPopulation,
     *     increasingPercentagePerYear,
     *     populationToSurpass
     * );
     */

    @Test
    public void should_return_minus1_given_initialBelow1() {
        assertThat(YearsForPopulationGrowth.of(0, 10, 1000)).isEqualTo(-1);
        assertThat(YearsForPopulationGrowth.of(0, 35, 300)).isEqualTo(-1);
        assertThat(YearsForPopulationGrowth.of(0, 25, 400)).isEqualTo(-1);
        assertThat(YearsForPopulationGrowth.of(-1, 25, 400)).isEqualTo(-1);
        assertThat(YearsForPopulationGrowth.of(-500, 25, 400)).isEqualTo(-1);
    }

    @Test
    public void should_return_0_given_surpassBelowInitial() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 999)).isEqualTo(0);
        assertThat(YearsForPopulationGrowth.of(2000, 10, 800)).isEqualTo(0);
        assertThat(YearsForPopulationGrowth.of(32000, -10, -100)).isEqualTo(0);
    }

    @Test
    public void should_return_1_given_initial1000_percentage10_surpass1000() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1000)).isEqualTo(1);
    }

    @Test
    public void should_return_1_given_initial1000_percentage10_surpass1099() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1099)).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_initial1000_percentage10_surpass1100() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1100)).isEqualTo(2);
    }

    @Test
    public void should_return_2_given_initial1000_percentage10_surpass1209() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1209)).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_initial1000_percentage10_surpass1210() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1210)).isEqualTo(3);
    }

    @Test
    public void should_return_5_given_initial1000_percentage10_surpass1609() {
        assertThat(YearsForPopulationGrowth.of(1000, 10, 1609)).isEqualTo(5);
    }
}
