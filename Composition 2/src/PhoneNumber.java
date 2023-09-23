public class PhoneNumber {

    private int cityCode;
    private int countryCode;
    private int lineNumber;

    public PhoneNumber(int cityCode, int countryCode, int lineNumber) {
        this.cityCode = cityCode;
        this.countryCode = countryCode;
        this.lineNumber = lineNumber;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
