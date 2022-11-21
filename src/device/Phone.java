package device;

import accontument.Accontument;

public class Phone extends Accontument {
    private String produkt;
    private int memory;
    public Phone(String name, String image, double price, String description,String produkt,int memory) {
        super(name, image, price, description);
        this.memory=memory;
        this.produkt=produkt;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +super.toString()+
                "produkt='" + produkt + '\'' +
                ", memory=" + memory +
                '}';
    }
}
