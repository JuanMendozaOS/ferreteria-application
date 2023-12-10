package py.edu.uaa.FerreteriaApplication.model;

public enum TipoIva {
    EXENTA(0),
    IVA_5(5),
    IVA_10(10);

    private final int porcentaje;

    TipoIva(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
}
