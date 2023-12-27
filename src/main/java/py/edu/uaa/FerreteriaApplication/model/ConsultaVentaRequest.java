package py.edu.uaa.FerreteriaApplication.model;

import java.time.LocalDate;

public class ConsultaVentaRequest {
    private Long clienteId;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ConsultaVentaRequest() {
    }

    public ConsultaVentaRequest(Long clienteId, LocalDate fechaInicio, LocalDate fechaFin) {
        this.clienteId = clienteId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
