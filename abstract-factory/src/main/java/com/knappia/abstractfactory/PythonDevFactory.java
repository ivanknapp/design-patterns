package com.knappia.abstractfactory;

public class PythonDevFactory implements DevFactory{

    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language getLanguage() {
        return new PythonLanguage();
    }
}
