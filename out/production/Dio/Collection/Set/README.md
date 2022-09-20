# Set

- N�o permite elementos duplicados

- N�o possui �ndice

## Classe HashSet
Classe que faz parte do pacote ?java.util? e que � uma implementa��o da interface Set onde utiliza uma tabela hash, por isso do nome da classe.

#### Caracter�sticas do HashSet
- N�o tem ordena��o na varredura ou impress�o. A ordem de sa�da n�o � a mesma de entrada;
- Aceitam valores do tipo null;
- N�o � sincronizada (thread-safe);
- Velocidade no acesso, leitura e modifica��o de dados;

#### Declara��o - HashSet

Na classe HashSet para construir objetos � a mesma ideia da interface Set, precisa informar que tipo de cole��o ser� implementada.

Sintaxe: `HashSet<E> set = new Type<E>();`

## Classe TreeSet
Essa classe fornece objetos de cole��o de ordena��o natural e faz parte da implementa��o da interface Set e est� localizada dentro do pacote ?java.util?.

#### Caracter�sticas
- Os elementos inseridos dentro desse tipo de conjunto devem implementar a interface Comparable;
- A ordena��o � por elementos �nicos;
- N�o suporta objetos nulos, se caso um elemento ser nulo � lan�ado a exce��o NullPointerException;

#### Declara��o - TreeSet
Nessa classe para construir objetos � a mesma ideia da interface Set, precisa informar que tipo de cole��o ser� implementada.

Sintaxe: `Set<E> set = new TreeSet<E>();`

## LinkedHashSet

O LinkedHashSet � uma vers�o ordenada do HashSet que mant�m uma lista duplamente vinculada em todos os elementos. 
Quando a ordem de itera��o precisa ser mantida, essa classe � usada. 
Ao iterar por meio de um HashSet, a ordem � imprevis�vel, 
enquanto um LinkedHashSet nos permite iterar atrav�s dos elementos na ordem em que foram inseridos. 
Ao percorrer LinkedHashSet usando um iterador, os elementos ser�o retornados na ordem em que foram inseridos.

#### LinkedHashSet(): 
construtor � usado para criar um HashSet padr�o:
 
`LinkedHashSet <E> hs = novo LinkedHashSet <E>();`
