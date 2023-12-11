package repositories;
import java.util.ArrayList;
import java.util.List;
import contracts.iAlunoRepository;
import models.Aluno;

public class ArrayListAlunoRepository implements iAlunoRepository {
  private List<Aluno> alunos;

  public ArrayListAlunoRepository() {
    this.alunos = new ArrayList<>();
  }

  @Override
  public void adicionar(Aluno aluno) {
    alunos.add(aluno);
  }

  @Override
  public void remover(Aluno aluno) {
    alunos.remove(aluno);
  }

  @Override
  public Aluno buscar(String nome) {
    for (Aluno aluno : alunos) {
      if (aluno.getNome().equals(nome)) {
        return aluno;
      }
    }
    return null;
  }

  @Override
  public List<Aluno> listar() {
    return alunos;
  }
}