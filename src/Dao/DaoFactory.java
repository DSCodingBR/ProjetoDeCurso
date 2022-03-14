package Dao;
public class DaoFactory {
    public static AlunoDao getAlunoDao(){
        return new AlunoDao();
    }
}
