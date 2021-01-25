package com.renjie.crm.entity;


import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    String accountId;
    String password;
    String master;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", password='" + password + '\'' +
                ", master='" + master + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getAccountId(), account.getAccountId()) && Objects.equals(getPassword(), account.getPassword()) && Objects.equals(getMaster(), account.getMaster());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountId(), getPassword(), getMaster());
    }
}
