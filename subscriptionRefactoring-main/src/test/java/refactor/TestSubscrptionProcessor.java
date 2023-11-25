package refactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSubscrptionProcessor {
	
	private SubscriptionProcessor check;
	
	@BeforeEach
	void setUp() {
		check = new SubscriptionProcessor();
	}
	
	@Test
	void getTwelveMonthCostForVideoMonthlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Video", "Monthly");
		assertEquals(120, result);
	}

	@Test
	void getTwelveMonthCostForVideoQuarterlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Video", "Quarterly");
		assertEquals(80, result);
	}
	
	@Test
	void getTwelveMonthCostForVideoAnnualSubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Video", "Annual");
		assertEquals(60, result);
	}
	
	@Test
	void getTwelveMonthCostForMusicMonthlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Music", "Monthly");
		assertEquals(240, result);
	}

	@Test
	void getTwelveMonthCostForMusicQuarterlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Music", "Quarterly");
		assertEquals(200, result);
	}
	
	@Test
	void getTwelveMonthCostForMusicAnnualSubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Music", "Annual");
		assertEquals(150, result);
	}
	
	@Test
	void getTwelveMonthCostForPodcastMonthlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Podcast", "Monthly");
		assertEquals(600, result);
	}

	@Test
	void getTwelveMonthCostForPodcastQuarterlySubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Podcast", "Quarterly");
		assertEquals(400, result);
	}
	
	@Test
	void getTwelveMonthCostForPodcastAnnualSubscription() {
		
		int result = check.createSubscriptionAndCalculateCost("Podcast", "Annual");
		assertEquals(300, result);
	}
}
