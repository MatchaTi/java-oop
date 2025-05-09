// penerapan interface keyword
interface KeyboardInterface {
    public String getName();

    public String getSwitchType();

    public String getKeycap();

    public void display();
}

// penerapan abstract keyword pada super class
abstract class Keyboard implements KeyboardInterface {
    private String name;
    private Switch switchType;
    private Keycap keycap;
    // penerapan final keyword pada attribute
    // penerapan static keyword pada attribute
    final static String KEYBOARD_TYPE = "Keyboard";

    public Keyboard(String name, Switch switchType, Keycap keycap) {
        this.name = name;
        this.switchType = switchType;
        this.keycap = keycap;
    }

    // penerapan final keyword pada method
    public final String getName() {
        return this.name;
    }

    // penerapan final keyword pada method
    public final String getSwitchType() {
        return this.switchType.getType();
    }

    // penerapan final keyword pada method
    public final String getKeycap() {
        return this.keycap.getMaterial();
    }

    // penerapan abstract keyword pada method
    public abstract void display();
}