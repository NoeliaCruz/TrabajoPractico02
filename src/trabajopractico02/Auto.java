package trabajopractico02;

public class Auto {

    private String marca;
    private String modelo;
    private int kilometraje;

    //setear
    public Auto() {
        this.marca = "";
        this.modelo = "";
        this.kilometraje = 0;

    }

    public Auto(String marca, String modelo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        validarKM(km);
    }

    private void validarKM(int km) {
        if (km >= 0) {
            this.kilometraje = km;
        }
    }
    public void setModello(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setKilometraje(int km){
        validarKM(km);
    }
    public int getKilometraje(){
        return kilometraje;
    }
    public String estadoAuto() {
        String estado;
        if (this.kilometraje > 0 && this.kilometraje < 10000) {
            estado = "Poco Usado";
        } else if (this.kilometraje>10000 && this.kilometraje<100000){
            estado= "Usado";
        }else if (this.kilometraje>=100000){
            estado = "Bastante Usado";
        }
        else {
            estado="Esta Nuevo";
        }
        return estado;
    }

}
