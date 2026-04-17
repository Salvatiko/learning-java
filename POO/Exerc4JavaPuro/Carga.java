public final class Carga extends Veiculo implements Calc {
    private int tara, cargaMax;

    public Carga() {
        super();
        tara = 0;
        cargaMax = 0;
    }

    public int getTara() { return tara; }
    public void setTara(int tara) { this.tara = tara; }

    public int getCargaMax() { return cargaMax; }
    public void setCargaMax(int cargaMax) { this.cargaMax = cargaMax; }

    public float calcVel() {
        return getVelocMax() * 100000;
    }

    public int calcular() {
        return getTara() + getCargaMax() + getVelocMax() + getQtdRodas();
    }
}