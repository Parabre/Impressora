package view;

import javax.swing.JOptionPane;

import controller.ImpressoraController;
import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {
		ImpressoraController controller = new ImpressoraController();
		Fila fila = new Fila();

		boolean exibeMenu = true;
		while (exibeMenu) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções \n "
					+ "1- Inserir documento para impressão \n 2- Imprimir documento da fila" + "\n 3- Sair"));
			
			switch (opcao) {
			case 1:
				String documento = String.valueOf(JOptionPane.showInputDialog(null, "Insira o documento no formato correto"));
				String[] splitDoc = documento.split(";");
				
				if(splitDoc.length != 2) throw new Exception("Favor inserir o documento no formato correto");
				
				controller.insereDocumento(fila, documento);
				break;
			case 2:
				controller.imprime(fila);
				break;
			case 3:
				exibeMenu = false;
				break;
			default:
				System.err.println("Escolha uma opção entre 1 a 3");
				break;
			}
		}

	}
}
