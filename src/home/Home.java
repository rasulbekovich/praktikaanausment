package home;

import accontument.Accontument;

public class Home extends Accontument {
    private String homeType;
    private int maxGuest;
    public Home(String name, String image, double price, String description, String homeType,int maxGuest) {
        super(name, image, price, description);
        this.homeType=homeType;
        this.maxGuest=maxGuest;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return "Home{" +super.toString()+
                "homeType='" + homeType + '\'' +
                ", maxGuest=" + maxGuest +
                '}';
    }
}
