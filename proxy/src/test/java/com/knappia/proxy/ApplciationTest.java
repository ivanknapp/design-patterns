package com.knappia.proxy;

import mockit.Mock;
import mockit.MockUp;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.knappia.proxy.LoggerUtils.logger;

public class ApplciationTest {

    @Test
    public void appTest() {
        new MockUp<LoggerFactory>() {
            @Mock
            public Logger getLogger(Class clazz) {
                return logger;
            }
        };
        String[] args = {};
        Application.main(args);

    }
}
