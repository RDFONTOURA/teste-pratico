import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
            "Ricardo",
            LocalDate.of(1990, 5, 10),
            new BigDecimal("3500.00"),
            "Desenvolvedor"
        );

        System.out.println(f1);
    }
}

class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal salario;
    private String cargo;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}