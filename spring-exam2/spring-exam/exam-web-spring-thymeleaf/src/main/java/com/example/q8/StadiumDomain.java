package com.example.q8;

public class StadiumDomain {

    private Integer id;
    private String name;
    private String prefecureCode;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrefecureCode() {
        return prefecureCode;
    }
    public void setPrefecureCode(String prefecureCode) {
        this.prefecureCode = prefecureCode;
    }
    @Override
    public String toString() {
        return "StadiumDomain [id=" + id + ", name=" + name + ", prefecureCode=" + prefecureCode + "]";
    }

    
}
