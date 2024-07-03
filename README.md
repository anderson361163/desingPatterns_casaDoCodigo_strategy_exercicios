## Teoria

Estrategia - Interface
Estrategia - Contexto
Contexto

![Diagrama base para o Desing Pattern de Strategy](image.png)


## Exercício

Crie todo o mecanismo para flexibilizar a criação de diferentes estratégias de impostos, igual visto no vídeo. Crie a interface Imposto, e as estratégias ICMS e ISS. O ISS deve ser 6% do valor do orçamento, e o ICMS deve ser 5% do valor do orçamento mais o valor fixo de R$ 50,00.

Crie a classe Orcamento, que tem como atributo um valor. Crie um construtor que recebe esse valor, e um getter para devolvê-lo.

Crie a classe CalculadorDeImpostos, que possui um método que recebe um Orcamento e um Imposto. Essa método calcula o imposto usando a estratégia recebida e imprime o resultado na tela.


----------------------------------------------

* Fonte do Exercício: 
* Curso: https://cursos.alura.com.br/course/design-patterns

----------------------------------------------

* Título: Strategy Prática - Padrões de Projeto - Parte 28/45 
* By: Otávio Miranda 
* Referência: https://www.youtube.com/watch?v=Q2TYbYZBRkI&ab_channel=Ot%C3%A1vioMiranda

----------------------------------------------

* Título: Evite IF/ELSE e HERANÇA aplicando o padrão STRATEGY!
* By: RinaldoDev
* Referência: https://www.youtube.com/watch?v=TfAAGUrUBIQ&ab_channel=RinaldoDev