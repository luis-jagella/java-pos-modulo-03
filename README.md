# Engenharia-Software-Java-Pós-Módulo-03
Desenvolvimento de Aplicações backend com Quarkus e Spring Boot

---

## Módulo 03

### Submódulo 1: Quarkus

#### Aula 01 — Introdução ao Quarkus
Nesta primeira aula do módulo de Quarkus, foram apresentados os conceitos iniciais do ecossistema moderno de desenvolvimento Java voltado para aplicações cloud-native, microsserviços e APIs REST. O foco principal foi compreender como frameworks atuais abstraem grande parte da complexidade do desenvolvimento backend, principalmente em cenários que envolvem containers, escalabilidade e integração com ambientes orquestrados.

Também foram introduzidos conceitos fundamentais como containers e Docker, entendendo como aplicações podem ser empacotadas de forma isolada e portátil. Em conjunto, foi apresentado o Kubernetes, responsável pelo gerenciamento, escalabilidade e orquestração desses containers em ambientes distribuídos e cloud.

Outro ponto importante abordado foi o conceito de aplicações “Container First” e “Kubernetes Native”, destacando como o Quarkus foi projetado para inicialização rápida, baixo consumo de memória e melhor adaptação a ambientes modernos de cloud computing.

A aula também passou pelos conceitos de OpenJDK e GraalVM, entendendo diferenças entre execução tradicional na JVM e compilação nativa, utilizada para melhorar performance e tempo de startup em aplicações Java modernas.

Por fim, houve uma introdução ao ecossistema de IA integrado ao Java utilizando LangChain4j, compreendendo sua função como camada de integração entre aplicações Java e modelos de IA generativa, permitindo construção de chatbots, RAGs, ferramentas inteligentes e integrações com LLMs.

#### Aula 03 e 04 — GraalVM e Compilação Nativa
Nestas aulas foram apresentados os conceitos de GraalVM e compilação nativa no ecossistema Java moderno, entendendo como aplicações podem ser executadas além do modelo tradicional baseado na JVM.

Foi revisado o fluxo tradicional de execução Java, onde o código-fonte é compilado para bytecode e executado pela JVM, que realiza diversas tarefas durante a execução, como gerenciamento de memória, carregamento de classes e otimizações em tempo de execução.

Também foi apresentado o conceito de compilação nativa, no qual a aplicação é transformada em um executável nativo antes da execução. Dessa forma, a aplicação não precisa inicializar toda a JVM no momento do startup, trazendo benefícios importantes como:
- Menor tempo de inicialização da aplicação;
- Menor consumo de memória;
- Melhor desempenho em ambientes com containers;
- Melhor adaptação a ambientes cloud e Kubernetes.

Foi abordado como frameworks modernos, como Quarkus, utilizam esse conceito para criar aplicações mais leves e rápidas, principalmente em arquiteturas baseadas em microsserviços.

**Diferença entre os dois fluxos:**

`Java tradicional:`
> Código Java → Bytecode → JVM → Aplicação em execução

`Compilação nativa:`
> Código Java → Compilação nativa → Executável → Aplicação em execução

Também foi discutido que a compilação nativa possui algumas limitações e cuidados, como maior tempo de build e possíveis adaptações necessárias para recursos que dependem fortemente de reflexão dinâmica.

#### Aula 05 - Desenvolvimento e Consumo de APIS REST
Nesta aula foram apresentados os conceitos básicos para desenvolvimento e consumo de APIs REST utilizando Java no ecossistema do Quarkus.

Foi realizada uma introdução aos principais métodos HTTP utilizados no desenvolvimento de aplicações backend, compreendendo o papel de cada operação dentro de uma API:
- **GET** → utilizado para consultar ou buscar informações;
- **PUT** → utilizado para atualizar informações existentes;
- **DELETE** → utilizado para remover dados.

Também foi demonstrado como uma API expõe endpoints para comunicação entre sistemas, permitindo que aplicações troquem informações através de requisições HTTP. Além da criação de endpoints básicos, foi apresentado o consumo de APIs externas, demonstrando como aplicações podem realizar chamadas para serviços de terceiros e utilizar seus dados dentro da própria aplicação.

Durante a aula também foi possível reforçar conceitos relacionados ao modelo cliente-servidor e ao fluxo de comunicação entre aplicações:
> Cliente → Requisição HTTP → API → Processamento → Resposta

**Conceitos reforçados:**
- Estrutura básica de uma API REST;
- Métodos HTTP e suas responsabilidades;
- Criação de endpoints;
- Comunicação entre sistemas;
- Consumo de APIs externas;
- Troca de dados via HTTP.

#### Aula 06 — Uso da API Fault Tolerance
Nesta aula foram apresentados mecanismos de tolerância a falhas utilizados em aplicações distribuídas, principalmente em cenários onde uma aplicação depende de APIs externas ou outros serviços.

Foi possível compreender como aplicações podem implementar estratégias para evitar indisponibilidade total do sistema quando um serviço apresenta falhas ou lentidão.

**Conceitos abordados:**
- **Retry** → realiza novas tentativas automaticamente;
- **Timeout** → limita o tempo máximo de espera;
- **Fallback** → define respostas alternativas;
- **Circuit Breaker** → interrompe chamadas quando muitas falhas ocorrem.

Esses mecanismos aumentam a resiliência da aplicação e tornam sistemas distribuídos mais seguros e estáveis.

#### Aula 07 — Persistência de Dados com Panache
Nesta aula foi apresentada a persistência de dados utilizando Panache no Quarkus, entendendo como o framework simplifica operações comuns de banco de dados.

Foi demonstrado como entidades podem ser mapeadas através de anotações e como operações básicas de persistência podem ser realizadas sem a necessidade de implementar consultas complexas manualmente.

**Conceitos abordados:**
- Mapeamento de entidades;
- Persistência de objetos;
- Consultas simplificadas;
- Operações CRUD;
- Integração entre aplicação e banco de dados.

Também foi possível compreender como o Panache reduz código repetitivo ao fornecer métodos prontos para operações frequentes.

#### Aula 08 — Autenticação e Segurança com JWT e RBAC
Nesta aula foram apresentados conceitos de autenticação e autorização em APIs REST utilizando JWT e RBAC.

Foi possível compreender como aplicações modernas realizam controle de acesso através de tokens de autenticação, evitando a necessidade de enviar usuário e senha a cada requisição.

**Conceitos abordados:**
- JWT (JSON Web Token);
- Autenticação baseada em token;
- Header Authorization;
- Controle de acesso por papéis (RBAC);
- Proteção de endpoints.

**Fluxo básico:**
> Usuário → Login → Geração do Token → Requisições autenticadas

Também foi apresentado o conceito de RBAC (Role Based Access Control), permitindo restringir funcionalidades com base nos papéis atribuídos aos usuários, como ADMIN e USER.

#### Aula 09 — Observabilidade com OpenTelemetry
Nesta aula foram apresentados conceitos de observabilidade em aplicações modernas utilizando OpenTelemetry.

Foi possível compreender como aplicações podem gerar informações para monitoramento, diagnóstico e análise de comportamento em tempo de execução.

**Os três pilares da observabilidade abordados foram:**
- **Logs** → registro de eventos da aplicação;
- **Métricas** → indicadores numéricos de desempenho;
- **Traces** → rastreamento do fluxo de execução.

Também foi possível compreender como o OpenTelemetry permite acompanhar requisições entre diferentes serviços, facilitando a identificação de gargalos, falhas e problemas de desempenho.

**Fluxo simplificado:**
> Cliente → API → Serviços → Banco → Resposta

**Com traces:**
> Cliente → API → Serviço A → Serviço B → Banco
*(Tempo de execução registrado em cada etapa)*

---

### 🍃 Submódulo 1 e 2: Spring Boot

#### Aula 01 - Spring Boot (Isidro)
Implementei 3 endpoints para testes:

**2 GET's:**
- GET all users;
- GET by ID;

**1 POST:**
- Send user;

#### Aula 02 — Spring: Criação de APIs REST
Nesta aula foram apresentados os conceitos fundamentais para criação de APIs REST utilizando Spring Boot.

Foi demonstrado como o framework permite expor endpoints HTTP de forma simples através de anotações, facilitando a comunicação entre aplicações e serviços. Durante a aula foram explorados os principais componentes envolvidos na construção de uma API REST, incluindo controllers, mapeamento de rotas e manipulação de requisições e respostas HTTP.

**Conceitos abordados:**
- Criação de Controllers com `@RestController`;
- Mapeamento de endpoints utilizando `@RequestMapping`;
- Criação de operações GET e POST;
- Recebimento de dados através de `@RequestBody`;
- Utilização de parâmetros de rota com `@PathVariable`;
- Serialização e desserialização automática de objetos Java para JSON.

Também foi possível compreender como o Spring Boot simplifica a criação de serviços REST, permitindo o desenvolvimento rápido de APIs para comunicação entre sistemas.

> Cliente → Requisição HTTP → Controller → Processamento → Resposta JSON

#### Aula 03 — Spring: Integração com JPA
Nesta aula foram apresentados os conceitos fundamentais de persistência de dados utilizando JPA (Java Persistence API) no ecossistema Spring Boot.

Foi possível compreender como objetos Java podem ser mapeados para tabelas de banco de dados através de anotações, permitindo que operações de persistência sejam realizadas de forma orientada a objetos, sem a necessidade de escrever comandos SQL para tarefas básicas.

Durante a aula foram abordados os principais conceitos relacionados ao ORM (Object Relational Mapping), responsável por realizar a conversão entre entidades Java e estruturas relacionais do banco de dados.

**Conceitos abordados:**
- Introdução ao JPA;
- Integração entre Spring Boot e banco de dados;
- Mapeamento de entidades com `@Entity`;
- Definição de chaves primárias com `@Id`;
- Geração automática de identificadores;
- Persistência de objetos;
- Operações básicas de CRUD;
- Conceitos de ORM (Object Relational Mapping).

**Fluxo básico:**
> Objeto Java → JPA → Banco de Dados

Também foi possível compreender como o JPA reduz a complexidade do acesso a dados, permitindo que o desenvolvedor trabalhe principalmente com objetos Java em vez de comandos SQL para operações simples de persistência.

**Tecnologias relacionadas:**
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- JDBC

#### Aula 04 e 05 — Spring: Integração com JPA, Services, Query by Method Name e Conclusão da API
Nestas aulas o foco foi finalizar a construção da API. Foram explorados o encapsulamento de regras de negócios na camada de Services e a utilização da funcionalidade *Query by Method Name* do Spring Data JPA, que permite criar consultas dinâmicas apenas nomeando os métodos na interface do repositório, otimizando bastante o tempo de desenvolvimento.

#### Aula 06 - Controle Transacional
Aula referente a controle transacional.

### Aulas 07,08 e 09 - OAuth e JWT/Token via Google
Nestas aulas, aprendemos sobre a autenticação durante/após as nossas requisições.

#### Submódulo 04 - Kafka/Quarkus

#### Aula 01 — O que é mensageria?
Nesta aula foram apresentados os conceitos de mensageria e comunicação assíncrona entre aplicações. Em vez de um serviço chamar outro diretamente e aguardar uma resposta, a informação pode ser publicada como uma mensagem para ser processada por outro componente no momento adequado.

Esse modelo reduz o acoplamento entre os sistemas: o produtor precisa saber apenas para qual canal enviar a mensagem, enquanto o consumidor se concentra no processamento. Assim, os serviços podem evoluir e escalar de forma mais independente.

**Fluxo básico:**
> Produtor → Broker de mensagens → Consumidor

**Conceitos abordados:**
- **Produtor** → aplicação que cria e publica uma mensagem;
- **Broker** → intermediário que recebe, armazena e distribui as mensagens;
- **Consumidor** → aplicação que recebe e processa uma mensagem;
- **Fila ou tópico** → canal lógico pelo qual as mensagens trafegam;
- **Comunicação assíncrona** → o produtor não precisa aguardar o processamento para continuar seu fluxo.

Também foi possível compreender os ganhos desse tipo de comunicação, como maior resiliência, melhor capacidade de processamento em paralelo e menor dependência direta entre os serviços. Caso um consumidor fique indisponível temporariamente, o broker pode manter a mensagem até que ela seja processada, conforme a configuração adotada.

#### Aula 02 - FUNDAMENTOS DE KAFKA
Nesta aula foram apresentados os fundamentos do Apache Kafka, uma plataforma distribuída de eventos e mensageria muito utilizada na comunicação entre microsserviços e no processamento de dados em tempo real.

O Kafka organiza as mensagens em **tópicos**. Uma aplicação produtora publica eventos em determinado tópico, enquanto uma ou mais aplicações consumidoras leem esses eventos para executar seus respectivos processamentos.

**Principais conceitos abordados:**
- **Broker** → servidor Kafka responsável por receber, armazenar e disponibilizar mensagens;
- **Topic** → categoria ou canal lógico em que os eventos são publicados;
- **Producer** → aplicação que envia mensagens para um tópico;
- **Consumer** → aplicação que lê e processa mensagens de um tópico;
- **Partition** → divisão de um tópico que permite paralelismo e maior capacidade de processamento;
- **Consumer Group** → grupo de consumidores que divide as partições e o trabalho entre si;
- **Offset** → posição que identifica uma mensagem dentro de uma partição.

**Fluxo básico:**
> Producer → Topic Kafka → Consumer Group → Consumers

Também foi possível compreender que as mensagens são persistidas por um período configurável. Dessa forma, consumidores podem retomar o processamento a partir de um offset específico ou reprocessar eventos quando necessário.

As partições permitem escalar o consumo das mensagens, pois diferentes consumidores de um mesmo grupo podem trabalhar em paralelo. Ao mesmo tempo, o Kafka preserva a ordem dos eventos dentro de cada partição.

#### Aula 03 - CONSUMIDOR COM QUARKUS REACTIVE MESSAGING
Nesta aula foi demonstrado como consumir mensagens do Kafka utilizando o Quarkus Reactive Messaging. A integração é simplificada pela extensão SmallRye Reactive Messaging, que conecta os canais da aplicação aos tópicos configurados no broker.

O consumidor recebe os eventos publicados em um tópico e executa alguma regra de negócio, como persistir dados, atualizar uma informação ou acionar outro serviço. Esse processamento acontece de forma orientada a eventos, sem a necessidade de expor ou chamar um endpoint HTTP para cada comunicação.

**Conceitos abordados:**
- Configuração de canais de entrada para Kafka;
- Consumo assíncrono de eventos;
- Uso da anotação `@Incoming`;
- Desserialização da mensagem recebida;
- Processamento de regras de negócio a partir de eventos;
- Integração entre Quarkus, SmallRye Reactive Messaging e Kafka.

**Exemplo conceitual:**

```java
@Incoming("pedido-recebido")
public void consumirPedido(String mensagem) {
    System.out.println("Mensagem recebida: " + mensagem);
}
```

No exemplo, o método é acionado sempre que uma nova mensagem chega ao canal `pedido-recebido`. Esse canal é associado, nas configurações da aplicação, a um tópico Kafka.

**Fluxo de consumo:**
> Tópico Kafka → Canal de entrada → `@Incoming` → Processamento da mensagem

Também foi possível compreender a importância de tratar falhas no processamento e de confirmar corretamente o consumo das mensagens, evitando perda de eventos ou processamentos duplicados em cenários distribuídos.

#### Aula 04 - PRODUTOR COM QUARKUS REACTIVE MESSAGING
Nesta aula foi apresentado como produzir e enviar mensagens para o Kafka utilizando Quarkus Reactive Messaging. O produtor é o componente responsável por publicar eventos, permitindo que outros serviços interessados possam consumi-los de maneira independente.

No Quarkus, os canais de saída representam o caminho pelo qual a aplicação envia mensagens para o broker. A anotação `@Channel` injeta um emissor associado a esse canal, que pode ser utilizado nas regras de negócio para publicar eventos.

**Conceitos abordados:**
- Configuração de canais de saída para Kafka;
- Produção e publicação de mensagens;
- Uso da anotação `@Channel`;
- Uso de `Emitter` para enviar eventos;
- Comunicação assíncrona entre serviços;
- Separação entre a regra de negócio do produtor e o processamento realizado pelos consumidores.

**Exemplo conceitual:**

```java
@Inject
@Channel("pedido-enviado")
Emitter<String> emitter;

public void enviarPedido(String pedido) {
    emitter.send(pedido);
}
```

Nesse exemplo, o método `enviarPedido` publica o conteúdo recebido no canal `pedido-enviado`. A configuração do Quarkus associa esse canal ao tópico Kafka correspondente.

**Fluxo completo:**
> API ou serviço → Produtor Quarkus → Tópico Kafka → Consumidor Quarkus → Processamento

Com isso, foi possível compreender como a produção de eventos permite integrar serviços de forma desacoplada. Após enviar a mensagem, o produtor não precisa conhecer a implementação nem aguardar o processamento de cada consumidor interessado naquele evento.
---

## 🎯 Próximos Passos:
- [ ] subir anotações/conceitos estudados
- [ ] organizar pastas e planejamento
- [ ] Refatorar controllers para utilizar a camada de services;
- [ ] Finalizar endpoints com DTOs de request e response;
- [ ] Testar relacionamento entre Produto e Categoria no Postman;

---

#### IA com Quarkus, LangChain4j e Ollama

#### Aula 05 — Por que RAG? Arquitetura de um Pipeline de Conhecimento

Nesta aula foi apresentada a necessidade de complementar modelos de linguagem com informações específicas do domínio da aplicação. Embora um LLM possua conhecimento geral, ele não conhece automaticamente regras internas, documentos da empresa ou dados atualizados. O padrão **RAG** (*Retrieval-Augmented Generation*) resolve esse problema ao recuperar conteúdo relevante antes de enviar a pergunta ao modelo.

O pipeline de conhecimento foi dividido em duas etapas principais:

- **Ingestão** → leitura dos documentos, divisão em trechos (*chunks*), geração de embeddings e armazenamento em uma base vetorial;
- **Recuperação e geração** → transformação da pergunta em embedding, busca dos trechos semanticamente mais próximos e inclusão desse contexto no prompt enviado ao LLM.

**Fluxo simplificado:**

> Documentos → Ingestão → Chunks + Embeddings → Base vetorial
>
> Pergunta do usuário → Busca semântica → Contexto relevante → LLM → Resposta fundamentada

Com essa arquitetura, o serviço deixa de depender apenas do conhecimento genérico do modelo e passa a responder de forma mais útil, contextualizada e especializada no negócio. Também foi reforçado que o RAG não retreina o modelo: ele apenas fornece contexto no momento da resposta.

#### Aula 06 — Ingestão de Dados com Easy RAG

Nesta aula foi demonstrado como implementar a etapa de ingestão usando a extensão **Easy RAG** do Quarkus LangChain4j. A extensão reduz a complexidade inicial do pipeline ao ler documentos de uma pasta configurada, gerar embeddings por meio de um modelo apropriado e armazenar os vetores em memória.

**Conceitos abordados:**

- Adição da dependência `quarkus-langchain4j-easy-rag`;
- Uso de um modelo de embeddings local no Ollama, como `nomic-embed-text`;
- Organização dos documentos em `src/main/resources/rag`;
- Configuração do caminho de ingestão com `quarkus.langchain4j.easy-rag.path`;
- Divisão dos documentos em segmentos e recuperação dos trechos mais relevantes;
- Enriquecimento automático do AI Service com o contexto recuperado.

**Exemplo de configuração:**

```properties
quarkus.langchain4j.ollama.embedding-model.model-id=nomic-embed-text
quarkus.langchain4j.easy-rag.path=rag
quarkus.langchain4j.easy-rag.path-type=CLASSPATH
```

O Easy RAG é adequado para compreender o padrão e criar um primeiro pipeline de conhecimento. Como a base vetorial usada nesse cenário é mantida em memória, os dados precisam ser ingeridos novamente ao reiniciar a aplicação. Em evoluções futuras, o armazenamento pode ser substituído por uma base vetorial persistente.

#### Aula 07 — Vector Database

Nesta aula foi apresentado o papel de um **banco de dados vetorial** em aplicações com IA. Diferentemente de uma busca tradicional baseada apenas em palavras-chave ou filtros exatos, um banco vetorial armazena *embeddings*: representações numéricas que capturam o significado semântico de textos, imagens ou outros conteúdos.

Quando um documento é ingerido, cada trecho é convertido em um vetor e salvo junto com seus metadados. Ao receber uma pergunta, a aplicação também gera o embedding da consulta e procura os vetores mais próximos. Essa busca por similaridade permite encontrar conteúdo relevante mesmo quando a pergunta usa palavras diferentes das presentes no documento.

**Conceitos abordados:**

- **Embedding** → vetor numérico que representa o significado de um conteúdo;
- **Similaridade semântica** → comparação entre vetores para localizar conteúdos relacionados;
- **Metadados** → informações adicionais para filtrar, identificar e rastrear os documentos;
- **Top K** → quantidade de trechos mais similares retornados pela busca;
- **Persistência** → conservação dos embeddings entre reinicializações da aplicação.

**Fluxo de indexação e busca:**

> Documento → Chunks → Modelo de embeddings → Vetores + metadados → Vector Database
>
> Pergunta → Embedding da pergunta → Busca por similaridade → Top K trechos relevantes

O uso de uma base vetorial persistente supera a limitação do Easy RAG em memória, evitando que a aplicação precise processar novamente todos os documentos a cada reinicialização e permitindo ampliar a base de conhecimento de forma mais confiável.

#### Aula 08 — RAG com Vector Database na Prática

Nesta aula foi aplicado o padrão RAG com uma base vetorial persistente. A implementação separa claramente a indexação dos documentos da consulta do usuário: primeiro o conteúdo é transformado em embeddings e armazenado; depois, as perguntas recuperam os trechos semanticamente mais relevantes para compor o contexto enviado ao LLM.

**Etapas do fluxo prático:**

1. Carregar e dividir os documentos em segmentos menores;
2. Gerar embeddings para cada segmento usando o modelo de embeddings;
3. Salvar vetores e metadados no banco vetorial;
4. Gerar o embedding da pergunta recebida pela API;
5. Recuperar os trechos com maior similaridade;
6. Enviar pergunta e contexto recuperado ao LLM para gerar a resposta.

**Fluxo completo:**

> Ingestão → Embeddings → Vector Database → Recuperação semântica → Augmentação do prompt → LLM → Resposta

Com essa evolução, o RAG passa a ser mais adequado a cenários reais de negócio, pois a base de conhecimento pode crescer, permanecer disponível após reinicializações e ser atualizada sem depender do contexto interno do modelo. Também foi reforçada a importância de definir bons tamanhos de *chunk*, metadados e quantidade de resultados recuperados, pois esses fatores influenciam diretamente a qualidade da resposta.
