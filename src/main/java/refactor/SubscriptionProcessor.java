package refactor;


public class SubscriptionProcessor {

	static int cost = 0;
	
	public static void main(String[] args) {		
		
		String subscriptionType = args[0]; // Possible value is Video, Music or Podcast
		String billingCycle = args[1]; // Possible value is Monthly, Quarterly or Annual
		SubscriptionProcessor process = new SubscriptionProcessor();
		process.createSubscriptionAndCalculateCost(subscriptionType, billingCycle);			
	}
	
	public int createSubscriptionAndCalculateCost(String subscriptionType, String billingCycle) {
		
		initiateSubscription(subscriptionType, billingCycle);	
		return getTotalCostforTwelveMonths(billingCycle);	
	}
	
	private static void initiateSubscription(String subscriptionType, String billingCycle) {
		// TODO #1 Refactor below switch block applying OOPS concepts and make it extendable for new types of subscriptions in future.
		// TODO #2 Create appropriate subscription object using factory pattern
				
				switch (subscriptionType) {		
				
					case "Video":	
						
						if("Monthly".equals(billingCycle)) {
							cost = 10;
						} else if("Quarterly".equals(billingCycle)) {
							cost = 20;
						} else if ("Annual".equals(billingCycle)) {
							cost = 60;
						}		
						
						initiateVideoSubscription(cost, billingCycle);
						break;
						
					case "Music":				
						
						if("Monthly".equals(billingCycle)) {
							cost = 20;
						} else if("Quarterly".equals(billingCycle)) {
							cost = 50;
						} else if ("Annual".equals(billingCycle)) {
							cost = 150;
						}	
						initiateMusicSubscription(cost, billingCycle);
						break;
						
					case "Podcast":				
						if("Monthly".equals(billingCycle)) {
							cost = 50;
						} else if("Quarterly".equals(billingCycle)) {
							cost = 100;
						} else if ("Annual".equals(billingCycle)) {
							cost = 300;
						}	
						initiatePodcastSubscription(cost, billingCycle);
				}				
	}
	
	// calculate total amount for next 12 months
	private static int getTotalCostforTwelveMonths(String billingCycle) {
		
		// TODO 3 Extract this logic to a function in appropriate class
		
		int total = 0;
		if("Monthly".equals(billingCycle)) {
			total = cost *12;
		} else if("Quarterly".equals(billingCycle)) {
			total = cost *4;
		} else if ("Annual".equals(billingCycle)) {
			total = cost *1;
		}		
		System.out.println("Total cost for next 12 months will be " + total);
		
		// TODO 4 Apply clean code principles as mucn as possible in final solution
		return total;
	}
	
	private static void initiateVideoSubscription(int cost, String billingCycle) {
		
		// Business logic to initiate Video subscription goes here. 
		
		System.out.println("Your " + billingCycle + " Video subscription created. Cost per cycle is " + cost);
	}
	
	private static void initiateMusicSubscription(int cost, String billingCycle) {
		
		// Business logic to initiate Music subscription
		System.out.println("Your " + billingCycle + " Music subscription created. Cost per cycle is " + cost);
	}
	
	private static void initiatePodcastSubscription(int cost, String billingCycle) {
		
		// Business logic to initiate Podcast subscription
		System.out.println("Your " + billingCycle +" Podcast subscription created. Cost per cycle is " + cost);
	}
	
	
}
