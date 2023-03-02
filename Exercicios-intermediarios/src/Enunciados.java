///* DESAFIO 1 *///
/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das 
três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura 
acima, com todas as letras minúsculas.
Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplo 1
Entrada         Saída
Vertebrado  |   Homem
Mamífero    |
Onívoro     |

Exemplo 2
Entrada         Saída
Vertebrado  |   Águia
Ave         |
Carnívoro   |

Exemplo 3
Entrada         Saída
Invertebrado  | Minhoca
Anelídeo      |
Onívoro       |

*/

///* DESAFIO 2 *///
/*
Seu Zé está vendendo frutas com a seguinte tabela de preços:
Exemplo 1
Até 5 Kg                    Acima de 5 Kg
Morango	R$ 2,50 por Kg      R$ 2,20 por Kg
Maçã	R$ 1,80 por Kg  	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda
um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a 
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.
Saída
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.

Exemplo 1
Entrada     Saída
3       |   11.1
2       |

Exemplo 2
Entrada     Saída
1       |   4.3
1       |
*/

///* DESAFIO 3 *///
/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule
o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
Area = XX.X
Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

Entrada
A entrada contém três valores reais.
Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo 1
Entrada         Saída
6.0 4.0 2.0 |   Area = 10

Exemplo 2
Entrada         Saída
6.0 4.0 2.1 |   Perimetro = 12.1
*/


///* DESAFIO 4 *///
/*
Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar um
programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de 
entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para 
entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 
Saída
A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, conforme 
exemplo abaixo:

Exemplo 1
Entrada             Saída
“Amo a DIO”     |   Espacos em branco: 2 Vogais: 5

Exemplo 2
Entrada                         Saída
“Esse desafio foi facil”    |   Espacos em branco: 3 Vogais: 10 

Exemplo 3                           Saída
“Navegar nas aguas do teu mar”  |   Espacos em branco: 5 Vogais: 11 
*/


///* DESAFIO 5 *///
/*
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que 
nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, 
sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. 
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela
abaipxo.
Renda                   Imposto de renda
de 0.00 a 2000.00       Isento
de 2000.01 a 3000.00    8%
de 3000.01 a 4500.00    18%
acima de 4500.00        28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa 
de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo),
a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser
impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após
o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

Exemplo 1
Entrada     Saída
3002.00 |   R$ 80.36

Exemplo 2
Entrada     Saída
1701.12 |   Isento

Exemplo 3
Entrada     Saída
4520.00 |   R$ 355.60
*/