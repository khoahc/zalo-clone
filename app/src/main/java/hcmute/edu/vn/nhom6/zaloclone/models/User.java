package hcmute.edu.vn.nhom6.zaloclone.models;

import java.io.Serializable;

public class User implements Serializable {
    private String name, phoneNumber, token, lastMsgTime, lastMessage;
    private int image;

    public User(){};
    public User(String name, int image, String lastMessage, String lastMsgTime) {
        this.name = name;
        this.image = image;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(String lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
