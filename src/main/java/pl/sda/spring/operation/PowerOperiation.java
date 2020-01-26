package pl.sda.spring.operation;

public class PowerOperiation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        int wynik = 1;
        while (arg2 > 0) {
            wynik *= arg1;
            arg2--;

        }
        return wynik;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.POWER;
    }
}
