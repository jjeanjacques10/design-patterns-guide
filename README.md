# Design Patterns Guide

Guia sobre Design Patterns criado a partir dos meus estudos sobre o tema.

### O que é?

Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objectos.

- **[Strategy](https://refactoring.guru/design-patterns/strategy)**
    - Evita o uso excessivo de condicionais
    - Código mais coeso
    - Auxilia a implementar o conceito de Aberto-Fechado (Open-Closed Principle) do SOLID
- **[Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)**
    - É um padrão de design comportamental que permite que você passe solicitações ao longo de uma cadeia de
      manipuladores
- **[Template Method](https://refactoring.guru/design-patterns/template-method)**
    - Aplicação de um método concreto na classe "mãe"
    - Ajuda no reaproveitamento de código
    - Extrai o que for comum nas classes "filhas" para a classe "mãe"
- **[State](https://refactoring.guru/design-patterns/state)**
    - Utilizado quando á a transição de estados (ex: APROVADO, REPROVADO, FINALIZADO)
    - Parecido com o Strategy
- **[Command](https://refactoring.guru/design-patterns/command)**
    - Transforma uma solicitação em um objeto independente que contém todas as informações sobre a solicitação
    - Separa os dados das funcionalidades quando necessário
    - Muito utilizado no padrão de arquitetura Domain Driven Design
- **[Observer](https://refactoring.guru/design-patterns/observer)**
    - Permite definir um mecanismo de inscrição para notificar vários objetos sobre quaisquer eventos que acontecem ao objeto que eles estão observando
    - Tenho observadores que estão observando uma ação que será executada
    - Ajuda a manter a coesão

### Fontes

- [Design Patterns em Java](https://cursos.alura.com.br/course/introducao-design-patterns-java)
- [Podcast Design Patterns](https://cursos.alura.com.br/hipsterstech-design-patterns-hipsters-206-a345)
- [Livro Design Patterns](https://www.amazon.com.br/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612/ref=asc_df_0201633612/?tag=googleshopp00-20&linkCode=df0&hvadid=379735814613&hvpos=&hvnetw=g&hvrand=6375507411940335659&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-395340045790&psc=1)

---
Developed by [Jean Jacques](https://github.com/jjeanjacques10)