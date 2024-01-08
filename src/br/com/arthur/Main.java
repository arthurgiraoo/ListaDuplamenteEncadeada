package br.com.arthur;

public class Main {
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> listaEncadeada = new ListaDuplaEncadeada<>();

        listaEncadeada.add("1");
        listaEncadeada.add("2");
        listaEncadeada.add("3");
        listaEncadeada.add("4");
        listaEncadeada.add("5");
        listaEncadeada.add("6");
        listaEncadeada.add("7");
        listaEncadeada.add("8");

        System.out.println(listaEncadeada);

        listaEncadeada.remove(3);
        System.out.println(listaEncadeada);
        listaEncadeada.add(3,"99");
        System.out.println(listaEncadeada);
    }
}