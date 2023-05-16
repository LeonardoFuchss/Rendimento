# Rendimento
Este código Java é um programa que calcula o rendimento de um investimento com base em taxas de juros. Ele solicita ao usuário o valor do investimento e a duração em meses. Em seguida, utiliza fórmulas diferentes dependendo da taxa Selic para calcular o rendimento. O resultado é exibido na tela.

A classe principal é chamada de "Rendimento" e possui as seguintes propriedades:

"valor": armazena o valor do investimento fornecido pelo usuário.
"quantMeses": armazena a quantidade de meses que o investimento será mantido.
"taxaSelic": representa a taxa Selic, um valor de juros definido pelo usuário.
"taxaRef": representa uma taxa de referência adicional, também definida pelo usuário.
O construtor da classe "Rendimento" recebe as taxas Selic e de referência, bem como um objeto Scanner para interação com o usuário. Ele solicita ao usuário que informe o valor do investimento e a quantidade de meses que deseja deixá-lo rendendo.

A classe "Rendimento" também possui um método chamado "calcularRendimento()", que calcula o rendimento com base nas taxas de juros fornecidas. Se a taxa Selic for menor que 8.5%, o rendimento é calculado como o valor do investimento somado a (0.70 vezes a taxaSelic mais taxaRef) multiplicado pela quantidade de meses. Caso contrário, o rendimento é calculado como o valor do investimento somado a (0.05 vezes a taxaSelic mais taxaRef) multiplicado pela quantidade de meses.

A classe "teste" contém o método "main" que cria uma instância da classe "Rendimento" com valores de taxaSelic (7.5) e taxaRef (5.0) pré-definidos. Ele também utiliza um objeto Scanner para interagir com o usuário. Em seguida, chama o método "calcularRendimento()" para calcular e exibir o rendimento do investimento.
Este código/exercício foi feito com intuito de aprimorar meus conhecimentos em Java POO e treinar.
