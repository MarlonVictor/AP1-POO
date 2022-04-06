package model;
/**
*
* @author cmarl
*/
public class ModelVendasMoto {

    private int idVendaMoto;
    private int motocicleta;
    private int vendas;
    private double venMotoValor;
    private int venMotoQuantidade;

    /**
    * Construtor
    */
    public ModelVendasMoto(){}

    /**
    * seta o valor de idVendaMoto
    * @param pIdVendaMoto
    */
    public void setIdVendaMoto(int pIdVendaMoto){
        this.idVendaMoto = pIdVendaMoto;
    }
    /**
    * @return pk_idVendaMoto
    */
    public int getIdVendaMoto(){
        return this.idVendaMoto;
    }

    /**
    * seta o valor de motocicleta
    * @param pMotocicleta
    */
    public void setMotocicleta(int pMotocicleta){
        this.motocicleta = pMotocicleta;
    }
    /**
    * @return fk_motocicleta
    */
    public int getMotocicleta(){
        return this.motocicleta;
    }

    /**
    * seta o valor de vendas
    * @param pVendas
    */
    public void setVendas(int pVendas){
        this.vendas = pVendas;
    }
    /**
    * @return fk_vendas
    */
    public int getVendas(){
        return this.vendas;
    }

    /**
    * seta o valor de venMotoValor
    * @param pVenMotoValor
    */
    public void setVenMotoValor(double pVenMotoValor){
        this.venMotoValor = pVenMotoValor;
    }
    /**
    * @return venMotoValor
    */
    public double getVenMotoValor(){
        return this.venMotoValor;
    }

    /**
    * seta o valor de venMotoQuantidade
    * @param pVenMotoQuantidade
    */
    public void setVenMotoQuantidade(int pVenMotoQuantidade){
        this.venMotoQuantidade = pVenMotoQuantidade;
    }
    /**
    * @return venMotoQuantidade
    */
    public int getVenMotoQuantidade(){
        return this.venMotoQuantidade;
    }

    @Override
    public String toString(){
        return "ModelVendasMoto {" + "::idVendaMoto = " + this.idVendaMoto + "::motocicleta = " + this.motocicleta + "::vendas = " + this.vendas + "::venMotoValor = " + this.venMotoValor + "::venMotoQuantidade = " + this.venMotoQuantidade +  "}";
    }
}