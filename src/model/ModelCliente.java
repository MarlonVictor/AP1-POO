package model;
/**
*
* @author cmarl
*/
public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliCEP;
    private String cliUF;
    private String cliTelefone;


    public ModelCliente(){}


    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }

    public int getIdCliente(){
        return this.idCliente;
    }


    public void setCliNome(String pCliNome){
        this.cliNome = pCliNome;
    }

    public String getCliNome(){
        return this.cliNome;
    }


    public void setCliCEP(String pCliCEP){
        this.cliCEP = pCliCEP;
    }

    public String getCliCEP(){
        return this.cliCEP;
    }


    public void setCliUF(String pCliUF){
        this.cliUF = pCliUF;
    }

    public String getCliUF(){
        return this.cliUF;
    }


    public void setCliTelefone(String pCliTelefone){
        this.cliTelefone = pCliTelefone;
    }

    public String getCliTelefone(){
        return this.cliTelefone;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliCEP = " + this.cliCEP + "::cliUF = " + this.cliUF + "::cliTelefone = " + this.cliTelefone +  "}";
    }
}