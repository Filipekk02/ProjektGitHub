/**
 * Pakiet zawierający klasy testowe do sprawdzania funkcjonalności.
 */
package com.example.test;

import com.example.model.User;
import com.example.model.Order;
import com.example.service.UserService;

/**
 * Klasa testująca funkcjonalność modelu danych i usług.
 */
public class MainTest {

    /**
     * Metoda główna programu, uruchamiająca testy.
     * @param args argumenty wiersza poleceń (nie są używane w tym przykładzie)
     */
    public static void main(String[] args) {
        // Tworzenie obiektów
        User user = new User("John Doe", "john@example.com");
        Order order = new Order(1, user);
        UserService userService = new UserService();

        // Rejestracja użytkownika
        userService.registerUser(user);

        // Przetwarzanie zamówienia
        order.processOrder();

        // Wysyłanie newslettera
        userService.sendNewsletter("Check out our latest offers!");
    }
}
