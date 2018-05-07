package pl.sda;

public class Card {
    private String number;
    private String issuer = "UNKNOWN";
    private boolean verificationPassed = false;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isVerificationPassed() {
        return verificationPassed;
    }

    public void setVerificationPassed(boolean verificationPassed) {
        this.verificationPassed = verificationPassed;
    }

    @Override
    public String toString() {
        return "\nCard{" +
                "number ='" + number + '\'' +
                ", issuer ='" + issuer + '\'' +
                ", verificationPassed =" + verificationPassed +
                "}";
    }
}
