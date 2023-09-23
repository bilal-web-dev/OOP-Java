public class Course {

    private int courseCode;
    private String courseTitle;

    public Course(int courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
