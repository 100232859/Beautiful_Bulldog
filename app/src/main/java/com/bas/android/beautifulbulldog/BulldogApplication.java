package com.bas.android.beautifulbulldog;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Bas on 9/27/17.
 */

public class BulldogApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
