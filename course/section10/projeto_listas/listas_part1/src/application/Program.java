package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Marcos");
        list.add("Laura");
        list.add("Ricardo");
        list.add("Murilo");
        list.add("Macedo");

        for(String cadaum : list){
            System.out.println(cadaum);
        }
        // Para adicionar um novo elemento na lista (list.add(posição, valor))
        list.add(2, "Wanderson");
        System.out.println("---------------------------");
        for(String cadaum : list){
            System.out.println(cadaum);
        }
        // Para ver o tamanho da lista  (list.size())
        System.out.println(list.size());
        System.out.println("---------------------------");
        for(String cadaum : list){
            System.out.println(cadaum);
        }
        // Para remover um valor em comparação com um item da lista (list.remove(valor ou posição))
        list.remove("Laura");
        System.out.println("---------------------------");
        for(String cadaum : list){
            System.out.println(cadaum);
        }
        // Remover por predicado/condição (list.removeIf(x -> x.condiçao))
        list.removeIf(cadaum -> cadaum.charAt(0) == 'J');
        System.out.println("---------------------------");
        for(String cadaum : list){
            System.out.println(cadaum);
        }
        // Encontrar a posição de um elemento (list.indexOf(valor))
        System.out.println("---------------------------");
        System.out.println("Index of 'Wanderson': " + list.indexOf("Wanderson"));

        // Mostrar na lista somente itens com determinada condição (list.stream().filter(condição))
        // Primeiro converto para [stream]
        // Depois faço a operação Lambda que preciso [.filter(condição)]
        // Depois retorno o tipo para [Lista]
        System.out.println("---------------------------");
        List<String> result = list.stream().filter(cadaum -> cadaum.charAt(0) == 'M').collect(Collectors.toList());
        for(String cadaum : result){
            System.out.println(cadaum);
        }
        // Encontrar o primeiro elemento da lista que contém um predicado/condição (.findFirst().orElse(null);)
        System.out.println("---------------------------");
        String name = list.stream().filter(cadaum -> cadaum.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);

    }
}
