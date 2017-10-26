package calculadorat.negocio;

public class Calculadora {
    private String digito;
    private double resultado;
    private boolean soma;
    private boolean divisao;
    private boolean multipicacao;
    private boolean subtracao;

    public Calculadora() {
        this.digito = "";
        this.resultado = 0;
        this.soma = false;
        this.divisao = false;
        this.multipicacao = false;
        this.subtracao = false;
    }

    public String getDigito() { //contem o digito
        return digito;
    }

    public void setDigito(String digito) { //coloca digito
        this.digito = digito;
    }
    
    //Métodos e Funções
    
    public void concatNum (int num) { //faz a concatenação dos digitos
        setDigito(digito+num);
    }
    
    public void soma (String num){
        this.resultado = Double.parseDouble(num);
        this.soma = true;
        setDigito(""); 
    }
    
    public void subtracao (String num){
        this.resultado = Double.parseDouble(num);
        this.subtracao = true;
        setDigito(""); 
    }
    
    public void multiplicacao (String num){
        this.resultado = Double.parseDouble(num);
        this.multipicacao = true;
        setDigito(""); 
    }
    
    public void divisao (String num){
        this.resultado = Double.parseDouble(num);
        this.divisao = true;
        setDigito(""); 
    }
    
    public double calculo(String numero){
        if(soma == true){
            resultado += Double.parseDouble(numero);
        }
         if(subtracao == true){
            resultado -= Double.parseDouble(numero);
        }
          if(multipicacao == true){
            resultado *= Double.parseDouble(numero);
        }
           if(divisao == true){
            resultado /= Double.parseDouble(numero);
        }
           
        //Resetar Valores
        soma = false; subtracao = false; divisao = false; multipicacao = false;
        
        return resultado;
    }
}
