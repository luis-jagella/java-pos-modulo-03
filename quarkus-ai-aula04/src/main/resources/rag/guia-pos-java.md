# Guia da pós-graduação em Java

## Padrão de projetos

Os exemplos da disciplina utilizam Java 17. Os projetos Quarkus são executados com Maven e expõem APIs REST em JSON.

## Quarkus

Quarkus é um framework Java voltado a aplicações cloud-native. Ele oferece inicialização rápida, baixo consumo de memória e integração com APIs REST.

## Serviço de IA

Este projeto usa Ollama para executar modelos de linguagem localmente. LangChain4j permite declarar o serviço de IA por meio de uma interface Java anotada com `@RegisterAiService`.

## RAG

RAG significa Retrieval-Augmented Generation. Antes de responder, a aplicação busca trechos relevantes dos documentos configurados e os fornece como contexto ao modelo. Nesta aula, o Easy RAG indexa os arquivos desta pasta em memória; a próxima etapa pode substituir esse armazenamento por um banco vetorial persistente.
