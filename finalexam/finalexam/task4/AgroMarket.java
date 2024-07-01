package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

public class AgroMarket implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Farmer> farmers;

    public AgroMarket(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
        this.farmers = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addFarmer(Farmer farmer) {
        farmers.add(farmer);
    }

    public boolean removeFarmer(Farmer farmer) {
        return farmers.remove(farmer);
    }

    public List<Farmer> getFarmers() {
        return new ArrayList<>(farmers); // Return a copy to prevent external modification
    }

    @Override
    public String toString() {
        return "AgroMarket [address=" + address + ", vatNumber=" + vatNumber + ", farmers=" + farmers + "]";
    }
}

