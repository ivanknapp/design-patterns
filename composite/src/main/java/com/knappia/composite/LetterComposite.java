package com.knappia.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letterComposite) {
        children.add(letterComposite);
    }

    protected void printBefore() {
    }

    protected void printAfter() {
    }

    public void print() {
        printBefore();
        children.forEach(LetterComposite::print);
        printAfter();
    }
}
