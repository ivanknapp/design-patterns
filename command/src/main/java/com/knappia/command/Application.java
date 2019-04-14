package com.knappia.command;

public class Application {
    public static void main(String[] args) {
        final Wizard wizard = new Wizard();
        final Goblin goblin = new Goblin();

        final InvisibilitySpell invisibilitySpell = new InvisibilitySpell(goblin);
        final ShrinkSpell shrinkSpell = new ShrinkSpell(goblin);

        wizard.castSpell(invisibilitySpell, goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.castSpell(shrinkSpell, goblin);
        goblin.printStatus();

        wizard.castSpell(invisibilitySpell, goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        wizard.undoLastSpell();
        goblin.printStatus();
    }
}
