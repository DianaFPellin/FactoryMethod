package example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplo de uso de Factory Method: ");
        FuncionarioFactory factory = new FuncionarioFactoryConcreto();
        
        System.out.println("Estagiário: ");
        Funcionario e = factory.fazerPagamento("ESTAGIARIO");

        System.out.println("");
        System.out.println("Contratado CLT: ");
        Funcionario c = factory.fazerPagamento("CONTRATADO");

        System.out.println("");
        System.out.println("Freelancer: ");
        Funcionario f = factory.fazerPagamento("FREELANCER");

        System.out.println("");
        System.out.println("HomeOffice: ");
        Funcionario h = factory.fazerPagamento("HOMEOFFICE");
        
        System.out.println("");
        System.out.println("Voluntário: ");
        Funcionario v = factory.fazerPagamento("VOLUNTARIO");
    }
}