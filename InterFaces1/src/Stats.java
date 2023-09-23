public interface Stats {

    String field = "Sq.km";

    void resetArea();

    double computeArea();

    default void print() {
        System.out.println("Print FUCK OFF");
    }

}
