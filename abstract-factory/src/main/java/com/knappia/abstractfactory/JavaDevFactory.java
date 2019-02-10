package com.knappia.abstractfactory;

public class JavaDevFactory implements DevFactory{

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language getLanguage() {
        return new JavaLanguage();
    }
}
