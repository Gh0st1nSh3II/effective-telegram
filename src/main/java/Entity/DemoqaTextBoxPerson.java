package Entity;

import java.util.Objects;

public class DemoqaTextBoxPerson {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    public DemoqaTextBoxPerson() {}

    public DemoqaTextBoxPerson(String fullName, String email, String currentAddress, String permanentAddress) {
        this.fullName = fullName;
        this.email = email;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoqaTextBoxPerson that = (DemoqaTextBoxPerson) o;
        return Objects.equals(fullName, that.fullName) && Objects.equals(email, that.email) && Objects.equals(currentAddress, that.currentAddress) && Objects.equals(permanentAddress, that.permanentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, email, currentAddress, permanentAddress);
    }

    @Override
    public String toString() {
        return   fullName + '\''
                + email + '\''
                + currentAddress + '\'' +
                 permanentAddress + '\'';
    }
}
