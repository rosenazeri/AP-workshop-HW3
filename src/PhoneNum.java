public class PhoneNum {
    private String countryCode;
    private String number;

    public PhoneNum(String countryCode, String number) {
        this.countryCode = countryCode;
        if (number.length() == 10) {
            this.number = number;
        } else {
            this.number = "invalid number";
        }
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() == 10) {
            this.number = number;
        } else {
            this.number = "invalid number";
        }
    }

    @Override
    public String toString() {
        return countryCode + " " + number;
    }
}