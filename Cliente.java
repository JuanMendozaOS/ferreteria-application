package py.edu.uaa.FerreteriaApplication.models;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String razonSocial;
    private String numeroDocumento;
    @ManyToOne
    private TipoDocumento tipoDocumento;
    @ManyToOne
    private TipoCliente tipoCliente;
    private String direccion;
    private String telefono;
    private String numeroCelular;

    

}
