package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private List<Data> archivos = new ArrayList<>();

    public void agregarArchivoOCarpeta(Data archivo){
        archivos.add(archivo);
    }
    public Integer tamaño(){
        return archivos.stream().mapToInt(a->a.tamaño()).sum();
    }
    public FileSystem() {
    }
    public FileSystem(List<Data> archivos) {
        this.archivos = archivos;
    }
    
}
