package chain;
import java.util.Arrays;
import java.util.List;

public class UnicityValidator extends Validator {
    private List<String> existingPasswords = Arrays.asList("password1", "12345678", "admin123", "welcome1");

    @Override
    public void validate(String data) {
        if (!existingPasswords.contains(data)) {
            System.out.println("Password is unique.");
            super.validate(data);
        } else {
            System.out.println("Password already exists.");
        }
    }
}
