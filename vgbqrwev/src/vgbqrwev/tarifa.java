package vgbqrwev;


public class Uc extends Endereco{

	private int ucld;
	
	private Cliente cliente;
	
	private int leituraAnterior;
	
	private int leituraAtual;
	
	private int leituracorente;
	
	private int media;
	
	private Endereco endereco;
	
	private int unidadeConsumo; 

	
	
	public int getUcld() {
		return ucld;
	}

	public void setUcld(int ucld) {
		this.ucld = ucld;
	}

//
	
	public int getLeituracorente() {
		return leituracorente;
	}

	public void setLeituracorente(int leituracorente) {
		this.leituracorente = 0;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	

	public int getUnidadeConsumo() {
		return unidadeConsumo;
	}

	public void setUnidadeConsumo(int unidadeConsumo) {
		this.unidadeConsumo = unidadeConsumo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double faturar(int leitura) {
		int cosumo;
		
		leituraAnterior =  leituraAtual;
		
		leituraAtual = leituracorente;
		
		cosumo = leituraAnterior - leituraAtual;
		
		return cosumo;
	}
	
	public int pegarConsumo(int media) {
		media = leituraAnterior - leituraAtual;
		
		return media;
	}
	public String toString() {
		String texto = "";
		
		texto = "----------------------------"
				+"\n Rua: " + getRua()
				+"\n Rua: " + getNumero()
				+"\n CEP: " + getCep()
				+"\n Cidade: " + getCidade()
				+"\n Estado: " + getEstado();
		
		return texto;
	}
}
	

