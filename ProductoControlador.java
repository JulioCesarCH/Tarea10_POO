package Tarea10;

import Clase19.Cliente;

public class ProductoControlador {
    private Producto producto[];
    private String codigoProd;
    private String nombreProd;
    private double precioProd;
    private int contador;
    public ProductoControlador(int size)
    {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void agregarProducto(String codigo, String nombre, double precio)
    {
        this.producto[this.contador] = new Producto(codigo, nombre,precio);

        this.contador++;
    }

    public Producto buscarProducto(String codigo)
    {
        int i;
        i=0;
        while (i<this.contador)
        {
            if(this.producto[i].getCodigo()==codigo)
            {
                break;
            }
            i++;
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.producto[i];
        }
    }

    public Producto[] listarProdForeach()
    {
        return this.producto;
    }

    public void listarProdFor()
    {
        for(int i=0; i<this.contador; i++)
        {
            this.producto[i].listarProducto();
        }
    }

    public Producto editarProducto(String codigo)
    {
        int j;
        j=0;
        while (j<this.contador)
        {
            if(this.producto[j].getCodigo()==codigo)
            {
                this.setCodigoProd(this.producto[j].getCodigo());
                this.setNombreProd(this.producto[j].getNombre());
                this.setPrecioProd(this.producto[j].getPrecio());
               this.producto[j].setNombre("Detergente");
               this.producto[j].setPrecio(2.20);
                break;
            }
            j++;
        }
         return this.producto[j];
    }

    public Producto eliminarProducto(String codigo)
    {
        int k,bn,ps;
        k=0;
        bn=0;
        ps=0;
        while (k<this.contador)
        {
            if(this.producto[k].getCodigo()==codigo)
            {
                ps=k;
                bn=1;
                this.setCodigoProd(this.producto[k].getCodigo());
                this.setNombreProd(this.producto[k].getNombre());
                this.setPrecioProd(this.producto[k].getPrecio());
                break;
            }
            k++;
        }
        if (bn==1){
            if (ps==this.contador)
            {
                this.contador=this.contador-1;
            }
            else
            {
                for(int i=ps;i<(this.contador-1);i++)
                {
                    this.producto[i] = this.producto[i+1];
                }
                this.contador=this.contador-1;
            }
           return this.producto[ps];
        }
        else
        {
            return null;
        }
    }

    public String getCodigoProd() {
        return codigoProd;
        }

    public String getNombreProd() {
        return nombreProd;
        }

    public double getPrecioProd() {
        return precioProd;
        }
    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

}
