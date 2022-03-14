package AppAll;


import Modelo.Aluno;
import Visao.AlunoVisao;
import Visao.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    
    public static void main(String args[]) {
        
        AlunoVisao aVisao = new AlunoVisao();
        AlunoVisao alunoVisao = new AlunoVisao();

        List<Aluno> alunos = new ArrayList<>();

        Scanner jIn = new Scanner(System.in);
        Integer opcao = null;
        do {
            Main.menu();
            System.out.println("Digite a opção");
            opcao = Integer.parseInt(jIn.nextLine());

            switch (opcao) {
                case 1:
                    aVisao.salvar();
                    break;
                case 2:
                    aVisao.listar();
                    break;
                case 3:
                    alunoVisao.salvar();
                    break;
                case 4:
                    alunos = alunoVisao.listar();
                    alunoVisao.imprimeAluno(alunos);
                    break;
                case 6:
                    aVisao.excluir();
                    break;
                case 7:
                    aVisao.atualizar();
                    break;
            }

        } while (opcao != 0);
    }    

}