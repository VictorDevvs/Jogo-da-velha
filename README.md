# Jogo da Velha em Java

Este projeto implementa um jogo da velha (tic-tac-toe) simples utilizando a linguagem Java. O jogo é jogado no terminal e suporta dois jogadores que se alternam para marcar suas jogadas.

## 📌 Funcionalidades
- Jogo da velha para dois jogadores.
- Validação de entradas para evitar jogadas inválidas.
- Verificação automática de vitória ou empate.
- Interface simples baseada em console.

## 📂 Estrutura do Projeto
```
JogoDaVelha/
│── src/
│   ├── tictactoe/core/        # Lógica principal do jogo
│   │   ├── Game.java         # Gerencia o jogo
│   │   ├── Board.java        # Representa o tabuleiro
│   │   ├── Players.java      # Gerencia a alternância dos jogadores
│   │   ├── Coord.java        # Representa coordenadas no tabuleiro
│   │   ├── Symbol.java       # Enum para os símbolos X e O
│   ├── tictactoe/io/         # Entrada e saída de dados
│   │   ├── Input.java        # Gerencia entrada do usuário
│   │   ├── Output.java       # Gerencia saída no console
│   ├── tictactoe/util/       # Utilitários gerais
│   │   ├── ValidationUtil.java  # Validação de entrada
│── README.md                 # Documentação do projeto
```

## 🚀 Como Executar
1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/jogo-da-velha-java.git
   ```
2. **Compile o projeto:**
   ```sh
   javac -d bin src/tictactoe/core/*.java src/tictactoe/io/*.java src/tictactoe/util/*.java
   ```
3. **Execute o jogo:**
   ```sh
   java -cp bin tictactoe.core.Game
   ```

## 🎮 Como Jogar
- O jogo pedirá coordenadas no formato `linha,coluna` (exemplo: `0,0` para marcar a célula superior esquerda).
- O jogador `X` começa jogando, e os jogadores se alternam a cada rodada.
- O jogo termina quando um jogador vencer ou todas as posições forem preenchidas.

## 🛠 Possíveis Melhorias
- Implementação de uma interface gráfica.
- Adição de uma IA para jogar contra o computador.
- Melhorias na detecção de erros e mensagens de feedback.

## 📜 Licença
Este projeto é de código aberto e pode ser modificado conforme necessário.

