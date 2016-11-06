package com.udacity.firebase.shoppinglistplusplus;

import com.google.firebase.FirebaseApp;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }

}