# Set
<img src="https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/collections/set.png"/>
- Não permite elementos duplicados

- Não possui índice

## Classe HashSet
Classe que faz parte do pacote ?java.util? e que é uma implementação da interface Set onde utiliza uma tabela hash, por isso do nome da classe.

#### Características do HashSet
- Não tem ordenação na varredura ou impressão. A ordem de saída não é a mesma de entrada;
- Aceitam valores do tipo null;
- Não é sincronizada (thread-safe);
- Velocidade no acesso, leitura e modificação de dados;

#### Declaração - HashSet

Na classe HashSet para construir objetos é a mesma ideia da interface Set, precisa informar que tipo de coleção será implementada.

Sintaxe: `HashSet<E> set = new Type<E>();`

## Classe TreeSet
Essa classe fornece objetos de coleção de ordenação natural e faz parte da implementação da interface Set e está localizada dentro do pacote ?java.util?.

#### Características
- Os elementos inseridos dentro desse tipo de conjunto devem implementar a interface Comparable;
- A ordenação é por elementos únicos;
- Não suporta objetos nulos, se caso um elemento ser nulo é lançado a exceção NullPointerException;

#### Declaração - TreeSet
Nessa classe para construir objetos é a mesma ideia da interface Set, precisa informar que tipo de coleção será implementada.

Sintaxe: `Set<E> set = new TreeSet<E>();`

## LinkedHashSet

O LinkedHashSet é uma versão ordenada do HashSet que mantém uma lista duplamente vinculada em todos os elementos. 
Quando a ordem de iteração precisa ser mantida, essa classe é usada. 
Ao iterar por meio de um HashSet, a ordem é imprevisível, 
enquanto um LinkedHashSet nos permite iterar através dos elementos na ordem em que foram inseridos. 
Ao percorrer LinkedHashSet usando um iterador, os elementos serão retornados na ordem em que foram inseridos.

#### LinkedHashSet(): 
construtor é usado para criar um HashSet padrão:
 
`LinkedHashSet <E> hs = novo LinkedHashSet <E>();`
