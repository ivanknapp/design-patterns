package com.knappia.singleton;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public abstract class SingletonTest<S> {
    private final Supplier<S> getInstanceMethod;

    public SingletonTest(Supplier<S> getInstanceMethod) {
        this.getInstanceMethod = getInstanceMethod;
    }

    @Test
    public void notConcurrentTest() {
        final S instance1 = getInstanceMethod.get();
        final S instance2 = getInstanceMethod.get();
        final S instance3 = getInstanceMethod.get();

        assertNotNull(instance1);
        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance2, instance3);
    }
    @Test
    public void concurrentTest(){
        assertTimeout(Duration.ofMillis(10000),()->{
            final List<Callable<S>> tasks = new ArrayList<>(10000);
            for (int i = 0; i < 10000; i++) {
                tasks.add(getInstanceMethod::get);
            }

            final ExecutorService executorService = Executors.newFixedThreadPool(4);
            final List<Future<S>> futures = executorService.invokeAll(tasks);
            final S expected = getInstanceMethod.get();
            for (Future<S> f : futures) {
                final S actual = f.get();
                assertNotNull(actual);
                assertSame(expected, actual);
            }

            executorService.shutdown();
        });
    }
}
