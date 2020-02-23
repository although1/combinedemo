package com.hongyan.combinedemo.domain;




public class MainIC {
    private int id;
    private String icname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcname() {
        return icname;
    }

    public void setIcname(String icname) {
        this.icname = icname;
    }

    @Override
    public String toString() {
        return "MainIC{" +
                "id=" + id +
                ", icname='" + icname + '\'' +
                '}';
    }
}
