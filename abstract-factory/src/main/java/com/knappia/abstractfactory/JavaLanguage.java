package com.knappia.abstractfactory;

public class JavaLanguage implements Language {
    public static final String DESCRIPTION = "Java language";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
