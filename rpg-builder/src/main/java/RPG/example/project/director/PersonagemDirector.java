package RPG.example.project.director;

import RPG.example.project.builder.PersonagemBuilder;
import RPG.example.project.model.Personagem;

public class PersonagemDirector {
    private PersonagemBuilder builder;

    public void setBuilder(PersonagemBuilder builder) {
        this.builder = builder;
    }

    public Personagem construirPersonagem(String nome) {
        builder.setNome(nome);
        builder.buildAtributos();
        return builder.build();
    }
}