public class Veiculo extends motor {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int rodas;
	private int velMax;
	private Motor motor;
	private String dataCadastro
	
	public class Veiculo (){
		placa = ""; marca = "";
		modelo = ""; cor = "";
		rodas = 0; velMax = 0;
		motor = new Motor();
		dataCadastro = "";
	}
	
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getDataCadastro(){
		return dataCadastro;
	}
	
	public int getRodas(){
		return rodas;
	}
	public int getVelMax(){
		return velMax;
	}
	public Motor motor(){
		return motor;
	}
}