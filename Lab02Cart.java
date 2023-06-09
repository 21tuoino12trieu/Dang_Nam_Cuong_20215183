public class Lab02Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public int j;

    public void addDigitalVideoDisc(DigitalVideoDisc item) {
        if (qtyOrdered == MAX_NUMBER_ORDERED - 1)
            System.out.println("The cart is full.");
        else {
            itemsOrdered[qtyOrdered] = item;
            this.qtyOrdered++;
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc item) {
        if (qtyOrdered == 0)
            System.out.println("There is no item!");
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == item) {
                    itemsOrdered[i] = null;
                    j = i;
                }
            }
            for (int i = j; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            qtyOrdered--;
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public Cart() {
    }
}