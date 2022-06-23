package EX02;

public class CadastrarCliente {
    //CPF, nome, data de nascimento, cep

    private String cpf;
    private String nome;
    private String dtnascimento;
    private String cep;

    public void cadastrarCliente (String c, String n, String dt, String ce){
        cpf = c;
        nome = n;
        dtnascimento = dt;
        cep = ce;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setCep(String x) {
        cep = x;
    }

    public String getCep() {
        return cep;
    }
}
