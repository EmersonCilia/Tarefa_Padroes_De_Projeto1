package Fabrica;

public class SUV implements Automovel {
    private int horsepower;
    private String tipoCombustivel;
    private String cor;

    public SUV(int horsepower, String tipoCombustivel, String cor) {
        this.horsepower = horsepower;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return String.format("SUV, %d HP, %s, %s", horsepower, tipoCombustivel, cor);
    }
}