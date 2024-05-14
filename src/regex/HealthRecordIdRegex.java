package regex;

public class HealthRecordIdRegex implements Regex{
    public static final String REGEX_PATTERN = "BN-[0-9]{3}";
    private String regex = REGEX_PATTERN;
    private String errorMessage = "Ban da nhap sai vui long nhap lai";

    public HealthRecordIdRegex(){

    }

    @Override
    public String getRegex() {
        return this.regex;
    }

    @Override
    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean validate(String input) {
        return input.matches(this.regex);
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
