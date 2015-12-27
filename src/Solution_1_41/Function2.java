package Solution_1_41;

@FunctionalInterface
public interface Function2<Function, Input, Output> {
    public Output apply(Function function, Input input);
}
