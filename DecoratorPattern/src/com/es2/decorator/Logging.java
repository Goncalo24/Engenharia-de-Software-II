package com.es2.decorator;

import java.io.IOException;

public class Logging extends Decorator {
    // Constructor
    public Logging(AuthInterface auth) {
        super(auth);
    }

    @Override
    public void auth(String username, String password) throws AuthException, IOException {
        System.out.printf("(%d),auth()", System.currentTimeMillis());
        super.auth(username, password);
    }
}
