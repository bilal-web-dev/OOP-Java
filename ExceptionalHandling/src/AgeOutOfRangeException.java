public class AgeOutOfRangeException extends Exception {

    @Override
    public String getMessage() {
        return "You are older than Your age.";
    }

}
