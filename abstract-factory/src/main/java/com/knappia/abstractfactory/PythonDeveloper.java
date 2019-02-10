package com.knappia.abstractfactory;

public class PythonDeveloper implements Developer {
    public static final String DESCRIPTION = "Python developer";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
