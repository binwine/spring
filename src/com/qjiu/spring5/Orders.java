package com.qjiu.spring5;

/**
 *
 */
public class Orders {
    private String oName;
    private String address;

    public Orders(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oName='" + oName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
