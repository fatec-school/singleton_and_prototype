# Singleton & Prototype

## O problema

- **Impressora**: só pode existir uma única conexão com a fila de impressão.
- **Certificado**: a arte e os dados do curso são pesados para carregar do banco a cada
  aluno. A solução é montar um certificado "padrão" (com o curso já preenchido e o nome
  do aluno em branco) uma única vez, e depois clonar esse padrão para cada aluno,
  alterando apenas o nome.

## Padrões aplicados

### Singleton — `FilaDeImpressao`

O construtor é `private`, e a única forma de obter o objeto é pelo método estático
`getInstance()`, que cria a instância na primeira chamada e reaproveita nas seguintes.
Isso garante que todo o sistema compartilhe a mesma fila/conexão com a impressora.

### Prototype — `Certificado`

`Certificado` implementa `Cloneable` e expõe o método `clonar()`, que usa
`super.clone()` para gerar uma cópia independente do objeto
original em memória. Assim, o certificado molde é montado
uma única vez e cada aluno recebe um clone próprio, apenas com `setNomeAluno()`
alterado.

## Como executar

Requisitos: Java 17+ e Maven.

```bash
mvn compile exec:java -Dexec.mainClass=com.nickolss.Main
```
