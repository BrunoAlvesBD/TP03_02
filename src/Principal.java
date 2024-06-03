public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setMatricula("696");
        vendedor1.setNome("Joãozinho");
        vendedor1.setSobrenome("da Silva");
        vendedor1.setSalario(5000.00);
        vendedor1.setComissao(900.00);
        System.out.println(vendedor1.retornaNome());
        System.out.println();
        System.out.println(vendedor1);
        System.out.println();
        System.out.println("Novo salário de: "+vendedor1.getNome()+": "+ vendedor1.retornaNovoSalario());
        System.out.println("-------------------------------------------------------");
        //---------------------------------
        Vendedor vendedor2 = new Vendedor("798", "Felisberbo", "dos Santos", 4900.00,1000.00);
        System.out.println(vendedor2.retornaNome());
        System.out.println();
        System.out.println(vendedor2);
        System.out.println();
        System.out.println("Novo salário de: "+vendedor2.getNome()+": "+ vendedor2.retornaNovoSalario());
    }
}
