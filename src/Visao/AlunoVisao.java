package Visao;

import Control.AlunoControle;
import Modelo.Aluno;
import java.util.List;
import java.util.Scanner;

public class AlunoVisao {
    private Scanner jIn;
    private AlunoControle aControle;

    public AlunoVisao() {
        this.jIn = new Scanner(System.in);
        this.aControle = new AlunoControle();
    }

    public Aluno salvar() {
        System.out.println("Digite o nome do aluno:");
        String nome = this.jIn.nextLine();
        System.out.println("Digite o nome da Mae:");
        String mae = this.jIn.nextLine();
        System.out.println("Digite o seu Sexo:");
        String sexo = this.jIn.nextLine();
        System.out.println("Digite a data de Nascimento:");
        String nascimento = this.jIn.nextLine();
        System.out.println("Digite a data de Nascimento:");
        String email = this.jIn.nextLine();
        System.out.println("Coloque sua Escolaridade:");
        String Escolaridade = this.jIn.nextLine();
        System.out.println("Digite os telefones:");
        String telefonespessoa = this.jIn.nextLine();
        System.out.println("Digite oo seu Estado Civil:");
        String estadocivilenum = this.jIn.nextLine();
        System.out.println("Digite o codigo da cidade do aluno:");
        Integer cidade_id = Integer.parseInt(this.jIn.nextLine());
        return this.aControle.salvar(nome, cidade_id);
    }

    public void atualizar() {
        Aluno a = new Aluno();
        System.out.println("Digite o codigo do aluno:");
        a.setId(Integer.parseInt(jIn.nextLine()));
        System.out.println("Digite o novo nome do aluno:");
        a.setNome(jIn.nextLine());
        aControle.atualizar(a);
    }
    
    public List<Aluno> listar(){
         return aControle.listar();
    }
    
    public void imprimeAluno(List<Aluno> alunos) {
        System.out.println("-------- LISTA DE ALUNOS -------- ");
        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getId() + " Nome: " + aluno.getNome() + 
                    " - " + aluno.getNumero() + " - " + aluno.getCidade().getNome() + 
                    " - " + aluno.getCidade().getUf().getNomeEstado());
        }

    }
    
    public void excluir(){
        System.out.println("Digite o codigo do aluno:");
        aControle.excluir(Integer.parseInt(jIn.nextLine()));
    }
}
