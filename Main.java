package Tarea10;

public class Main {
    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(3);

        productoControlador.agregarProducto("001", "Aceite",15);
        productoControlador.agregarProducto("002", "Jabon",2.5);
        productoControlador.agregarProducto("003", "Yogurt",5.5);

       // productoControlador.listarProdFor();
        System.out.println("------------- Lista de Productos Registrados-------------");
        for(Producto p : productoControlador.listarProdForeach())
        {
            System.out.println("Codigo: "+ p.getCodigo());
            System.out.println("Nombre: "+ p.getNombre());
            System.out.println("Precio: "+ p.getPrecio());
        }

        System.out.println("------------- Buscar Producto -------------");

        System.out.println("Codigo Producto Buscado: 001 ");

        String producto = "001";

        Producto encontrado;

        encontrado = productoControlador.buscarProducto(producto);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: ---------------------");
            System.out.println("Codigo: "+ encontrado.getCodigo());
            System.out.println("Nombre: "+ encontrado.getNombre());
            System.out.println("Precio: "+ encontrado.getPrecio());

        } else {

            System.out.println("No se encontro Producto con Codigo: "+producto);
        }

        System.out.println("------------- Editar Producto -------------");
        System.out.println("Codigo Producto a Editar: 002 ");
        String productoE = "002";
        productoControlador.editarProducto(productoE);
        System.out.println("Codigo: "+ productoControlador.getCodigoProd());
        System.out.println("Nombre: "+ productoControlador.getNombreProd());
        System.out.println("Precio: "+ productoControlador.getPrecioProd());

        Producto modificado;
        modificado = productoControlador.editarProducto(productoE);

        System.out.println("Producto Editado: ---------------------");
        System.out.println("Codigo: "+ modificado.getCodigo());
        System.out.println("Nombre: "+ modificado.getNombre());
        System.out.println("Precio: "+ modificado.getPrecio());

        System.out.println("------------- Eliminar Producto -------------");
        System.out.println("Codigo Producto a Eliminar: 002 ");

        String productoD = "002";

        productoControlador.eliminarProducto(productoD);

        System.out.println("Producto Eliminado: ---------------------");
        System.out.println("Codigo: "+ productoControlador.getCodigoProd());
        System.out.println("Nombre: "+ productoControlador.getNombreProd());
        System.out.println("Precio: "+ productoControlador.getPrecioProd());

        System.out.println("------------- Lista de Productos Actualizados -------------");
        productoControlador.listarProdFor();

    }
}
