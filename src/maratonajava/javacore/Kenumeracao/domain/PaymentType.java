package maratonajava.javacore.Kenumeracao.domain;

public enum PaymentType {
    debit {
        @Override
        public double calculateSetOff(double value) {
            return value * 0.1;
        }
    }, credit {
        @Override
        public double calculateSetOff(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateSetOff(double value);

}
