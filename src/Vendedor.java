public class Vendedor {
    private String matricula;
    private String nome;
    private String sobrenome;
    private double salario;
    private double comissao;

    public Vendedor(String matricula, String nome, String sobrenome, double salario, double comissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.comissao = comissao;
    }

    public Vendedor(){

    }
    //-----------------------------------


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    //--------------------------------------
    public double retornaNovoSalario(){
        double novoSalario = salario + comissao;
        return novoSalario;
    }

    public String retornaNome(){
        return sobrenome +" "+nome;
    }

    @Override
    public String toString() {
        return "Sobrenome: "+sobrenome+ ", "+"nome: "+nome+", "+"matrícula: "+matricula+", "+
                " salario: "+salario+" comissao: "+comissao;
    }
}
