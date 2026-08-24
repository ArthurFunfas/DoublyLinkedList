# DoublyLinkedList

 ## Nome do Aluno:
 Arthur Bueno Funfas Leão

 ## Descrição do projeto:
 Atividade de Estrutura de dados que pede a implementação de uma lista duplamente encadeada em Java sem a utilização de recursos já prontos  da linguagem.

 ## Implementação da estrutura:
O usuário deve instanciar um objeto a partir da classe "LinkedList" e pode utilizar métodos para inserir novos Nós, tanto no começo quanto no fim, deletar Nós já existentes, imprimir os valores da lista, verificar se um valor específico está na lista e um método para exibir o tamanho da lista.

## Exemplo de utilização:
#### Entradas:
```
void main() {
    LinkedList linkedlist = new LinkedList();


    linkedlist.addValueBegin(5);
    linkedlist.addValueBegin(8);
    linkedlist.addValueEnd(10);
    linkedlist.addValueEnd(44);

    linkedlist.showValue();

    linkedlist.containsValue(4);
    linkedlist.containsValue(5);

    linkedlist.removeValue(10);

    linkedlist.showValue();

}
```
#### Saídas:

```

Nó atual: 8
Próximo nó: 5
----------------------------------
Nó atual: 5
Nó anterior: 5
Próximo nó: 10
----------------------------------
Nó atual: 10
Nó anterior: 5
Próximo nó: 44
----------------------------------
Nó atual: 44
Nó anterior: 10
----------------------------------
A lista possui: 4 nó(s)

O valor 4 não está na lista.

O valor 5 está na lista.

Nó atual: 8
Próximo nó: 5
----------------------------------
Nó atual: 5
Nó anterior: 5
Próximo nó: 44
----------------------------------
Nó atual: 44
Nó anterior: 5
----------------------------------
A lista possui: 3 nó(s)

Process finished with exit code 0
```
