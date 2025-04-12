import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User("Matcha");
        Scanner scanner = new Scanner(System.in);
        KeyboardManager manager = new KeyboardManager();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Mechanical Keyboard Manager ---");
            System.out.println("Current User: " + user.getName());
            System.out.println("1. Add Keyboard");
            System.out.println("2. Show All Keyboards");
            System.out.println("3. Update Keyboard");
            System.out.println("4. Delete Keyboard");
            System.out.println("5. Change Username");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter index keyboard type (1. Mechanical/2. Membrane): ");
                    String type = scanner.nextLine();

                    if (!type.equals("1") && !type.equals("2")) {
                        System.out.println("Invalid keyboard type. Please try again.");
                        break;
                    }

                    System.out.print("Enter keyboard name\t\t: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter keycap material\t\t: ");
                    String material = scanner.nextLine();
                    System.out.print("Enter keycap profile\t\t: ");
                    String profile = scanner.nextLine();
                    Keycap keycap = new Keycap(material, profile);

                    if (type.equals("1")) {
                        System.out.print("Enter switch type\t\t: ");
                        String switchType = scanner.nextLine();
                        System.out.print("Enter switch actuation force\t: ");
                        String actuationForce = scanner.nextLine();
                        Switch keyboardSwitch = new Switch(switchType, actuationForce);
                        manager.addKeyboard(name, keyboardSwitch, keycap);
                    } else {
                        manager.addKeyboard(name, keycap);
                    }

                    System.out.println("Keyboard added successfully.");
                    break;

                case 2:
                    manager.showAllKeyboards();
                    break;

                case 3:
                    manager.showNameOfAllKeyboards();
                    System.out.print("Enter index of keyboard to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    if (updateIndex < 0 || updateIndex >= manager.getKeyboardSize()) {
                        System.out.println("Invalid index.");
                        break;
                    }
                    scanner.nextLine();
                    System.out.print("Enter new keyboard type (1. Mechanical / 2. Membrane): ");
                    String newType = scanner.nextLine();

                    System.out.print("Enter new keyboard name\t\t: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new keycap material\t: ");
                    String newMaterial = scanner.nextLine();
                    System.out.print("Enter new keycap profile\t: ");
                    String newProfile = scanner.nextLine();
                    Keycap newKeycap = new Keycap(newMaterial, newProfile);

                    if (newType.equals("1")) {
                        System.out.print("Enter new switch type\t\t: ");
                        String newSwitchType = scanner.nextLine();
                        System.out.print("Enter new actuation force\t: ");
                        String newActuationForce = scanner.nextLine();
                        Switch newSwitch = new Switch(newSwitchType, newActuationForce);

                        manager.updateKeyboard(updateIndex, newName, newSwitch, newKeycap);
                    } else if (newType.equals("2")) {
                        manager.updateKeyboard(updateIndex, newName, newKeycap);
                    } else {
                        System.out.println("Invalid keyboard type.");
                    }

                    break;
                case 4:
                    manager.showNameOfAllKeyboards();
                    System.out.print("Enter index of keyboard to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex < 0 || deleteIndex >= manager.getKeyboardSize()) {
                        System.out.println("Invalid index.");
                        break;
                    }
                    scanner.nextLine();
                    manager.deleteKeyboard(deleteIndex);
                    break;
                case 5:
                    System.out.print("Enter new username\t\t: ");
                    String newUsername = scanner.nextLine();

                    user.setName(newUsername);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}