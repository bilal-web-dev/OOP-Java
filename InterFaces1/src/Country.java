
import java.util.ArrayList;

public class Country implements Stats {

    private String name;
    int Array[] = new int[] { 1000, 2000, 3000, 4000 };
    ArrayList<Integer> list = new ArrayList<>();

    public Country(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public double computeArea() {
        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        for (int i = 0; i < list.size(); i++) {
            sum1 += list.get(i);

        }
        double total = sum1 + sum;
        System.out.println(" The Area is " + total);
        return total;

    }

    @Override
    public void resetArea() {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = 0;

        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, 0);

        }
    }

}
