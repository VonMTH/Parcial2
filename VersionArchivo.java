public class VersionArchivo {
    private double numeroVersion;
    private String nombreArchivo;
    private String fecha;
    private String descripcion;
    
    public VersionArchivo() {
    }

    public double getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(double numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
