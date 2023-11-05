<div style="border: 0px solid #00f; padding: 10px; display: flex; justify-content: center;">
    <div style="box-shadow: 3px 3px 5px #888; display: flex; align-items: center; text-align: center; font-family: 'Verdana', sans-serif;">        
        <h1 style="margin: 0; text-shadow: 2px 2px 3px #888;">Formação Java Developer</h1>
    </div>
</div>

<br>
<div style="border: 0px solid #00f; padding: 10px; display: flex; align-items: center; justify-content: center; text-align: center; font-family: 'Lato', sans-serif;">
    <h2 style="margin: 0; text-shadow: 2px 2px 3px #888; font-family: 'Helvetica', sans-serif; text-decoration: none;">Desafio de Projeto: Controle de Fluxo</h2>
</div>


<div style="border: 0px solid #00f; padding: 10px; display: flex; align-items: center; justify-content: center; text-align: center;">
    <div style="display: flex; align-items: center; justify-content: center;">
               <h4 style="margin: 0; text-shadow: 2px 2px 3px #888; font-family: 'Raleway', sans-serif;">I ❤️ Front-End Development!</h4>
    </div>
</div>


### Encontre-me :handshake:

<p align="center">
    <a href="https://www.linkedin.com/in/renatomoreira-rm/" target="_blank">
        <img alt="LinkedIn" src="https://img.shields.io/badge/LinkedIn-0077B5?style=plastic&logo=linkedin&logoColor=white">
    </a>
    <a href="https://github.com/RenatoMor" target="_blank">
        <img alt="GitHub" src="https://img.shields.io/badge/GitHub-181717?style=plastic&logo=github&logoColor=white">
    </a>
    <a href="https://discord.com/channels/@me/1123380010779152444/" target="_blank">
        <img alt="Discord" src="https://img.shields.io/badge/Discord-5865F2?style=plastic&logo=discord&logoColor=white">
    </a>
</a>
    <a href="https://kovihq.slack.com/" target="_blank">
        <img alt="Slack" src="https://img.shields.io/badge/Slack-4A154B?style=plastic&logo=slack&logoColor=white">
    </a>
    <a href="https://www.instagram.com/renatomorspider/" target="_blank">
        <img alt="Instagram" src="https://img.shields.io/badge/Instagram-E4405F?style=plastic&logo=instagram&logoColor=white">
    </a>
    <a href="mailto:piano.tato@gmail.com" target="_blank">
        <img alt="Gmail" src="https://img.shields.io/badge/Gmail-EA4335?style=plastic&logo=gmail&logoColor=white">
    </a>
</p>
</p>
<br>

---

### Menu

- [Encontre-me :handshake:](#encontre-me-handshake)
- [Menu](#menu)
- [Descrição do Projeto :scroll:](#descrição-do-projeto-scroll)
- [Instruções de Uso :writing\_hand:](#instruções-de-uso-writing_hand)
- [Pré-requisitos :hammer\_and\_wrench:](#pré-requisitos-hammer_and_wrench)
- [Contribuições :sparkles:](#contribuições-sparkles)
- [Autor :footprints:](#autor-footprints)
- [Licença :traffic\_light:](#licença-traffic_light)
- [Agradecimentos :tada:](#agradecimentos-tada)

---

###  Descrição do Projeto :scroll:
Este projeto é parte da Formação Java Developer da DIO e é um exemplo de controle de fluxo em Java. Ele inclui duas classes principais: Contador e ParametrosInvalidosException. A classe Contador permite ao usuário inserir dois parâmetros e, em seguida, exibe uma contagem de números entre esses parâmetros. A classe ParametrosInvalidosException é uma exceção personalizada usada para lidar com a situação em que o segundo parâmetro é menor ou igual ao primeiro.

---

### Instruções de Uso :writing_hand:

1. Abra o projeto na sua IDE IntelliJ IDEA 2023.2.2 (Ultimate Edition).
Certifique-se de que o SDK Java correto está configurado no projeto.

2. Execute a classe Contador a partir da IDE.
O programa solicitará que você insira dois parâmetros (números inteiros). Certifique-se de que o segundo parâmetro seja maior que o primeiro.

3. A aplicação exibirá a contagem dos números a partir do primeiro parâmetro até o segundo.

4. Se o segundo parâmetro não for maior que o primeiro, uma exceção ParametrosInvalidosException será lançada e a aplicação exibirá uma mensagem de erro.

**O projeto possui a seguinte estrutura de classes:**

Contador: A classe principal que contém o método main para executar o programa. Ela permite ao usuário inserir os parâmetros e exibe a contagem.

ParametrosInvalidosException: Uma exceção personalizada que é lançada quando os parâmetros são inválidos (quando o segundo parâmetro não é maior que o primeiro). 



```Java
import java.util.Scanner;

public class Contador {
// Metodo main------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
// inputs------------------------------------------------------------------------------
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();
// try exception-----------------------------------------------------------------------
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("ATENÇÃO! O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO.");
        }
    }
// Metodo contar-----------------------------------------------------------------------
    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
// Condições do metodo-----------------------------------------------------------------
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        for (int i = parametroUm; i <= parametroDois; i++) {
        System.out.println("Imprimindo o número " + i);
        }
    }
}

```

---

### Pré-requisitos :hammer_and_wrench:
Você deve ter o IntelliJ IDEA 2023.2.2 (Ultimate Edition) instalado na sua máquina.


Certifique-se de que o SDK Java esteja configurado corretamente no projeto.

---

### Contribuições :sparkles:
Contribuições para melhorar este projeto são bem-vindas. Se você encontrar algum problema ou desejar adicionar recursos adicionais, sinta-se à vontade para criar um fork do projeto, fazer suas alterações e enviar um pull request.

---

### Autor :footprints:
Este projeto foi desenvolvido por Renato Moreira como parte da Formação Java Developer da DIO.
<br>
Copyright © 2023 / RenatoMor

---

### Licença :traffic_light:
Este projeto está licenciado sob a Licença consulte o arquivo 
 [MIT](https://opensource.org/licenses/MIT).

---

### Agradecimentos :tada:
Digital Innovation One: Pela oportunidade de aprendizado e formação em Java.

JetBrains: Pela excelente IDE IntelliJ IDEA.

