# Csv Dataset

Para executar, basta compilar utilizando o seguinte comando:
***mvn clean install***

Após compilar e executar os testes, entre na pasta ***target*** que será criada, e execute o seguinte comando:
***java -jar csv-dataset-0.0.1-SNAPSHOT-jar-with-dependencies.jar***
> **Atenção:** Para executar o programa, é necessário acesso a Internet, para que possa buscar os dados da fonte.

Os seguites comandos são aceitos pelo programa:
- **count** * - escreve no console a contagem total de registros 
- **count distinct [propriedade]** - escreve no console o total de valores distintos da propriedade (coluna) 
- **filter [propriedade] [valor]** - escreve no console a linha de cabeçalho e todas as linhas em que a propriedade possui o valor 
- **exit** - sai do programa

