package Control;
import Dao.DaoFactory;
import Modelo.Aluno;
import java.util.List;

public class AlunoControle {
    public Aluno salvar(String nome,  Integer cidade_id){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.getCidade().setId(cidade_id);
        
        aluno.setId(DaoFactory.getAlunoDao().salvar(aluno));
        
        return aluno;
    }
    
    public void atualizar(Aluno aluno){
       DaoFactory.getAlunoDao().atualizar(aluno);          
    }
    
    public List<Aluno> listar(){
         return DaoFactory.getAlunoDao().listar();
    }
    
    public void excluir(Integer id){
        DaoFactory.getAlunoDao().excluir(id);
    }
}
