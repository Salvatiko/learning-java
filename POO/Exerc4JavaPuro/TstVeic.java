public class TstVeic {
    public static void main(String[] args) {
        Leitura le = new Leitura();

        Passeio p = new Passeio();

        p.setPlaca(le.entDados("Placa"));
        p.setMarca(le.entDados("Marca"));
        p.setModelo(le.entDados("Modelo"));
        p.setCor(le.entDados("Cor"));
        p.setQtdRodas(Integer.parseInt(le.entDados("Qtd Rodas")));
        int velP = Integer.parseInt(le.entDados("Velocidade Maxima"));
        if (velP < 10 || velP > 250) {
            System.out.println("A velocidade está fora dos limites brasileiros");
            velP = 100;
        }
        p.setVelocMax(velP);
        p.setDataCadastro(le.entDados("Data Cadastro"));
        p.setQtdPassageiro(Integer.parseInt(le.entDados("Qtd Passageiros")));
        p.getMotor().setQtdPist(Integer.parseInt(le.entDados("Qtd Pistoes")));
        p.getMotor().setPotencia(Integer.parseInt(le.entDados("Potencia")));

        Carga c = new Carga();

        c.setPlaca(le.entDados("Placa"));
        c.setMarca(le.entDados("Marca"));
        c.setModelo(le.entDados("Modelo"));
        c.setCor(le.entDados("Cor"));
        c.setQtdRodas(Integer.parseInt(le.entDados("Qtd Rodas")));
        int velC = Integer.parseInt(le.entDados("Velocidade Maxima"));
        if (velC < 10 || velC > 250) {
            System.out.println("A velocidade está fora dos limites brasileiros");
            velC = 100;
        }
        c.setVelocMax(velC);
        c.setDataCadastro(le.entDados("Data Cadastro"));
        c.setTara(Integer.parseInt(le.entDados("Tara")));
        c.setCargaMax(Integer.parseInt(le.entDados("Carga Maxima")));
        c.getMotor().setQtdPist(Integer.parseInt(le.entDados("Qtd Pistoes")));
        c.getMotor().setPotencia(Integer.parseInt(le.entDados("Potencia")));

        System.out.println("Passeio m/h: " + p.calcVel());
        System.out.println("Passeio calcular: " + p.calcular());

        System.out.println("Carga cm/h: " + c.calcVel());
        System.out.println("Carga calcular: " + c.calcular());
    }
}