package Entity;

import java.util.Objects;

public class SauceLabsUsers {
    private String login, password;

    public SauceLabsUsers() {}

    public SauceLabsUsers(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SauceLabsUsers that = (SauceLabsUsers) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "SauceLabsUsers{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
