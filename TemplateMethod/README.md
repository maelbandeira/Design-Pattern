## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno

* Abmael Santana Bandeira maelbandeira@gmail.com


### Padrão Comportamental: 

> É um padrão comportamental que define o esqueleto de um algoritmo na superclasse, mas permite que as subclasses substituam etapas específicas do algoritmo sem alterar sua estrutura.

## Padrão Template Method


### Problema: 

> Considere um Player de musica e vídeo que tem processo básico que é a reprodução, o método permanecerá o mesmo vindo da classe pai, mas haverá alteração de acordo com o tipo de arquivo que for reproduzir como (audio e video).

### Solução: 

> No padrão Template Method a solução é que você crie um template, ou seja, um método de execução padrão na classe abstrata, nas classes filhas que extender a classe abstrata (pai) ja recebe o método como padrão, ou seja, elas executam uma determinada operação ja pré-definida, assim precisando fazer a alteração nos métods das classes filas.

### Consequências: 

* Permite que as subclasse redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo.
* Importante para frameworks, pois separa o comportamento variável do invariável.
* O padrão também ajuda a implementar o princípio de Hollywood ("Não ligue para nós, nós ligamos para você").


### Exemplo:
> Segue com o Exemplo Java Implementado
