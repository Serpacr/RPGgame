package RPG.example.project.builder;

public class MageBuilder extends PersonagemBuilder {
    @Override
    public void buildAtributos() {
        this.forca = 20;
        this.defesa = 30;
        this.inteligencia = 90;
        this.agilidade = 50;
    }
}
