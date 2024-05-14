package regex;

public class DateRegex implements Regex {

        public static final String REGEX_PATTERN = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";
        private String regex = REGEX_PATTERN;
        private String errorMessage = "Ban da nhap sai vui long nhap lai";

        @Override
        public String getRegex() {
            return regex;
        }

        @Override
        public void setRegex(String regex) {
            this.regex = regex;
        }

        @Override
        public String toString() {
            return "DateRegex{" +
                    "regex='" + regex + '\'' +
                    ", errorMessage='" + errorMessage + '\'' +
                    '}';
        }

        @Override
        public boolean validate(String input) {
            return input.matches(regex);
        }

        @Override
        public String getErrorMessage() {
            return errorMessage;
        }

        @Override
        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }
}
