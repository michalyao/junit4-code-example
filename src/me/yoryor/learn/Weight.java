package me.yoryor.learn;

/**
 * Created by Michal on 2017/11/2 下午2:22.
 */
public enum Weight {
    DONTCARE(0), EXPECTED(5);

    Weight(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private int number;
}
