package contas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		LinkedList<ContaPoupanca> contas = new LinkedList<>();
		TestaOrdenacao t = new TestaOrdenacao();
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1999);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1522);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1122);
		ContaPoupanca c4 = new ContaPoupanca();
		c4.setNumero(9522);
		c1.setNomeDoCliente("chaves");
		c2.setNomeDoCliente("Gustavo");
		c3.setNomeDoCliente("naelia");
		c4.setNomeDoCliente("Nathan");
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		ContaPoupanca[] cp = new ContaPoupanca[5];
		for (int i = 0; i < cp.length; i++) {
			cp[i] = new ContaPoupanca();
			cp[i].setSaldo(aleatorio.nextDouble()*10000);
			System.out.println("Saldo: "+ cp[i].getSaldo());
		}
		
		Collections.sort(contas);
		for(int i = 0;i< contas.size();i++) {
			Conta atual = contas.get(i);
			System.out.println("Numero: " + atual.getNumero());
		}
		for(int i = 0;i< contas.size();i++) {
			Conta atual = contas.get(i);
			System.out.println("Cliente: " + atual.getNomeDoCliente());
		}
		
		System.out.println(contas);
	}

}
