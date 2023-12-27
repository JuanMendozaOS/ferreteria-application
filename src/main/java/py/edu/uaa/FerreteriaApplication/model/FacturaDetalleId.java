package py.edu.uaa.FerreteriaApplication.model;

import java.util.Objects;

public class FacturaDetalleId {
    private Long facturaId;
    private Integer item;

    public FacturaDetalleId() {
    }

    public FacturaDetalleId(Long facturaId, Integer item) {
        this.facturaId = facturaId;
        this.item = item;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaDetalleId that = (FacturaDetalleId) o;
        return Objects.equals(facturaId, that.facturaId) && Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facturaId, item);
    }
}
