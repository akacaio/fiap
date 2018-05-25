package br.com.fiap.beans;
import javax.swing.JOptionPane;

public class QuantoFalta {
	
	public static void main(String[] args) {
		
		double nac[] = new double[2];
		double mediaNac = 0;
		double am;
		double mediaAprovado = 6;
		double menorNota = 10;
		double maiorNota = 0;
		double quantoFalta = 0;

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
		quantoFalta = mediaAprovado - (am + mediaNac);
		System.out.printf("Você precisa de %.2f de média para passar de ano.", quantoFalta);
		
		}

}
