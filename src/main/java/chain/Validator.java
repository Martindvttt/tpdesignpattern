package chain;

public abstract class Validator {
    protected Validator successor;

    public void setSuccessor(Validator successor) {
        this.successor = successor;
    }

    public void validate(String data) {
        if (successor != null) {
            successor.validate(data);
        }
    }
}
