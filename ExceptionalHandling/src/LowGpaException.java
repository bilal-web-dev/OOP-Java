public class LowGpaException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Your Gpa is low";
    }

}
