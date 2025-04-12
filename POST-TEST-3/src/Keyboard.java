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
        return this.name;
    }

    public String getSwitchType() {
        return this.switchType.getType();
    }

    public String getKeycap() {
        return this.keycap.getMaterial();
    }

    public void display() {
        System.out.println("----- Keyboard Information -----");
        System.out.println("Name\t\t: " + this.getName());
        System.out.println("Switch Type\t: " + this.switchType.getType());
        System.out.println("Actuation Force\t: " +
                this.switchType.getActuationForce());
        System.out.println("Keycap Material\t: " + this.keycap.getMaterial());
        System.out.println("Keycap Profile\t: " + this.keycap.getProfile());
        System.out.println("---------------------------------\n");
    }
}