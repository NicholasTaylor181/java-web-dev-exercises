package exercises.technology;

public class SmartPhone extends Computer {
    private boolean hasExpandableMemory;

    public SmartPhone(int aRamGb, int aStorageGb, String aBrand, boolean aHasExpandableMemory) {
        super(aRamGb, aStorageGb, aBrand);
        hasExpandableMemory = aHasExpandableMemory;
    }

    public void expandStorage(int aStorageGb) {
        if (hasExpandableMemory) {
            setStorageGb(getStorageGb() + aStorageGb);
            System.out.println("Your storage space is now " + getStorageGb() + "Gb");
        }else {
            System.out.println(getBrand() + " Sorry your phone does not have expandable storage!");
        }
    }
}
