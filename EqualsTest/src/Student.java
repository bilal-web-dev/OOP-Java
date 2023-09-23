public class Student {
    public int id;
    public String course;

    public Student(int id, String course) {
        this.id = id;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;

        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if (this.id == s.id) {
                return true;
            }
        }
        return false;
    }
}
