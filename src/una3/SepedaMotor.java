package una3;

public class SepedaMotor extends Sepeda{
    private String jenisMotor;
    
    void throttle(){
        System.out.println("NGEEENGG...");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    
    
}
