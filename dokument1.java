package com.example.model;

/**
 * Reprezentuje użytkownika.
 */
public class User {
    private String name;
    private String email;

    /**
     * Tworzy nowego użytkownika z określonym imieniem i adresem e-mail.
     * @param name imię użytkownika
     * @param email adres e-mail użytkownika
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Pobiera imię użytkownika.
     * @return imię użytkownika
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawia imię użytkownika.
     * @param name nowe imię użytkownika
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Pobiera adres e-mail użytkownika.
     * @return adres e-mail użytkownika
     */
    public String getEmail() {
        return email;
    }

    /**
     * Ustawia adres e-mail użytkownika.
     * @param email nowy adres e-mail użytkownika
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Wysyła wiadomość do użytkownika.
     * @param message treść wiadomości
     */
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        // kod wysyłający wiadomość
    }
}
