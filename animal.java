package provapoo;

public class Animal {

   private int id_animal;
   private String nome;
   private String especie;
   private String raca;
   private String porte;
   private int peso;
   private String pelagem;
   private int ano_Nascimento;
   public int anoatual = 2022;

  
   public Animal(int id_animal, String nome,String especie, String raca, String porte, int peso,String pelagem,int ano_Nascimento){
       this.nome = nome;
       this.id_animal = id_animal;
       this.especie = especie;
       this.raca = raca;
       this.porte = porte;
       this.peso = peso;
       this.pelagem = pelagem;
       this.ano_Nascimento = ano_Nascimento;
   }
   
   
   public String mostraraca(){
    return "a raca e : " +  raca;
   }
   
   public int mostraidade(){
       return anoatual - ano_Nascimento;
    }
}
