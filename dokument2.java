package com.example.model;

/**
 * Reprezentuje zamówienie.
 */
public class Order {
    private int orderId;
    private User user;

    /**
     * Tworzy nowe zamówienie z określonym identyfikatorem i użytkownikiem.
     * @param orderId identyfikator zamówienia
     * @param user użytkownik składający zamówienie
     */
    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
    }

    /**
     * Pobiera identyfikator zamówienia.
     * @return identyfikator zamówienia
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Ustawia identyfikator zamówienia.
     * @param orderId nowy identyfikator zamówienia
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Pobiera użytkownika składającego zamówienie.
     * @return użytkownik składający zamówienie
     */
    public User getUser() {
        return user;
    }

    /**
     * Ustawia użytkownika składającego zamówienie.
     * @param user nowy użytkownik składający zamówienie
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Przetwarza zamówienie.
     */
    public void processOrder() {
        // kod przetwarzający zamówienie
        user.sendMessage("Your order has been processed.");
    }
}
