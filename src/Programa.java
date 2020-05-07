import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do Médico: ");
        String nome_medico = sc.next();
        System.out.println("Digite o CRM: ");
        int crm_medico = sc.nextInt();
        System.out.println("Digite a UF do CRM: ");
        String uf_medico = (sc.next().toUpperCase());

        Medico medico = new Medico(nome_medico, crm_medico, uf_medico);
        System.out.println(medico.toString());


        System.out.println("Digite a Data de CheckIn no plantão: ");
        Date CheckIn = Date.from(Instant.parse((sc.next() + "T" + sc.next() + "Z").toString()));
        System.out.println("Digite a Data de CheckOut no plantão: ");
        Date CheckOut = Date.from(Instant.parse((sc.next() + "T" + sc.next() + "Z")));
        Datas data = new Datas(CheckIn, CheckOut);

        long resultado_data = data.duracao();

        System.out.println("Total de horas do plantão: ");
        System.out.println(CheckIn);
        System.out.println(CheckOut);
        System.out.println(resultado_data);

        System.out.println("Digite o valor base: ");
        double valor_base = sc.nextDouble();
        Calculo_horas calc = new Calculo_horas(valor_base);

        System.out.println("O valor da hora Plantão: ");
        System.out.println(calc.valor_base_hora(valor_base));
        System.out.println("Valor a ser pago ao Medico: " + medico.getNome_medico());
        System.out.println(calc.valor_a_receber(calc.valor_base_hora(valor_base), resultado_data));

        sc.close();
    }
}
