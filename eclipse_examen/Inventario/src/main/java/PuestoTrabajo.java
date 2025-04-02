
public class PuestoTrabajo {
    private int id;
    private int tipo;
    private String label;
    private String sn;
    private String pn;
    private String modelo;
    private int ram;

    public PuestoTrabajo(int id, int tipo, String label, String sn, String pn, String modelo, int ram) {
        this.id = id;
        this.tipo = tipo;
        this.label = label;
        this.sn = sn;
        this.pn = pn;
        this.modelo = modelo;
        this.ram = ram;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getSn() { return sn; }
    public void setSn(String sn) { this.sn = sn; }
    public String getPn() { return pn; }
    public void setPn(String pn) { this.pn = pn; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }
}
