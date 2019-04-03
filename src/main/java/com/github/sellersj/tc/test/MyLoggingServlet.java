package com.github.sellersj.tc.test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyLoggingServlet extends GenericServlet {

    /** */
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        super.init();

        log("my log in init() method");
        log("logging exception in init() method ", new RuntimeException("an exception in init"));
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log("This is the log  for " + req);
    }

}
