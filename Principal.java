public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        Ingrediente ingrediente = new Ingrediente();
        Pizza p1 = new Pizza();
        
        //Cadastro dos Ingredientes
        System.out.println("Cadastrando Ingredientes");
        ingrediente.setNome("Queijo Mussarela");
        ingrediente.setQuantidadePorPorção(300);
        ingrediente.setCaloriasPorPorção(840);
        ingrediente.setPrecoPorPorção(12);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Igrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Igrediente "+ingrediente.getNome()+ " não cadastrado!!");
            
        ingrediente = new Ingrediente();
        ingrediente.setNome("Tomate");
        ingrediente.setQuantidadePorPorção(100);
        ingrediente.setCaloriasPorPorção(18);
        ingrediente.setPrecoPorPorção(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Igrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Igrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Molho de Tomate");
        ingrediente.setQuantidadePorPorção(50);
        ingrediente.setCaloriasPorPorção(15);
        ingrediente.setPrecoPorPorção(0.4);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Linguiça Calabresa");
        ingrediente.setQuantidadePorPorção(350);
        ingrediente.setCaloriasPorPorção(1050);
        ingrediente.setPrecoPorPorção(7);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Cebola");
        ingrediente.setQuantidadePorPorção(150);
        ingrediente.setCaloriasPorPorção(60);
        ingrediente.setPrecoPorPorção(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        //Alterar Igrediente
        System.out.println("Consultando/Alterando Ingrediente");
        ingrediente = cardapio.consultarIngrediente("Queijo Muçarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Mussarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Mussarela não encontrado!!");
        
        ingrediente.setNome("Queijo Muçarela");
        cardapio.alterarIngrediente(ingrediente);
        ingrediente = cardapio.consultarIngrediente("Queijo Mussarela");
        if(ingrediente==null){
            ingrediente = cardapio.consultarIngrediente("Queijo Muçarela");
            if(ingrediente!=null)
                System.out.println("    Ingrediente alterado para " +ingrediente.getNome()+ " com sucesso!!");
            else
                System.out.println("    Ingrediente Muçarela não encontrado!!");
        }
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não Alterado!!");
        
        
        //Remover Igrediente
        System.out.println("Removendo Ingrediente");
        ingrediente = new Ingrediente();
        ingrediente.setNome("Queijo Branco");
        ingrediente.setQuantidadePorPorção(150);
        ingrediente.setCaloriasPorPorção(60);
        ingrediente.setPrecoPorPorção(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Branco");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Branco não encontrado!!");
        
        cardapio.removeIngrediente(ingrediente);
        if(cardapio.consultarIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não removido!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " removido com sucesso!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Branco");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Branco não encontrado!!");
        
        //Cadastro Das Pizzas
        System.out.println("Cadastrando Pizzas");
        p1.setNome("Mussarela");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Tomate"));
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        p1 = new Pizza();
        p1.setNome("Calabresa");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Cebola"));
        p1.addIgredientes(cardapio.consultarIngrediente("Linguiça Calabresa"));
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        
        //Consultar/Alterar Pizza
        System.out.println("Consultando/Alterando Pizzas");
        p1 = cardapio.consultarPizza("Muçarela");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Muçarela não encontrada!!");
        
        p1 = cardapio.consultarPizza("Mussarela");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        p1.setNome("Muçarela");
        if(cardapio.alterarPizza(p1))
            System.out.println("    Pizza alterado para "+ p1.getNome() +" com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        p1 = cardapio.consultarPizza("Mussarela");
        if(p1 != null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Mussarela não encontrada!!");
        
        p1 = cardapio.consultarPizza("Muçarela");
        if(p1 != null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Muçarela não encontrada!!");
        
        //Consultar/Remover Ingrediente da Pizza
        System.out.println("Consultando/Alterando Ingrediente Pizzas");
        
        p1 = cardapio.consultarPizza("Calabresa");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa não encontrada!!");
        System.out.print("    Ingredientes: ");
        for(Ingrediente ingr : p1.getTodosIgredientes()){
            System.out.print(ingr.getNome()+"; ");
        }
        System.out.println();
        
        ingrediente = p1.consultarIngrediente("Queijo Muçarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        if(p1.removerIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " removido com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        System.out.print("    Ingredientes: ");
        for(Ingrediente ingr : p1.getTodosIgredientes()){
            System.out.print(ingr.getNome()+"; ");
        }
        System.out.println();
        cardapio.alterarPizza(p1);
        if(cardapio.alterarPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" alterado com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        //Remover Pizza
        System.out.println("Removendo Pizza");
        p1 = new Pizza();
        p1.setNome("Calabresa II");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Cebola"));
        p1.addIgredientes(cardapio.consultarIngrediente("Linguiça Calabresa"));
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        p1 = cardapio.consultarPizza("Calabresa II");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa II não encontrada!!");
        
        if(cardapio.removePizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" removida com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não removida com sucesso!!");
        
        p1 = cardapio.consultarPizza("Calabresa II");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa II não encontrada!!");
    }
}
