package sistemaenergia;

public class Cliente {
	
	private int Clienteid;
	private String nome;
	private Endereco endere�o;
	
	
	public int getClienteid() {
		return Clienteid;
	}
	public void setClienteid(int clienteid) {
		Clienteid = clienteid;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endere�o getendere�o() {
		return Endere�o;
	}
	public void setEndere�o(Endere�o endere�o) {
		Endere�o = endere�o;
	}
	public String toString() {
		String texto = "";
		
		texto = "----------------------------"
		        +"\n clirntrid: " + getClienteid()
			    +"\n nome: " + getNome()
				+"\n Rua: " + getRua()
				+"\n numero: " + getNumero()
				+"\n CEP: " + getCep()
				+"\n Cidade: " + getCidade()
				+"\n Estado: " + getEstado();
		
		return texto;

}
