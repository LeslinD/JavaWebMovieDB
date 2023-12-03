package entity;

import exce.GenderException;
import util.SQLUtil;

public class Person {
    public Integer id;
    public String name;
    public int gender;

    /** Getters which return the attribute name, attribute type in MySQL, and the exact value. */
    public SQLUtil.DataInfo getId() {
        return new SQLUtil.DataInfo("id", SQLUtil.DataType.BIGINT, this.id);
    }
    public SQLUtil.DataInfo getName() {
        return new SQLUtil.DataInfo("name", SQLUtil.DataType.VARCHAR, this.name);
    }
    public SQLUtil.DataInfo getGender() {
        return new SQLUtil.DataInfo("gender", SQLUtil.DataType.INT, this.gender);
    }

    /** Setters. */
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(int gender) {
        try {
            if (! (gender == 0 || gender == 1 || gender == 2) )
                throw new GenderException();
        } catch (GenderException ge) {
            ge.printStackTrace();
        }
        this.gender = gender;
    }
}
