public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard(String name, Switch switchType, Keycap keycap) {
        super(name, switchType, keycap);
    }

    @Override
    public void display() {
        System.out.println("----- Mechanical Keyboard Information -----");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("Switch Type\t: " + this.getSwitchType());
        System.out.println("Keycap Material\t: " + this.getKeycap());
    }
}