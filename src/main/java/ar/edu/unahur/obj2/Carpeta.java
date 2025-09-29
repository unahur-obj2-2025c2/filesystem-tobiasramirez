package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Carpeta implements Data {
    private String nombre;
    List<Data> elementos = new ArrayList<>();


    @Override
    public String nombre() {
       return this.nombre;
    }

    @Override
    public Integer tamaño() {
        return elementos.stream().mapToInt(e->e.tamaño()).sum();
    }

    @Override
    public void mostrar(Integer identacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Data elementoMasPesado() {
        Integer elMayorTamaño = elementos.stream().mapToInt(e->e.tamaño()).max().orElse(0);
       return (Data) elementos.stream().filter(e->e.tamaño().equals(elMayorTamaño));
    }

    public Carpeta(String nombre) {
        this.nombre = nombre;
        
    }

    public List<Data> getElementos() {
        return elementos;
    }
    public void agregarArchivo(Data archivo){
        elementos.add(archivo);
    }
    

}
