package RPG.example.project.builder;

public class GuerreiroBuilder extends PersonagemBuilder {
    @Override
    public void buildAtributos() {
        this.forca = 80;
        this.defesa = 70;
        this.inteligencia = 30;
        this.agilidade = 40;
    }
}
