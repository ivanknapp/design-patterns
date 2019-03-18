package com.knappia.composite;

import java.util.Arrays;

public class Sentence extends LetterComposite {

    public Sentence(Word... words) {
        Arrays.asList(words).forEach(this::add);
    }

    @Override
    protected void printAfter() {
        System.out.print(".");
    }
}
