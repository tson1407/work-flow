package com.test.test_git.model;

public enum ShippingStatus {
    NOT_SHIPPED("Chưa vận chuyển"),
    SHIPPED("Đã vận chuyển"),
    DELIVERED("Đã giao hàng"),
    RETURNED("Đã trả lại");

    private String displayName;

    ShippingStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
