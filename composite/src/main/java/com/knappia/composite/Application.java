package com.knappia.composite;

public class Application {
    public static void main(String[] args) {
        Word word1 = new Word(new Letter('H'), new Letter('e'), new Letter('l'), new Letter('l'), new Letter('o'));
        Word word2 = new Word(new Letter('w'), new Letter('o'), new Letter('r'), new Letter('l'), new Letter('d'));
        Sentence sentence = new Sentence(word1, word2);
        sentence.print();
    }
}
