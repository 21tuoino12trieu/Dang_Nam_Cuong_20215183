public class Lab02Aims {


    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Frozen", "Animation", "Chris", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Zootopia", "Animation", "Rich", 87, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd1);

        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}