package refactor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestSubscriptionProcessor {

    private SubscriptionProcessor check;

    @BeforeEach
    void setUp() {
        check = new SubscriptionProcessor();
    }

    @ParameterizedTest
    @CsvSource({
            "Video, Monthly, 120",
            "Video, Quarterly, 80",
            "Video, Annual, 60",
            "Music, Monthly, 240",
            "Music, Quarterly, 200",
            "Music, Annual, 150",
            "Podcast, Monthly, 600",
            "Podcast, Quarterly, 400",
            "Podcast, Annual, 300"
    })
    void testSubscriptionCost(String subscriptionType, String billingFrequency, int expectedCost) {
        int result = check.createSubscriptionAndCalculateCost(subscriptionType, billingFrequency);
        assertEquals(expectedCost, result);
    }
}