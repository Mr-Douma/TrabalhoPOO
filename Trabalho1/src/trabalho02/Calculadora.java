package trabalho02;
import java.lang.Math;
public class Calculadora {
    protected int n1;
    protected int n2;
    protected int n3;
    protected int n4;
    protected int soma;
    protected float media;
    
    
    public int getN1(){
        return this.n1;
    }
    public void setN1(int n1){
        this.n1= n1;
        
    }
    
    public int getN2(){
        return this.n2;
    }
    public void setN2(int n2){
        this.n2= n2;
        
    }
    
    public int getN3(){
        return this.n3;
    }
    public void setN3(int n3){
        this.n3= n3;
        
    }
    public int getN4(){
        return this.n4;
    }
    public void setN4(int n4){
        this.n4= n4;
        
    }
    public int getSoma(){
        return this.soma;
    }
    public void setSoma( int soma){
        this.soma= soma;
    }
    public float getMedia(){
        return this.media;
    }
    public void setMedia(float media){
        this.media= media;
    }
        
    
    
    
    public void operacao(){
        this.soma=this.n1+this.n2+this.n3+ this.n4;
        System.out.println("Soma: " + this.soma);
    }
    public void operacao(int p1, int p2, int p3,int p4){
        this.media= ((this.n1*p1)+(this.n2*p2)+(this.n3*p3)+(this.n4*p4))/(p1+p2+p3+p4);
        System.out.printf("Média ponderada: .2f " , this.media);
    }
    public void operacao(int n , float r){
        
        System.out.println(n + "elevado a " + r + " é igul a " + Math.pow(n,r));
        
        
    }
    
    
}