package exercises.technology;

public class Laptop extends Computer {
    private boolean isFolded;

    public Laptop(int aRamGb, int aStorageGb, String aBrand) {
        super(aRamGb, aStorageGb, aBrand);
    }

    public void open() {
        isFolded = false;
        System.out.println(getBrand() + " " + getStorageGb() + " Gb Storage " + getRamGb() + "Gb Memory    Hello!");
    }

    public void close() {
        isFolded = true;
        System.out.println(getBrand() + " Goodbye!");
    }
}
