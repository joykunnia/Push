package com.okpos.push;

/**
 * Created by hyowon on 2015-01-19.
 */
public class Device {
    String shop_cd;
    String uuid;
    String registration_id;

    public String getShop_cd() {
        return shop_cd;
    }

    public void setShop_cd(String shop_cd) {
        this.shop_cd = shop_cd;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }
}
