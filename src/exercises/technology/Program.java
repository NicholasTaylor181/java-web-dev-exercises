package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer desktop = new Computer(16, 500, "Dell");
        System.out.println(desktop.getRamGb());

        Laptop lappy = new Laptop(8, 250, "Lenovo");
        System.out.println(lappy.getBrand());
        lappy.close();
        lappy.open();

        SmartPhone moto = new SmartPhone(4, 64, "Motorola", true);
        moto.expandStorage(16);

        SmartPhone iPhone = new SmartPhone(4, 256, "Apple", false);
        iPhone.expandStorage(8);

        System.out.println(desktop.getId());
        System.out.println(lappy.getId());
        System.out.println(moto.getId());
        System.out.println(iPhone.getId());
    }
}
