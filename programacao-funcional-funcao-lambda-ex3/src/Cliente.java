public class Cliente {

    private String nome;
    private double salario;
    private int tempoEmpregado;
    private boolean restricoesSPC;
    private boolean pagamentosAtraso;

    public Cliente(String nome, double salario, int tempoEmpregado, boolean restricoesSPC, boolean pagamentosAtraso) {
        this.nome = nome;
        this.salario = salario;
        this.tempoEmpregado = tempoEmpregado;
        this.restricoesSPC = restricoesSPC;
        this.pagamentosAtraso = pagamentosAtraso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoEmpregado() {
        return tempoEmpregado;
    }

    public void setTempoEmpregado(int tempoEmpregado) {
        this.tempoEmpregado = tempoEmpregado;
    }

    public boolean temRestricoesSPC() {
        return restricoesSPC;
    }

    public void setRestricoesSPC(boolean restricoesSPC) {
        this.restricoesSPC = restricoesSPC;
    }

    public boolean temPagamentosAtraso() {
        return pagamentosAtraso;
    }

    public void setPagamentosAtraso(boolean pagamentosAtraso) {
        this.pagamentosAtraso = pagamentosAtraso;
    }


}
