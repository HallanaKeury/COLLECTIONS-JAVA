package exercicio;

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //usando o método toString para imprimir
        System.out.println(notas.toString());

        //Exiba a posição da nota 5
        System.out.println("Exiba a posição da nota 5.0:  " + notas.indexOf(5d));

        //Adicione na lista a nota 8.0 na posição 4
        System.out.println("Adicione na lista a nota 8.0 na posição 4  ");
        notas.add(4, 8d);
        System.out.println(notas);

        //Substitua a nota 5.0 pela nota 6.0
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        //Confira se a nota 5 está na lista, metodo contains confere e devolve booleano
        System.out.println("Confira se a nota 5 está na lista:  " + notas.contains(5d));

        //Exiba todas as notas na ordem em que foram informados
        for (Double nota : notas )  System.out.println("Exiba todas as notas na ordem em que foram informados " + nota);

        //Exiba a terceira nota adicionada
        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));

        //Exiba a menor nota
        System.out.println("Exiba a menor nota " + Collections.min(notas));

        //Exiba a maior nota
        System.out.println("Exiba a maior nota " + Collections.max(notas));

        //Exiba a soma dos valores
        Iterator <Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores "  + soma);

        //Exiba a media das notas
        System.out.println("Exiba a media dos valores "  + (soma/ notas.size()));

        //Remova a nota 0
        notas.remove(0d);
        System.out.println("Remova a nota 0 "  + notas);

        //Remova a nota na posição 0
        notas.remove(0);
        System.out.println("Remova a nota na posição 0 "  + notas);

        //Remova os elementos menores que 7
        System.out.println("Remova os elementos menores que 7 "  );
        Iterator <Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas );

        //Apague toda a lista
        notas.clear();
        System.out.println("Apague toda a lista" );

        //Confira se a lista foi apagada
        System.out.println("Confira se a lista foi apagada: " + notas.isEmpty() );

        //KinkedList
        //Crie uma lista chamada nota2
        System.out.println("Crie uma lista chamada nota2 e adicione as sete notas: ");

        List<Double> notas2 = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //usando o método toString para imprimir
        System.out.println(notas.toString());

















    }
}
