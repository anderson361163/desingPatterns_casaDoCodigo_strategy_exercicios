Estrategia - Interface Estrategia - Contexto Contexto

Diagrama base para o Desing Pattern de Strategy

Exerc�cio gerado pelo ChatGPT.
1 - Imagine um sistema de jogo onde um personagem pode escolher diferentes habilidades para combate. Crie um mecanismo que permita ao jogador escolher entre diferentes estrat�gias de ataque para seu personagem. Defina uma interface Ataque que tenha m�todos comuns para executar um ataque. Em seguida, implemente duas estrat�gias de ataque: "AtaqueEspada" e "AtaqueMagia". A estrat�gia "AtaqueEspada" realiza um ataque corpo a corpo com uma espada, enquanto AtaqueMagia realiza um ataque � dist�ncia usando poderes m�gicos.

2 - Crie um sistema para gerenciar diferentes estrat�gias de envio de mensagens em um sistema de notifica��es. Crie uma interface EstrategiaEnvio e implemente duas estrat�gias: EnvioEmail que envia a mensagem por e-mail e EnvioSMS que envia por mensagem de texto. Cada estrat�gia deve implementar m�todos adequados para o envio eficiente das mensagens.

3 - Desenvolva um sistema de processamento de imagens que permita aplicar diferentes filtros de forma din�mica. Defina uma interface FiltroImagem e implemente as estrat�gias FiltroPretoBranco que converte a imagem para tons de preto e branco e FiltroSepia que aplica um efeito de s�pia na imagem. Cada estrat�gia deve oferecer m�todos para aplicar os filtros de maneira adequada.

4 - Crie um sistema para calcular frete de produtos em uma loja online, permitindo diferentes estrat�gias de c�lculo baseadas na dist�ncia de entrega. Defina uma interface CalculoFrete e implemente as estrat�gias FretePadrao que calcula o frete com base em uma taxa fixa por quil�metro e FreteExpresso que adiciona um valor extra pela rapidez na entrega. Cada estrat�gia deve ser flex�vel o suficiente para calcular o valor do frete conforme as diferentes necessidades do cliente.

5 - Voc� � desenvolvedor de uma empresa de logistica, um dos seus clientes recebe diariamente hambuerguers em suas unidades em todas as cidades, por�m quando o consumo � abaixo do normal, determinadas unidades informada pelo cliente, n�o recebam encomendas para seus estoque. Crie uma l�gica que quando notificado pelo cliente, n�o seja enviado hambuerguer para unidades.

Como executar
Compilar a imagem
docker build -t strategy .
Executar o projeto
docker run strategy
Refer�ncias
Fonte do Exerc�cio:
Curso: https://cursos.alura.com.br/course/design-patterns
T�tulo: Strategy Pr�tica - Padr�es de Projeto - Parte 28/45
By: Ot�vio Miranda
Refer�ncia: https://www.youtube.com/watch?v=Q2TYbYZBRkI&ab_channel=Ot%C3%A1vioMiranda
T�tulo: Evite IF/ELSE e HERAN�A aplicando o padr�o STRATEGY!
By: RinaldoDev
Refer�ncia: https://www.youtube.com/watch?v=TfAAGUrUBIQ&ab_channel=RinaldoDev
Input ao chatGPT para elaborar o exerc�cio
me gere um exercicio para treinar o desing pattern de strategy (n�o me de nenhum c�digo), apenas um exemplo, que n�o envolva dinheiro. Segue um modelo para ter uma no��o de como deve fazer:

" Crie todo o mecanismo para flexibilizar a cria��o de diferentes estrat�gias de impostos, igual visto no v�deo. Crie a interface Imposto, e as estrat�gias ICMS e ISS. O ISS deve ser 6% do valor do or�amento, e o ICMS deve ser 5% do valor do or�amento mais o valor fixo de R$ 50,00. "

lembre-se, vc n�o deve fazer envolvendo dinheiro ou impostos, nem bibliotecas, e nem me informe quais classes ou interfaces que posso criar