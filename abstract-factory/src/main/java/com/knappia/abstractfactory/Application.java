package com.knappia.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        DevFactory javaFactory = FactoryMaker.createFactory(FactoryMaker.DevType.JAVA);
        Language javaLang = javaFactory.getLanguage();
        Developer javaDev = javaFactory.getDeveloper();
        log.info("Language = {}, Dev = {}", javaLang.getDescription(), javaDev.getDescription());

        DevFactory pythonFactory = FactoryMaker.createFactory(FactoryMaker.DevType.PYTHON);
        Language pythonLang = pythonFactory.getLanguage();
        Developer pythonDev = pythonFactory.getDeveloper();
        log.info("Language = {}, Dev = {}", pythonLang.getDescription(), pythonDev.getDescription());
    }

    public static class FactoryMaker {
        public enum DevType {
            JAVA, PYTHON
        }

        public static DevFactory createFactory(DevType type) {
            switch (type) {
                case JAVA:
                    return new JavaDevFactory();
                case PYTHON:
                    return new PythonDevFactory();
                default:
                    throw new IllegalArgumentException("Illegal type " + type);
            }
        }
    }
}
