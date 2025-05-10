package com.example.mophoneapp11.models;

public class CartItem {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String imageUrl;
    private String id; // Firestore document ID (nếu bạn muốn xóa item)


    // Constructor không tham số bắt buộc cho Firestore
    public CartItem() {
    }

    // Constructor đầy đủ
    public CartItem(String productId, String productName, double price, int quantity, String imageUrl, String id) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
