package exercises.technology;

public class Computer extends AbstractEntity {
    private int ramGb;
    private int storageGb;
    private String brand;

    public Computer(int aRamGb, int aStorageGb, String aBrand) {
        ramGb = aRamGb;
        storageGb = aStorageGb;
        brand = aBrand;
    }

    public int getRamGb() {
        return ramGb;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public String getBrand() {
        return brand;
    }

    public void setStorageGb(int storageGb) {
        this.storageGb = storageGb;
    }
}
