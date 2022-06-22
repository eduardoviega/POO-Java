package questao1;

public class main {
    public static void main(String[] args) {
        //------------------------ TESTE 1 ------------------------//
        Gerente g1 = new Gerente("joao", "123", 12000, 3000);
        Autenticador autenticador = new Autenticador();
        if (autenticador.autenticar(g1, false)){
            System.out.println("Usuário autenticado!"); 
        } else {
            System.out.println("Login ou password incorretos!");
        }

        //------------------------ TESTE 2 ------------------------//
//        Gerente g1 = new Gerente("joao", "aaa", 12000, 3000);
//        Autenticador autenticador = new Autenticador();
//        if (autenticador.autenticar(g1, true)){
//            System.out.println("Usuário autenticado!");
//        } else {
//            System.out.println("Login ou password incorretos!");
//        }

        //------------------------ TESTE 3 ------------------------//
//        Vendedor v1 = new Vendedor("maria", "abc", 5000);
//        Autenticador autenticador = new Autenticador();
//        if (autenticador.autenticar(v1, true)){
//            System.out.println("Usuário autenticado!");
//        } else {
//            System.out.println("Login ou password incorretos!");
//        }

        //------------------------ TESTE 4 ------------------------//
//        Vendedor v1 = new Vendedor("maria", "abc", 5000);
//        Autenticador autenticador = new Autenticador();
//        if (autenticador.autenticar(v1, false)){
//            System.out.println("Usuário autenticado!");
//        } else {
//            System.out.println("Login ou password incorretos!");
//        }

        //------------------------ TESTE 5 ------------------------//
//        Vendedor v2 = new Vendedor("raul", "aaa", 5000);
//        Autenticador autenticador = new Autenticador();
//        if (autenticador.autenticar(v2, false)){
//            System.out.println("Usuário autenticado!");
//        } else {
//            System.out.println("Login ou password incorretos!");
//        }
    }
}
