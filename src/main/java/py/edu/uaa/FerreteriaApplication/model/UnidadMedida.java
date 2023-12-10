package py.edu.uaa.FerreteriaApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class UnidadMedida {
    @Id
    @NotNull
    private String id;

    @NotNull
    private String descripcion;

    public UnidadMedida() {
    }

    public UnidadMedida(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
