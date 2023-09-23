public class Person {
    private int id;
    private String name;
    private Address add;

    public Person(int id, String name, Address add) {
        setId(id);
        setName(name);
        setAdd(add);

    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Address getAdd() {
        return add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}
