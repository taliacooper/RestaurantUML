public class Table {
    private String name;
    private MenuItem[] mi = new MenuItem[10];
    private int ItemCount = 0;

    public Table(String name, MenuItem[] mi) {
        this.name = name;
//        this.ItemCount = ItemCount;
        this.mi = mi;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    public void addItem(MenuItem a) {
        mi[ItemCount] = a;
        ItemCount++;
    }

    public MenuItem[] getItems() {
        return mi;
    }

    public int determinePrepTime() {
        int y = 0;
        for (int i = 0; i < mi.length; i++) {
            if (mi[i].getPrepTime() > y) {
                y = mi[i].getPrepTime();
            }
        }
        return y;
    }
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < ItemCount; i++) {
            total += mi[i].getItemPrice();
        }
        return total;
    }




    public String toString() {
        String a = "";
        String b = "";
        for (int i = 0; i < mi.length; i++) {
            if (mi[i] != null) {
                a = a + " " + mi[i].getName();
            }
        }
        return name + " ordered " + ItemCount + " items. " + "The preparation time for their food will be " +
                determinePrepTime() + " minutes. Their meal will cost a total of "
                + "$" + getTotalPrice();
//        return z;
    }


}




