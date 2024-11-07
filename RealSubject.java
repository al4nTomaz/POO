public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("Cliente Real: processando requisição...");
    }
}