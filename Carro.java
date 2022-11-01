public class Carro implements Runnable {
    private int VolumeCombustivel = 50;
    private int TankCombustivel = 50;
    private String modelo;

    public Carro(String modelo){
        this.modelo= modelo;

    }
    private void andar(){
        System.out.println(this.modelo+ " comecou andar");
        System.out.println("marcador de combustivel " + this.modelo );
        
        for(int x =TankCombustivel; x > 0; --x){
            System.out.println(x);
        }
        System.out.println("acabou a gasolina");
    }
    @Override
    public void run() {
        andar();
        
    }
}
