package contas;

public  class Conta {
	private double saldo;
	protected  int  numero;
	private String nomeDoCliente;
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean saca (double valor) {
		if(valor >= this.saldo) {
			return false;
	
		}else {
			this.saldo -= valor;
			return true;
		}

	}
}



