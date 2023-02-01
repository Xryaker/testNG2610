package data;

public enum WIKILanguage {
    ENGLISH("en"),
    ESPANIOL("es"),
    FRANCE("fr");
    private String lang;

    WIKILanguage(String en) {
        this.lang = en;
    }

    public String getLang() {
        return lang;
    }
}
