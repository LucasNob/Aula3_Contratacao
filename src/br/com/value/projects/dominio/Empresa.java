package br.com.value.projects.dominio;

import java.util.List;

public class Empresa {
	List<Funcionario> funcionarios;
	
	public String Contratar(Candidato c) {
		if(c.idade<16 || c.idade>55) {
			return "Candidato n�o tem idade permitida para contratacao";
		}
		else if(c.idade <18) {
			Funcionario f = new Funcionario(c.nome,c.idade,Regime.PARCIAL);
			this.funcionarios.add(f);
			return "Candidato contratado em regime parcial";
		}else { //c.idade >=18
			Funcionario f = new Funcionario(c.nome,c.idade,Regime.INTEGRAL);
			this.funcionarios.add(f);
			return "Candidato contratado em regime integral";
		}
	}
}
