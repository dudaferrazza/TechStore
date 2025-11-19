# Atividade - Refatoração para Responsabilidade Única (SRP)

Esta atividade tinha como objetivo refatorar um código Java que violava o Princípio da Responsabilidade Única (SRP), um dos princípios SOLID, e aplicar uma arquitetura mais limpa e manutenível.

---

## O Problema

A classe original, `ProcessadorDePedido`, acumulava múltiplas responsabilidades, tornando-se instável e de alto risco de manutenção. Qualquer alteração em uma regra de negócio forçava a modificação de todo o código, podendo quebrar outras funcionalidades.

As quatro responsabilidades violadas eram:

1. Validação de Negócio/Disponibilidade (Estoque)
2. Cálculo de Domínio Complexo (Frete e Impostos)
3. Comunicação Externa/Persistência (Salvar no Banco de Dados)
4. Comunicação Externa/Integração (Notificar E-mail)

---

## A Solução

A solução consistiu em separar cada responsabilidade em classes especializadas:

- `ValidadorDeEstoque` - Validação
- `CalculadoraDeValores` - Cálculo de Domínio
- `RepositorioDePedido` - Persistência
- `NotificadorDeEmail` - Notificação Externa
- `ServicoDePedido` - Orquestra o fluxo

---

## Importância da Separação

A refatoração é crucial por três motivos:

**Coesão Aumentada e Instabilidade Reduzida**: Mudar a forma de salvar o pedido afeta apenas o `RepositorioDePedido`, deixando as outras classes intocadas.

**Facilidade de Manutenção**: O código se torna mais fácil de entender e modificar, pois a lógica está bem isolada.

**Melhor Testabilidade**: Cada classe pode ser testada unitariamente de forma isolada, sem a necessidade de simular outras dependências complexas.
