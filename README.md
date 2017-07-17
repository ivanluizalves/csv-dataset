# Csv Dataset

Para executar, basta compilar utilizando o seguinte comando:
***mvn clean install***

Após compilar e executar os testes, entre na pasta ***target*** que será criada, e execute o seguinte comando:
***java -jar csv-dataset-0.0.1-SNAPSHOT-jar-with-dependencies.jar***

Os seguites comandos são aceitos pelo programa:
- **count** * - escreve no console a contagem total de registros importados (não deve considerar a linha de cabeçalho)
- **count distinct [propriedade]** - escreve no console o total de valores distintos da propriedade (coluna) enviada 
- **filter [propriedade] [valor]** - escreve no console a linha de cabeçalho e todas as linhas em que a propriedade enviada possua o valor enviado 
- **exit** - sai do programa

