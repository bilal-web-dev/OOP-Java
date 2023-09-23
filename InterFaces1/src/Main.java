import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(0, 1000);

        for (int i = 1; i < list.size(); i++) {
            list.add(i, 1000 * i);
        }

        ArrayList<Stats> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Rectangle());

        // Country c = new Country(list);
        // Stats c1 = new Circle();
        // Stats r1 = new Rectangle();
        // printStats(c);
        // printStats(c1);
        // printStats(r1);

        display(list2);

    }

    public static void printStats(Stats i) {
        i.computeArea();
        i.resetArea();
    }

    public static void display(ArrayList<Stats> list2) {
        for (Stats i : list2) {
            i.computeArea();
        }
    }

}