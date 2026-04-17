public final class Passeio extends Veiculo implements Calc {
    private int qtdPassageiro;

    public Passeio() {
        super();
        qtdPassageiro = 0;
    }

    public int getQtdPassageiro() { return qtdPassageiro; }
    public void setQtdPassageiro(int qtdPassageiro) { this.qtdPassageiro = qtdPassageiro; }

    public float calcVel() {
        return getVelocMax() * 1000;
    }

    public int calcular() {
        int soma = 0;
        soma += getPlaca().length();
        soma += getMarca().length();
        soma += getModelo().length();
        soma += getCor().length();
        soma += getDataCadastro().length();
        return soma;
    }
}