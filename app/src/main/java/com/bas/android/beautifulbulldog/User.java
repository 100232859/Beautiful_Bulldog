package com.bas.android.beautifulbulldog;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bas on 9/27/17.
 */

public class User extends RealmObject implements Serializable {
    @PrimaryKey
    private String username;

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }
}
