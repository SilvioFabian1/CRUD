package models;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;

public class Aluno {
  private String nome;
  private String matricula;

  // Constructor
  public Aluno(String nome, String matricula) throws AlunoNaoEncontradoException, MatriculaInvalidaException {
    if (nome == null || nome.isEmpty()) {
      throw new AlunoNaoEncontradoException("Nome inválido");
    }
    if (matricula == null || matricula.isEmpty()) {
      throw new MatriculaInvalidaException("Matrícula inválida");
    }
    this.nome = nome;
    this.matricula = matricula;
  }

  // Getters
  public String getNome() {
    return this.nome;
  }

  public String getMatricula() {
    return this.matricula;
  }

  // Setters
  public void setNome(String nome) throws AlunoNaoEncontradoException {
    if (nome == null || nome.isEmpty()) {
      throw new AlunoNaoEncontradoException("Nome inválido");
    }
    this.nome = nome;
  }

  public void setMatricula(String matricula) throws MatriculaInvalidaException {
    if (matricula == null || matricula.isEmpty()) {
      throw new MatriculaInvalidaException("Matrícula inválida");
    }
    this.matricula = matricula;
  }
}



