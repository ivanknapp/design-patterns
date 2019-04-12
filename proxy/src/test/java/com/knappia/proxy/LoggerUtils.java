package com.knappia.proxy;

import mockit.Mock;
import mockit.MockUp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.mock;

public class LoggerUtils {
    static Logger logger = mock(Logger.class);

    static {
        new MockUp<LoggerFactory>() {
            @Mock
            public Logger getLogger(Class clazz) {
                return logger;
            }
        };
    }
}
