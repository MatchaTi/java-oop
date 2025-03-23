import java.util.ArrayList;

class KeyboardManager {
    private ArrayList<Keyboard> keyboards;

    public KeyboardManager() {
        keyboards = new ArrayList<>();
    }

    public int getKeyboardSize() {
        return keyboards.size();
    }

    public void addKeyboard(Keyboard keyboard) {
        keyboards.add(keyboard);
    }

    public void showAllKeyboards() {
        if (keyboards.isEmpty()) {
            System.out.println("No keyboards available.");
        } else {
            for (int i = 0; i < keyboards.size(); i++) {
                keyboards.get(i).display();
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

    public void updateKeyboard(int index, Keyboard keyboard) {
        keyboards.set(index, keyboard);
        System.out.println("Keyboard updated successfully.");
    }

    public void deleteKeyboard(int index) {
        keyboards.remove(index);
    }
}