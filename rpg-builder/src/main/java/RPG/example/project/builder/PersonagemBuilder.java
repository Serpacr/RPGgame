package RPG.example.project.builder;

import RPG.example.project.model.Personagem;

public abstract class PersonagemBuilder implements IPersonagemBuilder {
    protected String nome;
    protected String sexo;
    public int forca;
    public int defesa;
    public int inteligencia;
    public int agilidade;

    @Override
    public PersonagemBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PersonagemBuilder setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    @Override
    public PersonagemBuilder setForca(int forca) {
        this.forca = forca;
        return this;
    }

    @Override
    public PersonagemBuilder setDefesa(int defesa) {
        this.defesa = defesa;
        return this;
    }

    @Override
    public PersonagemBuilder setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    @Override
    public PersonagemBuilder setAgilidade(int agilidade) {
        this.agilidade = agilidade;
        return this;
    }

    @Override
    public abstract void buildAtributos();

    @Override
    public Personagem build() {
        return new Personagem(nome, sexo, forca, defesa, inteligencia, agilidade);
    }
}
