package com.knappia.composite;

public class Letter extends LetterComposite {

    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    @Override
    protected void printBefore() {
        System.out.print(aChar);
    }
}
