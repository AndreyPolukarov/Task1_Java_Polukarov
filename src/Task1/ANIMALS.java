package Task1;
public abstract class ANIMALS {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public ANIMALS(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

