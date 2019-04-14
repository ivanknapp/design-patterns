package com.knappia.command;

public class ShrinkSpell extends Command {
    private final Target target;

    public ShrinkSpell(Target target) {
        this.target = target;
    }

    @Override
    public void execute(Target target) {
        target.setSize(Size.SMALL);
    }

    @Override
    public void undo() {
        if (target != null) {
            target.setSize(Size.NORMAL);
        }
    }

    @Override
    public void redo() {
        if (target != null) {
            target.setSize(Size.SMALL);
        }

    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
