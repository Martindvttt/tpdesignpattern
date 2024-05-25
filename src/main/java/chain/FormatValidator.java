package chain;
import java.util.regex.Pattern;

public class FormatValidator extends Validator {
    private static final Pattern PATTERN = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$");

    @Override
    public void validate(String data) {
        if (PATTERN.matcher(data).matches() && !data.contains(" ")) {
            System.out.println("Format is valid.");
            super.validate(data);
        } else {
            System.out.println("Format is invalid.");
        }
    }
}