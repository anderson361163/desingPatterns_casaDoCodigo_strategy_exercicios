## Teoria

Estrategia - Interface
Estrategia - Contexto
Contexto

![Diagrama base para o Desing Pattern de Strategy](image.png)


-- ---------------------------------------------

## Exercício gerado pelo ChatGPT.
1 - Imagine um sistema de jogo onde um personagem pode escolher diferentes habilidades para combate. Crie um mecanismo que permita ao jogador escolher entre diferentes estratégias de ataque para seu personagem. Defina uma interface Ataque que tenha métodos comuns para executar um ataque. Em seguida, implemente duas estratégias de ataque: "AtaqueEspada" e "AtaqueMagia". A estratégia "AtaqueEspada" realiza um ataque corpo a corpo com uma espada, enquanto AtaqueMagia realiza um ataque à distância usando poderes mágicos.

2 - Crie um sistema para gerenciar diferentes estratégias de envio de mensagens em um sistema de notificações. Crie uma interface EstrategiaEnvio e implemente duas estratégias: EnvioEmail que envia a mensagem por e-mail e EnvioSMS que envia por mensagem de texto. Cada estratégia deve implementar métodos adequados para o envio eficiente das mensagens.

3 - Desenvolva um sistema de processamento de imagens que permita aplicar diferentes filtros de forma dinâmica. Defina uma interface FiltroImagem e implemente as estratégias FiltroPretoBranco que converte a imagem para tons de preto e branco e FiltroSepia que aplica um efeito de sépia na imagem. Cada estratégia deve oferecer métodos para aplicar os filtros de maneira adequada.

4 - Crie um sistema para calcular frete de produtos em uma loja online, permitindo diferentes estratégias de cálculo baseadas na distância de entrega. Defina uma interface CalculoFrete e implemente as estratégias FretePadrao que calcula o frete com base em uma taxa fixa por quilômetro e FreteExpresso que adiciona um valor extra pela rapidez na entrega. Cada estratégia deve ser flexível o suficiente para calcular o valor do frete conforme as diferentes necessidades do cliente.

5 - Você é desenvolvedor de uma empresa de logistica, um dos seus clientes recebe diariamente hambuerguers em suas unidades em todas as cidades, porém quando o consumo é abaixo do normal, determinadas unidades informada pelo cliente, não recebam encomendas para seus estoque. Crie uma lógica que quando notificado pelo cliente, não seja enviado hambuerguer para unidades.

## Como executar

 - Compilar a imagem
```
docker build -t strategy .
```

 - Executar o projeto
```docker build -t strategy .
docker run strategy
```

## Referências
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

-------------------------------------------------

## Input ao chatGPT para elaborar o exercício

me gere um exercicio para treinar o desing pattern de strategy (não me de nenhum código), apenas um exemplo, que não envolva dinheiro. Segue um modelo para ter uma noção de como deve fazer:

"
Crie todo o mecanismo para flexibilizar a criação de diferentes estratégias de impostos, igual visto no vídeo. Crie a interface Imposto, e as estratégias ICMS e ISS. O ISS deve ser 6% do valor do orçamento, e o ICMS deve ser 5% do valor do orçamento mais o valor fixo de R$ 50,00.
"

lembre-se, vc não deve fazer envolvendo dinheiro ou impostos, nem bibliotecas, e nem me informe quais classes ou interfaces que posso criar