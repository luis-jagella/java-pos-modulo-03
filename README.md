# java-pos-modulo-03
Desenvolvimento de Aplicações Back-End com Spring Boot e Quarkus

## Módulo 03

### Submódulo 1
#### Aula 01 — Introdução ao Quarkus

Nesta primeira aula do módulo de Quarkus, foram apresentados os conceitos iniciais do ecossistema moderno de desenvolvimento Java voltado para aplicações cloud-native, microsserviços e APIs REST. O foco principal foi compreender como frameworks atuais abstraem grande parte da complexidade do desenvolvimento backend, principalmente em cenários que envolvem containers, escalabilidade e integração com ambientes orquestrados.

Também foram introduzidos conceitos fundamentais como containers e Docker, entendendo como aplicações podem ser empacotadas de forma isolada e portátil. Em conjunto, foi apresentado o Kubernetes, responsável pelo gerenciamento, escalabilidade e orquestração desses containers em ambientes distribuídos e cloud.

Outro ponto importante abordado foi o conceito de aplicações “Container First” e “Kubernetes Native”, destacando como o Quarkus foi projetado para inicialização rápida, baixo consumo de memória e melhor adaptação a ambientes modernos de cloud computing.

A aula também passou pelos conceitos de OpenJDK e GraalVM, entendendo diferenças entre execução tradicional na JVM e compilação nativa, utilizada para melhorar performance e tempo de startup em aplicações Java modernas.

Por fim, houve uma introdução ao ecossistema de IA integrado ao Java utilizando LangChain4j, compreendendo sua função como camada de integração entre aplicações Java e modelos de IA generativa, permitindo construção de chatbots, RAGs, ferramentas inteligentes e integrações com LLMs.

# Próximos passos:

* adicionar README da aula 02
* adicionar dependências iniciais do Quarkus
* criar package base
* subir anotações/conceitos estudados
* organizar pastas e planejamento

# Aula 03 e 04 — GraalVM e Compilação Nativa

Nestas aulas foram apresentados os conceitos de GraalVM e compilação nativa no ecossistema Java moderno, entendendo como aplicações podem ser executadas além do modelo tradicional baseado na JVM.

Foi revisado o fluxo tradicional de execução Java, onde o código-fonte é compilado para bytecode e executado pela JVM, que realiza diversas tarefas durante a execução, como gerenciamento de memória, carregamento de classes e otimizações em tempo de execução.

Também foi apresentado o conceito de compilação nativa, no qual a aplicação é transformada em um executável nativo antes da execução. Dessa forma, a aplicação não precisa inicializar toda a JVM no momento do startup, trazendo benefícios importantes como:

- Menor tempo de inicialização da aplicação;
- Menor consumo de memória;
- Melhor desempenho em ambientes com containers;
- Melhor adaptação a ambientes cloud e Kubernetes.

Foi abordado como frameworks modernos, como Quarkus, utilizam esse conceito para criar aplicações mais leves e rápidas, principalmente em arquiteturas baseadas em microsserviços.

Além disso, foi possível entender a diferença entre os dois fluxos:

Java tradicional:

Código Java → Bytecode → JVM → Aplicação em execução

Compilação nativa:

Código Java → Compilação nativa → Executável → Aplicação em execução

Também foi discutido que a compilação nativa possui algumas limitações e cuidados, como maior tempo de build e possíveis adaptações necessárias para recursos que dependem fortemente de reflexão dinâmica.

# Aula 05 - Desenvolvimento e Consumo de APIS REST

Nesta aula foram apresentados os conceitos básicos para desenvolvimento e consumo de APIs REST utilizando Java no ecossistema do Quarkus.

Foi realizada uma introdução aos principais métodos HTTP utilizados no desenvolvimento de aplicações backend, compreendendo o papel de cada operação dentro de uma API:

- GET → utilizado para consultar ou buscar informações;
- PUT → utilizado para atualizar informações existentes;
- DELETE → utilizado para remover dados.

Também foi demonstrado como uma API expõe endpoints para comunicação entre sistemas, permitindo que aplicações troquem informações através de requisições HTTP.

Além da criação de endpoints básicos, foi apresentado o consumo de APIs externas, demonstrando como aplicações podem realizar chamadas para serviços de terceiros e utilizar seus dados dentro da própria aplicação.

Durante a aula também foi possível reforçar conceitos relacionados ao modelo cliente-servidor e ao fluxo de comunicação entre aplicações:

Cliente → Requisição HTTP → API → Processamento → Resposta

Conceitos reforçados:

- Estrutura básica de uma API REST;
- Métodos HTTP e suas responsabilidades;
- Criação de endpoints;
- Comunicação entre sistemas;
- Consumo de APIs externas;
- Troca de dados via HTTP.

# Aula 06 — Uso da API Fault Tolerance

Nesta aula foram apresentados mecanismos de tolerância a falhas utilizados em aplicações distribuídas, principalmente em cenários onde uma aplicação depende de APIs externas ou outros serviços.

Foi possível compreender como aplicações podem implementar estratégias para evitar indisponibilidade total do sistema quando um serviço apresenta falhas ou lentidão.

Conceitos abordados:

- Retry → realiza novas tentativas automaticamente;
- Timeout → limita o tempo máximo de espera;

# Aula 07 — Persistência de Dados com Panache

Nesta aula foi apresentada a persistência de dados utilizando Panache no Quarkus, entendendo como o framework simplifica operações comuns de banco de dados.

Foi demonstrado como entidades podem ser mapeadas através de anotações e como operações básicas de persistência podem ser realizadas sem a necessidade de implementar consultas complexas manualmente.

Conceitos abordados:

- Mapeamento de entidades;
- Persistência de objetos;
- Consultas simplificadas;
- Operações CRUD;
- Integração entre aplicação e banco de dados.

Também foi possível compreender como o Panache reduz código repetitivo ao fornecer métodos prontos para operações frequentes.
- Fallback → define respostas alternativas;
- Circuit Breaker → interrompe chamadas quando muitas falhas ocorrem.

Esses mecanismos aumentam a resiliência da aplicação e tornam sistemas distribuídos mais seguros e estáveis.

# Aula 08 — Autenticação e Segurança com JWT e RBAC

Nesta aula foram apresentados conceitos de autenticação e autorização em APIs REST utilizando JWT e RBAC.

Foi possível compreender como aplicações modernas realizam controle de acesso através de tokens de autenticação, evitando a necessidade de enviar usuário e senha a cada requisição.

Conceitos abordados:

- JWT (JSON Web Token);
- Autenticação baseada em token;
- Header Authorization;
- Controle de acesso por papéis (RBAC);
- Proteção de endpoints.

Fluxo básico:

Usuário → Login → Geração do Token → Requisições autenticadas

Também foi apresentado o conceito de RBAC (Role Based Access Control), permitindo restringir funcionalidades com base nos papéis atribuídos aos usuários, como ADMIN e USER.

# Aula 09 — Observabilidade com OpenTelemetry

Nesta aula foram apresentados conceitos de observabilidade em aplicações modernas utilizando OpenTelemetry.

Foi possível compreender como aplicações podem gerar informações para monitoramento, diagnóstico e análise de comportamento em tempo de execução.

Os três pilares da observabilidade abordados foram:

- Logs → registro de eventos da aplicação;
- Métricas → indicadores numéricos de desempenho;
- Traces → rastreamento do fluxo de execução.

Também foi possível compreender como o OpenTelemetry permite acompanhar requisições entre diferentes serviços, facilitando a identificação de gargalos, falhas e problemas de desempenho.

Fluxo simplificado:

Cliente → API → Serviços → Banco → Resposta

Com traces:

Cliente → API → Serviço A → Serviço B → Banco

Tempo de execução registrado em cada etapa.

### Submódulo 1
#### Aula 01 - Spring Boot (Isidro)

* Implememtei 3 endpoints para testes.
** 2 GET's 
** 1 POST
