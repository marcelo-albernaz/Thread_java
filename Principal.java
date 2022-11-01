public class Principal {
    public static void main(String[] args) {
      Thread celta = new Thread(new Carro("celta"));
      Thread ford = new Thread(new Carro("fusion"));
      
      celta.run();
      ford.run();
    }
}
