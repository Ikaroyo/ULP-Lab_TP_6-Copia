package Lab_TP_6;

import java.util.List;

public class Directorio {

    private List<numeroCliente> contacto;

    public Directorio(long p_numTelefono, Cliente p_cliente) {
    }

    public String agregarCliente(long p_numTelefono, long p_dni, String p_nombre, String p_apellido, String p_ciudad, String p_direccion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarCliente(String p_apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarTelefono(String p_apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarClientes(String p_ciudad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long borrarCliente(long p_dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
