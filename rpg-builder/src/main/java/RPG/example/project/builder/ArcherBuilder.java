package RPG.example.project.builder;

public class ArcherBuilder extends PersonagemBuilder {
    @Override
    public void buildAtributos() {
        this.forca = 50;
        this.defesa = 40;
        this.inteligencia = 60;
        this.agilidade = 80;
    }
}
