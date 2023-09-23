
public class Student {
    private String name;
    private String email;
    private String cnic;

    private Course course1;
    private Course course2;
    private Address postalAddress;
    private PhoneNumber contactNum;

    public Student(String name, String cnic, Address postalAddress) {
        this.name = name;
        this.cnic = cnic;
        this.postalAddress = postalAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    public PhoneNumber getContactNum() {
        return contactNum;
    }

    public void setContactNum(PhoneNumber contactNum) {
        this.contactNum = contactNum;
    }
}
