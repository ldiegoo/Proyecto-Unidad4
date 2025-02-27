package producto.productos;

import producto.Producto;
import producto.tipoProducto.TipoProducto;

public class Snacks extends Producto{

    public Snacks (String Id,String nombre, double precio) {
        super(Id,nombre, precio, TipoProducto.SNACKS);
    }

    public void mostrarDatos(){
        String.format(
            "nombre: %s, precio: %.2f",
            nombre,
            precio
        );
    }
}
