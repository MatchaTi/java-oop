class Switch {
    private String type;
    private String actuationForce;

    public Switch(String type, String actuationForce) {
        this.type = type;
        this.actuationForce = actuationForce;
    }

    public String getType() {
        return this.type;
    }

    public String getActuationForce() {
        return actuationForce;
    }
}