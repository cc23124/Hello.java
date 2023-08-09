public class Hello{

    // String mensagem2 = "Hello, World 2!"; // existe no contexto da classe, não entra em métodos static
    // static String mensagem3 = "Hello, World 3!"; // existe no contexto da classe, entra em métodos static

    // public static void main(String[] args) {
    //     String mensagem1 = "Hello, World"; // variável mensagem 1 só existe no contexto do método
    //     System.out.println(mensagem1);
    // }

    // public static void main2(String[] args) {
    //     String mensagem1 = "Outra coisa"; 
    //     System.out.println(mensagem3); 
    // }

    // static String vazio;

    // public static void main3(String[] args) {
    //     System.out.println(vazio);
    // }

    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        System.out.println("A hora atual é: " + hour + ":" + minute);
        System.out.println("Minutos que se passaram após a meia noite: " + (hour * 60 + minute));
        System.out.println("Porcentagem da hora passada: " + (minute * 5 / 3) + "%");
    }

}
