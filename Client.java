public class Client {

    public static void main(String[] args) {
        // O cliente sempre vai interagir com o Proxy
        Subject subject = new Proxy();
        
        // O Proxy vai controlar o acesso ao RealSubject
        subject.request();
    }
}