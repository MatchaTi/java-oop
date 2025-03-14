class Keyboard {
    private String name;
    private Switch switchType;
    private Keycap keycap;

    public Keyboard(String name, Switch switchType, Keycap keycap) {
        this.name = name;
        this.switchType = switchType;
        this.keycap = keycap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Switch getSwitchType() {
        return switchType;
    }

    public void setSwitchType(Switch switchType) {
        this.switchType = switchType;
    }

    public Keycap getKeycap() {
        return keycap;
    }

    public void setKeycap(Keycap keycap) {
        this.keycap = keycap;
    }

    public void display() {
        System.out.println("----- Keyboard Information -----");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("Switch Type\t: " + switchType.getType());
        System.out.println("Actuation Force\t: " + switchType.getActuationForce());
        System.out.println("Keycap Material\t: " + keycap.getMaterial());
        System.out.println("Keycap Profile\t: " + keycap.getProfile());
        System.out.println("---------------------------------\n");
    }
}