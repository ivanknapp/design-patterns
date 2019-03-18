package com.knappia.composite;

import java.util.Arrays;

public class Word extends LetterComposite {

    public Word(Letter... letters) {
        Arrays.asList(letters).forEach(this::add);
    }

    @Override
    protected void printBefore() {
        System.out.print(" ");
    }
}
