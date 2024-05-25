package chain;

public class LengthValidator extends Validator {
    @Override
    public void validate(String data) {
        if (data.length() >= 8 && data.length() <= 20) {
            System.out.println("Length is valid.");
            super.validate(data);
        } else {
            System.out.println("Length is invalid.");
        }
    }
}
