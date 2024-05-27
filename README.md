# Projeto Calculator com PITest

Este projeto é um exemplo de como usar o PITest para testes de mutação em um projeto Java usando Gradle.

## Pré-requisitos

- JDK 17
- Gradle 6.0 ou superior

## Instalação do Projeto

1. Clone o repositório:

    ```sh
    git clone https://github.com/debora-cristinaf/pi-test-example-gradle.git
    cd pi-test-example-gradle
    ```

2. Compile o projeto:

    ```sh
    ./gradlew build
    ```

## Rodando os Testes

Para rodar os testes unitários, use o seguinte comando:

```sh
./gradlew test
```

## Configuração do PITest
O plugin do PITest já está configurado no build.gradle. Você pode rodar o PITest com o comando:

```sh
./gradlew pitest
```
## Analisando os Resultados do PITest

Os relatórios do PITest serão gerados no diretório build/reports/pitest. Abra o arquivo HTML gerado para ver os resultados das mutações.
