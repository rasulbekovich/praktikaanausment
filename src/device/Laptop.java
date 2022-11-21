package device;

import accontument.Accontument;

public class Laptop extends Accontument {
    private String operationSistem;
    public Laptop(String name, String image, double price, String description, String operationSistem) {
        super(name, image, price, description);
        this.operationSistem=operationSistem;
    }

    public String getOperationSistem() {
        return operationSistem;
    }

    public void setOperationSistem(String operationSistem) {
        this.operationSistem = operationSistem;
    }

    @Override
    public String toString() {
        return "Laptop{" +super.toString()+
                "operationSistem='" + operationSistem + '\'' +
                '}';
    }
}
