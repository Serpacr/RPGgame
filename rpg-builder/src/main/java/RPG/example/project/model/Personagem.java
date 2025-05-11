package RPG.example.project.model;

public class Personagem {
    private final String nome;
    private final String sexo;
    private final int forca;
    private final int defesa;
    private final int inteligencia;
    private final int agilidade;

    public Personagem(String nome, String sexo, int forca, int defesa, int inteligencia, int agilidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.forca = forca;
        this.defesa = defesa;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
    }

    // Getters para cálculo do poder
    public int forca() {
        return forca;
    }

    public int defesa() {
        return defesa;
    }

    public int inteligencia() {
        return inteligencia;
    }

    public int agilidade() {
        return agilidade;
    }

    @Override
    public String toString() {
        return "\n🎭 Personagem Criado:\n" +
                "📛 Nome: " + nome + "\n" +
                "⚧️ Sexo: " + sexo + "\n" +
                "💪 Força: " + forca + "\n" +
                "🛡️ Defesa: " + defesa + "\n" +
                "🧠 Inteligência: " + inteligencia + "\n" +
                "🏃 Agilidade: " + agilidade;
    }
}
