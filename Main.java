// Classe principal com a função main
public class Main {
    public static void main(String[] args) {
        Query queryProxy = new QueryProxy();

        // Primeira consulta
        System.out.println(queryProxy.execute("SELECT * FROM users WHERE id = 1"));

        // Segunda consulta, mesma que a primeira (deve usar o cache)
        System.out.println(queryProxy.execute("SELECT * FROM users WHERE id = 1"));

        // Nova consulta, diferente da anterior (não está no cache)
        System.out.println(queryProxy.execute("SELECT * FROM products WHERE id = 10"));

        // Repetição da segunda consulta (deve usar o cache)
        System.out.println(queryProxy.execute("SELECT * FROM products WHERE id = 10"));
    }
}