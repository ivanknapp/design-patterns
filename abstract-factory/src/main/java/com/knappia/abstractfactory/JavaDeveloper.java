package com.knappia.abstractfactory;

public class JavaDeveloper implements Developer {
    public static final String DESCRIPTION = "Java developer";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
