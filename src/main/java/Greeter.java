public abstract class Greeter {

    public String getMessage() {
        return "Hello from " + getName() + "!";
    }

    protected abstract String getName();

}
