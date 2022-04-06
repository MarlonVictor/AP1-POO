package controller;

import model.ModelVendasMoto;
import DAO.DAOVendasMoto;
import java.util.ArrayList;

/**
*
* @author cmarl
*/
public class ControllerVendasMoto {

    private DAOVendasMoto daoVendasMoto = new DAOVendasMoto();

    /**
    * grava VendasMoto
    * @param pModelVendasMoto
    * @return int
    */
    public boolean salvarVendasMotoController(ArrayList<ModelVendasMoto> pListaModelVendasMoto){
        return this.daoVendasMoto.salvarVendasMotoDAO(pListaModelVendasMoto);
    }

    /**
    * recupera VendasMoto
    * @param pIdVendaMoto
    * @return ModelVendasMoto
    */
    public ModelVendasMoto getVendasMotoController(int pIdVendaMoto){
        return this.daoVendasMoto.getVendasMotoDAO(pIdVendaMoto);
    }

    /**
    * recupera uma lista deVendasMoto
    * @param pIdVendaMoto
    * @return ArrayList
    */
    public ArrayList<ModelVendasMoto> getListaVendasMotoController(){
        return this.daoVendasMoto.getListaVendasMotoDAO();
    }

    /**
    * atualiza VendasMoto
    * @param pModelVendasMoto
    * @return boolean
    */
    public boolean atualizarVendasMotoController(ModelVendasMoto pModelVendasMoto){
        return this.daoVendasMoto.atualizarVendasMotoDAO(pModelVendasMoto);
    }

    /**
    * exclui VendasMoto
    * @param pIdVendaMoto
    * @return boolean
    */
    public boolean excluirVendasMotoController(int pIdVendaMoto){
        return this.daoVendasMoto.excluirVendasMotoDAO(pIdVendaMoto);
    }
}