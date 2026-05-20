# java-pos-modulo-03
Desenvolvimento de Aplicações Back-End com Spring Boot e Quarkus

Aula 01 — Módulo 03: Introdução ao Quarkus

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

