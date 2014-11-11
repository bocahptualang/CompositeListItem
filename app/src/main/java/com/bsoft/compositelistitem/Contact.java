package com.bsoft.compositelistitem;

/**
 * Created by Budi on 11/11/2014.
 */
public class Contact {
    private String Name;
    private String Status;
    private String Photo;

    public Contact(String name, String status, String photo) {
        Name = name;
        Status = status;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }
}
