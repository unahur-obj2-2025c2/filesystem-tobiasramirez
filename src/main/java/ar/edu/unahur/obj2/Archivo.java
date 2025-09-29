package ar.edu.unahur.obj2;

public class Archivo implements Data {
    private String nombre;
    private String extension;
    private Integer tamaño;


    @Override
    public String nombre() {
       return this.nombre;
    }
    @Override
    public Integer tamaño() {
        return this.tamaño;
    }

    public String getExtension(){
        return this.extension;
    }

    @Override
    public void mostrar(Integer identacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Data elementoMasPesado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elementoMasPesado'");
    }

    public Archivo(String nombre, String extension, Integer tamaño) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
    }
    

}
