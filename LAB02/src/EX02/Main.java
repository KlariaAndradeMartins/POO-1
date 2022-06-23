package EX02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------Cadastro de Dados ----------\n");
        System.out.println("Cadastro produto");

        Scanner entrada = new Scanner(System.in);
        CadastraProduto c1;
        CadastrarCliente cc1;
        CadastrarFuncionarios cf1;

        //Codigo, fabricante, marca, preço
        System.out.println("Digite o código do produto: ");
        double codigo = entrada.nextDouble();
        System.out.println("Digite o nome do fabricante: ");
        String fabricante = entrada.next();
        System.out.println("Digite a marca: ");
        String marca = entrada.next();
        System.out.println("Digite o preço: ");
        double preço = entrada.nextDouble();
        c1 = new CadastraProduto();
        c1.CadastraProduto(codigo, fabricante, marca, preço);

        //cpf, nome, data de nascimento, cep
        System.out.println("Cadastro Cliente:\n");
        System.out.println("Digite o cpf: ");
        String cpf = entrada.next();
        System.out.println("\nDigite o nome do Cliente: ");
        String nome = entrada.next();
        System.out.println("\nDigite a data de nascimento: ");
        String dtnascimento = entrada.next();
        System.out.println("\nDigite o cep: ");
        String cep = entrada.next();
        cc1 = new CadastrarCliente();
        cc1.cadastrarCliente(cpf, nome, dtnascimento, cep);

        System.out.println("\nDados do Produto:\n");
        System.out.println("Codigo:" + c1.getCodigo() +
                "\nFabricante: " + c1.getFabricante() +
                "\nMarca: " + c1.getMarca() +
                "\nPreço: " + c1.getPreço());

        System.out.println("Dados Cliente:");
        System.out.println("\nCPF: " + cc1.getCpf() +
                           "\nNome: " + cc1. getNome() +
                             "\nData de Nascimento: " + cc1.getDtnascimento() +
                            "\nCEP: " + cc1.getCep());


    }
}
