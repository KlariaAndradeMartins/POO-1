package EX02;

public class CadastrarFuncionarios {
    // CPF, nome, data de nascimento, data de ingresso

    private String cpf;
    private String nome;
    private String dtnascimento;
    private String dtingresso;

    public void cadastrarFuncionarios(String c, String n, String dtn, String dti){
        cpf = c;
        nome = n;
        dtnascimento = dtn;
        dtingresso = dti;
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

    public String getDtingresso(){
        return dtingresso;
    }
}
