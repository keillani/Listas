package Listas;

import java.util.ArrayList;
import java.util.HashSet;

public class Lista {
    public static void main(String[] args) {
//      criar lista de strings
        ArrayList<String> nomes = new ArrayList<>();

//      popular lista
    nomes.add ("Xico");
    nomes.add ("Kei");
    nomes.add ("Fe");

        System.out.println("------------");
        System.out.println("Lista String");
        System.out.println(nomes);

//        instanciar objetos
        ListaObjetos xico = new ListaObjetos();
        xico.setNome("xico");
        xico.setIdade(33);

        ListaObjetos kei = new ListaObjetos();
        kei.setNome("kei");
        kei.setIdade(31);

        ListaObjetos fe = new ListaObjetos();
        fe.setNome("fe");
        fe.setIdade(33);

//        criar lista de objetos
        ArrayList<ListaObjetos> nomesObjetos = new ArrayList<>();

//        popular lista de objetos
        nomesObjetos.add (xico);
        nomesObjetos.add (kei);
        nomesObjetos.add (fe);

        System.out.println("------------");
        System.out.println("Lista Objetos");
        System.out.println(nomesObjetos);


        System.out.println("------------");
        System.out.println("For com Java8");
//        retornar objetos que tenham idade maior que 31
        nomesObjetos.stream()
                .filter(c -> c.getIdade()>31)
                .forEach(c -> System.out.println(c));


        System.out.println("------------");
        System.out.println("For com Java7");


        System.out.println("------------");
        System.out.println("Função HashSet");

//        Função HashSet retira a duplicidade
        HashSet<Integer> nomeHashSet = new HashSet<>();

        nomeHashSet.add (33);
        nomeHashSet.add (31);
        nomeHashSet.add (33);

        System.out.println(nomeHashSet);



    }

}
