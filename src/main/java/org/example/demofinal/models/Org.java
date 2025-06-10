package org.example.demofinal.models;

public class Org {
    private Integer id;
    private String org_type;
    private String names;
    private String ceo;
    private String phone;
    private String rating;

    public Org(Integer id, String org_type, String names, String ceo, String phone, String rating) {
        this.id = id;
        this.org_type = org_type;
        this.names = names;
        this.ceo = ceo;
        this.phone = phone;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
