package Lab_TP_6;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

public class Directorio {

    private final HashMap<Long, Cliente> Directorio;

    public Directorio() {
        Directorio = new HashMap<>();
    }



    public void agregarCliente(long p_numTelefono, Cliente p_cliente) {
        this.Directorio.put(p_numTelefono, p_cliente);
    }

    public Cliente buscarCliente(long p_telefono) {
        return Directorio.get(p_telefono);
    }

    public Set<Long> buscarTelefono(String p_apellido) {
        /* create a Set of Longs */
        Set<Long> telefonos = new HashSet<>();
        /* iterate through the HashMap */
        for (Long telefono : Directorio.keySet()) {
            /* if the value is equal to the argument, add it to the Set */
            if (Directorio.get(telefono).getApellido().equals(p_apellido)) {
                telefonos.add(telefono);
            }
        }
        /* return the Set */
        return telefonos;
    }


    public Set<Cliente> buscarClientes(String p_ciudad) {
        /* create a Set of longs and using iterators for each Client with getCiudad p_ciudad in Directorio */

        Set<Cliente> clientes = new HashSet<>();

        for (Cliente cliente : Directorio.values()) {
            if (cliente.getCiudad().equals(p_ciudad)) {
                clientes.add(cliente);
            }
        }
        return clientes;
    }




    public void borrarCliente(long p_numTelefono) {

        Directorio.remove(p_numTelefono);

    }
}
