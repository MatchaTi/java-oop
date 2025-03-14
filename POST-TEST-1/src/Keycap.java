class Keycap {
    private String material;
    private String profile;

    public Keycap(String material, String profile) {
        this.material = material;
        this.profile = profile;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProfile() {
        return profile;
    }
}