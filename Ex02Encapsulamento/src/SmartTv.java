public class SmartTv {
    private int volume;
    private String marca, modelo;

    public SmartTv() { // SmartTv obj1 = new SmartTv()
    }

    public SmartTv(String marca, String modelo, int volume) {
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setVolume(volume);
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        if (modelo.length() <= 30) {
            this.modelo = modelo;
        } else {
            System.out.println("Tamanho inválido");
        }
    }

    public String getModelo() {
        return this.modelo;
    }
}