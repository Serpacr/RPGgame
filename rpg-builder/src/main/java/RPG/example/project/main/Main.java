package RPG.example.project.main;

import RPG.example.project.builder.*;
import RPG.example.project.model.Personagem;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;

        System.out.println("🌟 Bem-vindo ao universo de Eldoria, jovem aventureiro!");
        System.out.println("Aqui, você forjará sua própria lenda...");

        do {
            System.out.println("\n🧙 Escolha seu caminho entre as classes lendárias:");
            System.out.println("  1. ⚔️ Guerreiro - Força e coragem em combate corpo a corpo");
            System.out.println("  2. 🛡️ Tank - Defesa impenetrável e resistência descomunal");
            System.out.println("  3. 🔮 Mago - Inteligência mística e controle dos elementos");
            System.out.println("  4. 🏹 Arqueiro - Precisão e agilidade nas sombras");
            System.out.print("\nDigite o número da classe desejada: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // limpar quebra de linha

            PersonagemBuilder builder = switch (escolha) {
                case 1 -> new GuerreiroBuilder();
                case 2 -> new TankBuilder();
                case 3 -> new MageBuilder();
                case 4 -> new ArcherBuilder();
                default -> {
                    System.out.println("🤔 Hmm... escolha desconhecida. Vamos com Guerreiro por padrão.");
                    yield new GuerreiroBuilder();
                }
            };

            System.out.println("\n📝 Antes de partirmos, diga-nos quem é você.");

            System.out.print("👉 Qual será o nome do seu herói? ");
            String nome = scanner.nextLine();

            System.out.print("⚧️ E qual o sexo do personagem? ");
            String sexo = scanner.nextLine();

            System.out.println("\n🛠️ Agora distribua seus atributos. Escolha sabiamente (0 a 100):");

            int forca = lerAtributo(scanner, "Força 💪");
            int defesa = lerAtributo(scanner, "Defesa 🛡️");
            int inteligencia = lerAtributo(scanner, "Inteligência 🧠");
            int agilidade = lerAtributo(scanner, "Agilidade 🏃");

            Personagem jogador = builder
                    .setNome(nome)
                    .setSexo(sexo)
                    .setForca(forca)
                    .setDefesa(defesa)
                    .setInteligencia(inteligencia)
                    .setAgilidade(agilidade)
                    .build();

            System.out.println("\n✨ Seu personagem está pronto para a batalha!");
            System.out.println(jogador);

            Personagem boss = gerarBoss();

            double poderJogador = calcularPoder(jogador);
            double poderBoss = calcularPoder(boss);

            System.out.println("\n⚔️ Um Boss misterioso aparece das sombras...");
            System.out.println("🔥 Você sente a energia dele... mas não sabe o quão forte ele realmente é.");
            System.out.println("🔮 Seu poder total foi calculado com base em sua preparação...");

            if (poderJogador > poderBoss) {
                System.out.println("\n💥 Você se move com precisão e golpeia o Boss com maestria!");
                System.out.println("🏆 Vitória! Seu nome será lembrado nas tavernas de Eldoria.");
            } else if (poderJogador < poderBoss) {
                System.out.println("\n😖 O Boss libera um poder avassalador...");
                System.out.println("💀 Você caiu, mas sua história inspirará outros guerreiros.");
            } else {
                System.out.println("\n⚖️ Um duelo equilibrado... ambos exaustos, sem um vencedor claro.");
                System.out.println("🤝 Um respeito mútuo é formado entre herói e Boss.");
            }

            System.out.println("\n📜 A verdadeira força do Boss era:");
            System.out.println(boss);
            System.out.printf("⚡ Poder total do Boss: %.2f%n", poderBoss);
            System.out.printf("🧠 Seu poder total: %.2f%n", poderJogador);

            System.out.print("\n🔁 Deseja tentar novamente e forjar outra lenda? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            continuar = resposta.equals("s") || resposta.equals("sim");

        } while (continuar);

        System.out.println("\n🎉 Obrigado por jogar! Que sua lenda continue além dos códigos!");
    }

    private static int lerAtributo(Scanner scanner, String nomeAtributo) {
        int valor;
        do {
            System.out.print("   ➤ " + nomeAtributo + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("     ❌ Isso não é um número válido. Tente novamente.");
                scanner.next();
                System.out.print("   ➤ " + nomeAtributo + ": ");
            }
            valor = scanner.nextInt();
            if (valor < 0 || valor > 100) {
                System.out.println("     ❌ O valor deve estar entre 0 e 100.");
            }
        } while (valor < 0 || valor > 100);
        scanner.nextLine(); // limpar quebra de linha
        return valor;
    }

    private static Personagem gerarBoss() {
        Random rand = new Random();
        return new Personagem(
                "Boss Sombrio",
                "Desconhecido",
                rand.nextInt(101),
                rand.nextInt(101),
                rand.nextInt(101),
                rand.nextInt(101)
        );
    }

    private static double calcularPoder(Personagem p) {
        return (p.forca() + p.defesa() + p.inteligencia() + p.agilidade()) / 4.0;
    }
}


