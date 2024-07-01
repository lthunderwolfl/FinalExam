package finalexam.task4;

public class AgroMarketTester {
    public static void main(String[] args) {
        // Create an instance of AgroMarket
        AgroMarket market = new AgroMarket("123 Main St, Farmville", "VAT123456");

        // Create some Farmer objects
        Farmer farmer1 = new Farmer("John Doe", "Doe Farms");
        Farmer farmer2 = new Farmer("Jane Smith", "Smith Orchards");

        // Add farmers to the market
        market.addFarmer(farmer1);
        market.addFarmer(farmer2);

        // Print the AgroMarket details
        System.out.println("AgroMarket details:");
        System.out.println(market);

        // Remove a farmer
        market.removeFarmer(farmer1);

        // Print the AgroMarket details after removal
        System.out.println("AgroMarket details after removing a farmer:");
        System.out.println(market);
    }
}

