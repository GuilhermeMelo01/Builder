# DESIGN PATTERN BUILDER
***
### PROBLEMA:
Quando criamos um objeto com muitas regras de negocio, métodos, é sempre um risco temos construtores com inumeros parâmetros podem fazer uma serie de parametros null, ou vazio. Na verdade métodos que passam de 3 a 4 parâmetros podem confundir a clareza do codigo e se enquadra no que é chamado de Long Parameter List.

Para ilustrar imagine o objeto o **Carro**. Para construir um carro, você precisa de motor, carroceria, rodas, combustivel. Mas e se você quiser uma caminhonete? ou um caminhão?

## SOLUÇÃO:
No padrão Builder iremos quebrar o processo de criação do objeto em etapas, e em varios metodos, como ferramentas e componentes, preciso de motor, ok a classe Motor estara disponivel, preciso de uma caçamba afinal estamos fazendo uma caminhonete, temos o Componente Caçamba que esta a nossa disposição.

Esse componentes serão chamados builders, que são os itens para construir o objeto complexo.

A sequencia da construção, será guiada por um Diretor, que recebe quais os metodos 
