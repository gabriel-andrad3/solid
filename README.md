# solid
SOLID studies using Java with for the Sensedia Mentoring Program.

	• SOLID são cinco princípios da programação orientada a objetos que facilitam no desenvolvimento de softwares, tornando-os fáceis de manter e estender. Esses princípios podem ser aplicados a qualquer linguagem de POO.
	• Esses princípios ajudam o programador a escrever códigos mais limpos, separando responsabilidades, diminuindo acoplamentos, facilitando na refatoração e estimulando o reaproveitamento do código.
	• Obs.: diferença de SOLID para Design Pattern: SOLID são princípios (conceitos) e Design Patterns são padrões de projeto ("prático")
	
	S
		Single Responsability Principle (SRP)
			§ Uma classe deve ter uma, e somente uma, responsabilidade (tarefa ou ação)
				□ se utiliza uma classe com muitas responsabilidades, quando há necessidade de realizar alterações nessa classe, será difícil modificar uma dessas responsabilidades sem comprometer as outras. Toda alteração acaba sendo introduzida com um certo nível de incerteza em nosso sistema
			§ Exemplo prático:
				□ Quebrar uma classe com 3 responsabilidades para 3 classes com 1 responsabilidade cada
			§ RocketSeat acha importante
		
	O
		Open Closed Principle (OCP)
			§ Objetos ou entidades abertos para extensão, mas fechados para modificação
				□ Alterando uma classe já existente para adicionar um novo comportamento (apesar de mais fácil), corremos um sério risco de introduzir bugs em algo que já estava funcionando.
				□ também chamado de Strategy
			§ Exemplo prático:
				□ errado:
					® Vc tem classe ContratoClt e Estagio. E na classe FolhaDePagamento é efetuado um cálculo diferente para cada tipo de classe (um if para cada).
					® Suponha que será incluído a classe ContratoPj. Vc terá que adicionar um if no FolhaDePagamento para tratar esse novo caso. Quebrando assim esse princípio.
				□ solução:
					® Separe o comportamento extensível por trás de uma interface e inverta as dependências. No caso:
					® Criar interface Remuneravel com metodo de remuneracao(). Classes ContratoClt e Estagio implementarão essa interface, cada um com seu cálculo para remuneracao().
					® Então, na FolhaDePagamento, simplesmente invocará o metodo de cada classe implementadora de Remuneravel.
				□ RocketSeat não acha importante
					
	L
		Liskov Substitution Principle (LSP)
			§ Uma classe derivada deve ser substituível por sua classe base.
				□ Exemplos de violação do LSP:
					® Sobrescrever/implementar um método que não faz nada;
					® Lançar uma exceção inesperada;
					® Retornar valores de tipos diferentes da classe base;
			§ Exemplo prático:
				□ Classe B herda da classe A. Ambas tem o método getNome() implementadas de uma forma.
				□ Existe o método impremeNome() que recebe como parametro um objeto da classe A e chama o método getNome().
				□ Para seguir o príncipio, é necessário ao ser passado um objeto da classe B para o impremeNome(), funcionar corretamente.
			§ RocketSeat acha importante
	
	I
		Interface Segregation Principle (ISP)
			§ Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
				□ Esse princípio basicamente diz que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.
			§ Exemplo prático:
				□ errado:
					® interface Aves com método voar(). Pois Pinguim herda de Aves mas não voa, causando um método "oco" (quebra o princípio).
				□ solução:
					® criar interface AvesQueVoam que herda de Aves. Método voar() ficará dentro dessa interface. E o Pinguim herdará de Aves sem problemas.
				□ RocketSeat não acha importante
		
	D
		Dependency Invertion Principle (DIP)
			§ Dependa de abstrações e não de implementações.
				1. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
				2. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
			§ Exemplo prático:
				□ errado:
					® Numa classe PasswordReminder, no construtor é instanciado um objeto da classe MySQLConnection.
					® Muito acoplado
				□ solução:
					® Criar interface DBConnectionInterface, da qual MySQLConnection e OracleConnection eirão implementar. Então o construtor irá esperar um objeto do tipo da interface.
RocketSeat não acha importante
