package com.example.md4_binding_mail.model;

public class Mail {
    private int id;
    private String languages;
    private int size;
    private String signature;

    public Mail() {
    }

    public Mail(int id, String languages, int size, String signature) {
        this.id = id;
        this.languages = languages;
        this.size = size;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", languages='" + languages + '\'' +
                ", size=" + size +
                ", signature='" + signature + '\'' +
                '}';
    }
}
