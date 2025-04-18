public class MembraneKeyboard extends Keyboard {
    public MembraneKeyboard(String name, Switch switchType, Keycap keycap) {
        super(name, switchType, keycap);
    }

    @Override
    public void display() {
        System.out.println("----- Membrane Keyboard Information -----");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("Keycap Material\t: " + this.getKeycap());
    }
}