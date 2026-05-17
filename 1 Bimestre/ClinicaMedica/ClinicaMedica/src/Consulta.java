import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float valor;
    private int id;
    private Medico medico;
    private Paciente paciente;

    public Consulta(){}

    public Consulta(int id, Paciente p, Medico m, LocalDateTime data, float valor){
        this.id = id;
        this.paciente = p;
        this.medico = m;
        this.data = data;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter fdata = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Consulta: {" + "id =" + this.id+ ", data ="+ data.format(fdata)
                + ", medico = "+this.medico +", paciente =" +this.paciente
                +",valor= " +this.valor;
    }
}
