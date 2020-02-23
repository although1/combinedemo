package com.hongyan.combinedemo.domain;




import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class Mainboard {
    private int id;
    private String mainboardname;
    private int mainicid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainboardname() {
        return mainboardname;
    }

    public void setMainboardname(String mainboardname) {
        this.mainboardname = mainboardname;
    }

    public int getMainicid() {
        return mainicid;
    }

    public void setMainicid(int mainicid) {
        this.mainicid = mainicid;
    }

    @Override
    public String toString() {
        return "Mainboard{" +
                "id=" + id +
                ", mainboardname='" + mainboardname + '\'' +
                ", mainicid=" + mainicid +
                '}';
    }
}
