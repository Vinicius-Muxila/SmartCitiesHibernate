package br.com.fiap.smartcities.test;


public class BancoTeste {

 
    public static void main(String[] args) {
    	Estabelecimento estabelecimento = new Estabelecimento();
    	estabelecimento.setId("1");
    	estabelecimento.setNome("Mercado");
    	estabelecimento.setDataCriacao("11/10/1995");
    	

         Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();

    }
  

}

