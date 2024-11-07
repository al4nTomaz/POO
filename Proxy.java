public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject(); // Lazy initialization
        }
        // Podemos adicionar alguma lógica adicional, como cache, segurança, etc.
        System.out.println("Proxy: Checking access...");
        realSubject.request();
    }
}