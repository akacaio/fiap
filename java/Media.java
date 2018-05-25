package br.com.fiap.beans;

import javax.swing.JOptionPane;

public class Media {
	
	public static void main(String[] args) {
		
	double nac[] = new double[2];
	double mediaNac = 0;
	double ps;
	double am;
	double mediaSemestre = 0;
	double menorNota = 10;
	double maiorNota = 0;
	String status = "";

	for (int i = 0; i < nac.length; i++) {
		nac[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da NAC " + i + ": " ));
		
		if(nac[i] <= menorNota) {
			menorNota = nac[i];
		}
		
		if(nac[i] >= maiorNota) {
			maiorNota = nac[i];
		}
		
		mediaNac = maiorNota * 0.2;
	}
	am = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do AM: ")) * 0.3;
	ps = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PS: ")) * 0.5;
	
	mediaSemestre = mediaNac + am + ps;
	
	if(mediaSemestre >= 6) {
		status = "APROVADO";
	} else if (mediaSemestre < 4) {
		status = "REPROVADO";
	} else {
		status = "EXAME";
	}
	
	System.out.println("Status:" +status);
	System.out.println("Total: " +mediaSemestre);
	System.out.println("Suas médias são: " + "AM - " + am + " PS - " + ps + " NAC - " + mediaNac);
	
	}
  }

