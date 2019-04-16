package contas;

public class ContaPoupanca extends Conta  implements Comparable<ContaPoupanca>{
	
	@Override
	public int compareTo(ContaPoupanca c1) {
		if(this.getNumero() < c1.getNumero()) {
			return -1;
		} else if(this.getNumero() > c1.getNumero()) {
			return 1;
		// TODO Auto-generated method stub
		}
		return 0;
	}
	
}
