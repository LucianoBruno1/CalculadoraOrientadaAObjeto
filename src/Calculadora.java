public class Calculadora {

    private int num1;
    private int num2;
    private int decisao;


    Calculadora (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int getNum1(){
        return this.num1;
    }
    void setNum1(int num1){
        this.num1 = num1;
    }


    int getNum2(){
        return this.num2;
    }
    void setNum2(int num2){
        this.num2 = num2;
    }



    int getDecisao(){
        return this.decisao;
    }
    void setDecisao(int decisao){
        this.decisao = decisao;
    }



    int somar(int num1, int num2){

       return num1 += num2;
    }
    int multiplicar(int num1, int num2){
        return num1 *= num2;
    }

    int dividir(int num1, int num2){
        return num1/num2;
    }

    int subtrair(int num1, int num2) {
        return num1-num2;
    }
}
