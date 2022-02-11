package entities;

public class Student {
    public String name;
    public int nota1;
    public int nota2;
    public int nota3;
    private int fgrade;

    public int finalGrade(){
        fgrade = (nota1 + nota2 + nota3) / 3;
        return fgrade;
    }
    public void passOrOver(){

        if(fgrade > 60){
            System.out.println("Aprovado! Meus parabéns...");
        } else{
            System.out.printf("Reprovado! Você perdeu por %d ponto(s).  ", 60 - fgrade);
            System.out.println();

        }
    }
    public String toString(){
        return name
        + ", você conseguiu "
        + finalGrade()
        + " pontos.";
    }
}
