import java.util.ArrayList;
import java.util.List;

public class CadastroConta {
    List<Conta> listaContas;
    private int capacidadeConta;
    
    CadastroConta(){
    	this.capacidadeConta = 10;
    	
		if (listaContas.size() > capacidadeConta) {
			System.out.println("Capacidade atual excedente. ");
		}
		
		this.listaContas = new ArrayList<>(capacidadeConta);
    }

    CadastroConta(int capacidadePermitida){
       if (capacidadePermitida < 5){
           System.out.println("Capacidade minima deve ser ate 5 contas");
       }
       capacidadeConta = capacidadePermitida;
       listaContas = new ArrayList<>(capacidadePermitida);
    }

	public void cadastrarConta(Conta conta) {
		if (listaContas.size() < capacidadeConta) {
			System.out.println("----------CONTA CADASTRADA---------");
			System.out.println("NÚMERO DA CONTA: " + conta.getNumero());
			System.out.println("SALDO DA CONTA: " + conta.getSaldo());
			listaContas.add(conta);
		}
    }

    public Conta pesquisarConta(int numeroConta){

        for (Conta conta: listaContas){
            if (conta.getNumero() == numeroConta){
                System.out.println("Conta encontrada:");
                System.out.println("Numero da conta: " + conta.getNumero());
                System.out.println("Saldo da conta: " + conta.getSaldo());
            }
            else
                System.out.println("Conta não encontrada");
        }
        return null;
    }

	public void excluirConta(int numeroConta) {
		Conta objConta = null;
		for (Conta conta : listaContas) {

			if (conta.getNumero() == numeroConta) {
				objConta = conta;
				break;
			}

			if (objConta != null) {
				System.out.println("Removendo Conta;.... ");
				listaContas.remove(objConta);
			}

			else {
				System.out.println("Não foi possivel excluir a conta.");
			}

		}
	}
	
    public void getQuantidadeCadastrada(){
        System.out.println("quantidade de contas cadastrada:" +listaContas.size());
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public int getCapacidadeConta() {
        return capacidadeConta;
    }

    public void setCapacidadeConta(int capacidadeConta) {
        this.capacidadeConta = capacidadeConta;
    }
}
