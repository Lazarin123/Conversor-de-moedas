public class conversor {
    public static void main(String[] args) {    
        System.out.println("Olá, seja bem-vindo(a)!\n");
        System.out.println("Esse é um projeto simples em Java!\n");  
        System.out.println("Aqui testo um pouco do meu conhecimento em java criando um programa de conversão de moedas!\n"); 
        System.out.println("Espero que goste!\n");

        int escolha;
        System.out.println("Escolha (1) para converter Real para Dólar\n");
        System.out.println("Escolha (2) para converter Dólar para Real\n");
        System.out.println("Escolha (3) para converter Real para Euro\n");
        System.out.println("Escolha (4) para converter Euro para Real\n");
        System.out.println("Escolha (5) para converter Euro para Dólar\n");
        System.out.println("Escolha (6) para converter Dólar para Euro\n");
        System.out.println("Qual deseja converter? \n");
        escolha = new java.util.Scanner(System.in).nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu converter Real para Dólar\n");
                System.out.println("Digite o valor em Real que deseja converter: \n");
                double real = new java.util.Scanner(System.in).nextDouble();
                double dolar = real / 5.25;
                System.out.printf("O valor em Dólar é: %.2f\n", dolar);
                break;
            case 2:
                System.out.println("Você escolheu converter Dólar para Real\n");
                System.out.println("Digite o valor em Dólar que deseja converter: \n");
                dolar = new java.util.Scanner(System.in).nextDouble();
                real = dolar * 5.25;
                System.out.printf("O valor em Real é: %.2f\n", real);
                break;
            case 3:
                System.out.println("Você escolheu converter Real para Euro\n");
                System.out.println("Digite o valor em Real que deseja converter: \n");
                real = new java.util.Scanner(System.in).nextDouble();
                double euro = real / 5.90;
                System.out.printf("O valor em Euro é: %.2f\n", euro);
                break;
            case 4:
                System.out.println("Você escolheu converter Euro para Real\n");
                System.out.println("Digite o valor em Euro que deseja converter: \n");
                euro = new java.util.Scanner(System.in).nextDouble();
                real = euro * 5.90;
                System.out.printf("O valor em Real é: %.2f\n", real);
                break;
            case 5:
                System.out.println("Você escolheu converter Euro para Dólar\n");
                System.out.println("Digite o valor em Euro que deseja converter: \n");
                euro = new java.util.Scanner(System.in).nextDouble();
                dolar = euro * 1.12;
                System.out.printf("O valor em Dólar é: %.2f\n", dolar);
                break;
            case 6:
                System.out.println("Você escolheu converter Dólar para Euro\n");
                System.out.println("Digite o valor em Dólar que deseja converter: \n");
                dolar = new java.util.Scanner(System.in).nextDouble();
                euro = dolar / 1.12;
                System.out.printf("O valor em Euro é: %.2f");
            }
    }
}
