package regex;

public interface Regex {
    public String getRegex();
    public void setRegex(String regex);
    public String toString();
    public boolean validate(String input);
    public String getErrorMessage();
    public void setErrorMessage(String errorMessage);
}
