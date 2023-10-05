

public class Main {
    public static void main(String[] args) {

        CadastroConta contaCadastro = new CadastroConta(5);

        Conta contaTeste = new Conta(12,2000);
        
        // cadastrar conta
        contaCadastro.cadastrarConta(contaTeste);
        // pesquisar conta
        contaCadastro.pesquisarConta(14);
     
        // excluir conta
        contaCadastro.excluirConta(15);
        
        // quantidade de contas cadastradas
        contaCadastro.getQuantidadeCadastrada();
        

        

    }
}