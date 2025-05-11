package RPG.example.project.builder;

import RPG.example.project.model.Personagem;

public interface IPersonagemBuilder {
    IPersonagemBuilder setNome(String nome);
    IPersonagemBuilder setSexo(String sexo);
    IPersonagemBuilder setForca(int forca);
    IPersonagemBuilder setDefesa(int defesa);
    IPersonagemBuilder setInteligencia(int inteligencia);
    IPersonagemBuilder setAgilidade(int agilidade);
    void buildAtributos();
    Personagem build();
}
