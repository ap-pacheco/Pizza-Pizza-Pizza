public class Ingrediente {
    private String nome;
    private int caloriasPorPorção;
    private double precoPorPorção;
    private double quantidadePorPorção;
    
    void setNome(String nome){
        this.nome = nome;
    }
       
    void setPrecoPorPorção(double preco){
        precoPorPorção = preco;
    }
       
    void setCaloriasPorPorção(int caloria){
        caloriasPorPorção = caloria;
    }
    
    void setQuantidadePorPorção(double quantidade){
        quantidadePorPorção = quantidade;
    }
    
    String getNome(){
        return nome;
    }

}
