package com.bas.android.beautifulbulldog;

import io.realm.RealmObject;

/**
 * Created by Bas on 9/27/17.
 */

public class Vote extends RealmObject {
    private User owner;
    private int rating;

    public void setOwner(User owner) { this.owner = owner; }

    public User getOwner() { return owner; }

    public int getRating() { return rating; }

    public void setRating(int rating) { this.rating = rating; }

}
