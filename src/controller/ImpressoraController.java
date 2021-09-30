package controller;

import model.Fila;

public class ImpressoraController {
	

	public void insereDocumento(Fila f,String documento) {
		f.insert(documento);
	}

	public void imprime(Fila f) throws Exception {
		if(f.isEmpty()) throw new Exception("Não existem documentos para impressão");
		
		String documentoValor = f.remove();
		String[] splitDoc = documentoValor.split(";");
		System.out.println("Imprimindo : [#PC:"+splitDoc[0]+"–Arquivo:" + splitDoc[1]+ "]");
		Thread.sleep ((int)((Math.random() * 2000) + 1000));
		System.out.println("Impressão concluida!");
	}
}
