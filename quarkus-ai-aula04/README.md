# Aula 04 — Construindo seu primeiro AI Service

Exemplo de uma API REST em **Quarkus** que usa **LangChain4j** para conversar com um modelo local executado pelo **Ollama**. O projeto também inclui um pipeline **Easy RAG** para que as respostas usem os documentos da disciplina.

## Fluxo

```text
Cliente HTTP -> POST /api/chat -> ChatResource -> StudyAssistant -> Easy RAG -> Ollama -> modelo local
```

`StudyAssistant` é uma interface anotada com `@RegisterAiService`. O Quarkus gera sua implementação; portanto, o controller só precisa injetá-la e chamar o método `responder`. Ao iniciar, o Easy RAG lê os arquivos de `src/main/resources/rag`, cria embeddings em memória e acrescenta os trechos relevantes ao contexto da pergunta.

## Pré-requisitos

- Java 17;
- Maven 3.9+;
- [Ollama](https://ollama.com/) instalado e em execução.

Baixe os modelos padrão antes de iniciar a API:

```bash
ollama pull llama3.2
ollama pull nomic-embed-text
```

Caso queira usar outro modelo, defina `OLLAMA_MODEL` (por exemplo, `qwen3:1.7b`). Para o RAG, `OLLAMA_EMBEDDING_MODEL` define o modelo de embeddings. A URL do Ollama também pode ser ajustada por `OLLAMA_BASE_URL`; por padrão é `http://localhost:11434`.

## Executar

```bash
mvn quarkus:dev
```

## Testar a API

```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d "{\"pergunta\":\"Explique o que é injeção de dependência em Java.\"}"
```

Resposta esperada:

```json
{
  "resposta": "..."
}
```

## Estrutura

- `assistant/StudyAssistant.java`: prompt de sistema e contrato do AI Service;
- `resource/ChatResource.java`: endpoint HTTP;
- `resource/ChatRequest.java` e `ChatResponse.java`: contratos JSON;
- `rag/guia-pos-java.md`: base de conhecimento usada pelo Easy RAG;
- `application.properties`: conexão com o Ollama, modelos e configuração do RAG.

## Verificação sem Ollama

```bash
mvn test
```

Os testes não chamam o modelo. Para uma conversa real, o Ollama e o modelo escolhido precisam estar disponíveis.
