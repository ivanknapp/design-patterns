package com.knappia.facade;

public class Application {
    public static void main(String[] args) {
        final ITCompanyFacade facade = new ITCompanyFacade();
        facade.createOneDayApplication();
    }
}
