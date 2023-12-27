package py.edu.uaa.FerreteriaApplication.app.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import py.edu.uaa.FerreteriaApplication.model.TipoIva;


@Converter(autoApply = true)
public class TipoIvaConverter implements AttributeConverter<TipoIva, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TipoIva tipoIva) {
        if (tipoIva == null) {
            return null;
        }
        return tipoIva.getPorcentaje();
    }

    @Override
    public TipoIva convertToEntityAttribute(Integer porcentaje) {
        if (porcentaje == null) {
            return null;
        }

        // Recorrer los valores del enum para encontrar la correspondencia
        for (TipoIva tipoIva : TipoIva.values()) {
            if (tipoIva.getPorcentaje() == porcentaje) {
                return tipoIva;
            }
        }

        throw new IllegalArgumentException("Porcentaje no válido: " + porcentaje);
    }
}
