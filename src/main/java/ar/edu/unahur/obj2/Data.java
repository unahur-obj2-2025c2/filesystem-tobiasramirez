package ar.edu.unahur.obj2;

import java.util.stream.Stream;

public interface Data {
    String nombre();
    Integer tamaño();
    public void mostrar(Integer identacion);
    public Data elementoMasPesado();

}
