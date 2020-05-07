import java.util.Calendar;

public class Calculo_horas {

    private double valor_base;

    public Calculo_horas(double valor_base) {
        this.valor_base = valor_base;
    }

    public double getValor_base() {
        return this.valor_base;
    }

    public void setValor_base(double valor_base) {
        this.valor_base = valor_base;
    }

    public double valor_base_hora(double valor_base) {
        return valor_base / 12;
    }
    public double valor_a_receber(double valor_base_hora, long resultado) {
        return valor_base_hora * resultado;
    }
}
