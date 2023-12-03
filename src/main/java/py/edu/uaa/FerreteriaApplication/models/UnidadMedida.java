package py.edu.uaa.FerreteriaApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UnidadMedida {
  @Id
  private String id;
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
