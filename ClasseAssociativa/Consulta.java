import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float valor;
    private int id;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(int id, Paciente p, Medico m, LocalDateTime data, float valor) {
        this.id = id;
        this.paciente = p;
        this.medico = m;
        this.data = data;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String toString() {
        DateTimeFormatter fdata = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        int var10000 = this.id;
        return "Consulta: {id =" + var10000 + ", data =" + this.data.format(fdata) + ", medico = " + String.valueOf(this.medico) + ", paciente =" + String.valueOf(this.paciente) + ",valor= " + this.valor;
    }
}
