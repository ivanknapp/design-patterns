package com.knappia.adapter;

public class Captain {
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public Captain() {
    }

    public void setRowingBoat(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }
}
