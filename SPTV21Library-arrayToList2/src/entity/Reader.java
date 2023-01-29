

package entity;

import java.io.Serializable;


public class Reader implements Serializable{
    private String firstname;
    private String lastname;
    private String phone;
    private int mony;

    public Reader() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMony() {
        return mony;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }

    @Override
    public String toString() {
        return "Client{" + "firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", mony=" + mony + '}';
    }
}
