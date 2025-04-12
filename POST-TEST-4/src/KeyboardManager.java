import java.util.ArrayList;

class KeyboardManager {
    private ArrayList<Keyboard> keyboards;

    public KeyboardManager() {
        keyboards = new ArrayList<>();
    }

    public int getKeyboardSize() {
        return keyboards.size();
    }

    // overloading
    public void addKeyboard(String name, Switch switchType, Keycap keycap) {
        keyboards.add(new MechanicalKeyboard(name, switchType, keycap));
    }

    // overloading
    public void addKeyboard(String name, Keycap keycap) {
        keyboards.add(new MembraneKeyboard(name, null, keycap));
    }

    public void showAllKeyboards() {
        if (keyboards.isEmpty()) {
            System.out.println("No keyboards available.");
        } else {
            for (int i = 0; i < keyboards.size(); i++) {
                keyboards.get(i).display();
                System.out.println("\n");
            }
        }
    }

    public void showNameOfAllKeyboards() {
        if (keyboards.isEmpty()) {
            System.out.println("No keyboards available.");
        } else {
            for (int i = 0; i < keyboards.size(); i++) {
                System.out.println((i + 1) + ". " + keyboards.get(i).getName());
            }
        }
    }

    // overloading
    public void updateKeyboard(int index, String name, Switch switchType,
            Keycap keycap) {
        keyboards.set(index, new MechanicalKeyboard(name, switchType, keycap));
        System.out.println("Keyboard updated successfully.");
    }

    // overloading
    public void updateKeyboard(int index, String name, Keycap keycap) {
        keyboards.set(index, new MembraneKeyboard(name, null, keycap));
        System.out.println("Keyboard updated successfully.");
    }

    public void deleteKeyboard(int index) {
        keyboards.remove(index);
    }
}