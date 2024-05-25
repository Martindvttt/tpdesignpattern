package chain;

public class Main {
    public static void main(String[] args) {
        Validator formatValidator = new FormatValidator();
        Validator lengthValidator = new LengthValidator();
        Validator unicityValidator = new UnicityValidator();

        formatValidator.setSuccessor(lengthValidator);
        lengthValidator.setSuccessor(unicityValidator);

        String password = "SAf1nette76%?";

        formatValidator.validate(password);
    }
}
