package RPG.example.project.builder;

public class TankBuilder extends PersonagemBuilder {
    @Override
    public void buildAtributos() {
        this.forca = 60;
        this.defesa = 90;
        this.inteligencia = 20;
        this.agilidade = 30;
    }
}
