package com.knappia.abstractfactory;

public class PythonLanguage implements Language {
    public static final String DESCRIPTION = "Python language";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
