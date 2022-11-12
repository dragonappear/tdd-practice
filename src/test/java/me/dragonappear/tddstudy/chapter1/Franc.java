package me.dragonappear.tddstudy.chapter1;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dollar && ((Franc) obj).amount == this.amount) {
            return true;
        }

        return false;
    }
}
