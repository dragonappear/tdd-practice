package me.dragonappear.tddstudy.chapter1;

public class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Pair other = (Pair) obj;

        return from.equals(other.from) && to.equals(other.to);
    }
}
