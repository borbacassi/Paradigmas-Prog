public class TermatoSmart implements DispLigavel,SensorTemp {
    private double temp;
    private int id;
    private boolean status;

    public TermatoSmart(){}

    public TermatoSmart(int id, double temp){
        this.id = id;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double lerTemp() {
            return temp;
    }

    @Override
    public void ligar() {
        this.status = true;
    }

    @Override
    public void desligar() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "TermatoSmart{" +
                "temp=" + temp +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
