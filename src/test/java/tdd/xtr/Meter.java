package tdd.xtr;

/**
 * Created by m on 17/12/16.
 */
class Meter {
    private int length;

    public Meter(int length) {
        this.length = length;
    }

    public Meter times(int multiplier) {
        return new Meter(length * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Meter meter = (Meter) obj;
        return meter.length == this.length;

    }
}
