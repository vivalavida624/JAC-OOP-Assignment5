package Assignment05;

public class Pair<T, P>{
    private T x;
    private P p;

    public Pair() {
    }

    public Pair(T x, P p) {
        this.x = x;
        this.p = p;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", p=" + p +
                '}';
    }
}
