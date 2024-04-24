package SistemaAluno;

public class Sistema {
    public String Aluno;
    public Double Idade;

    public void Addaluno(int adicionar){
       this.Aluno += adicionar;
    }

    public void Subaluno(int adicionar){
        this.Aluno -= adicionar;
    }

 public String getAluno(){
        return Aluno;
 }

 public void setAluno(String aluno){
        this.Aluno = aluno;
 }

 public double getIdade(){
        return Idade;
 }

 public void setIdade(double idade){
        this.Idade = idade;
 }

    public String verificarIdade(){
        if(this.Idade > 15){
            System.out.println("Com "+Idade+" anos vai para o Ens.medio");
        }else{
            System.out.println("Com"+Idade+" Anos vai para o Ens.Fundamental II");
        }
    }
}


