/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoMotocicletas;
import java.util.ArrayList;
import model.ModelMotocicletas;

/**
 *
 * @author cmarl
 */
public class ControllerMotocicletas {
    private DaoMotocicletas daoMotocicletas = new DaoMotocicletas();
    
    public int salvarMotocicletaController(ModelMotocicletas pModelMotocicletas) {
        return this.daoMotocicletas.salvarMotocicletasDAO(pModelMotocicletas);
    }
    
    public boolean excluirMotocicletaController(int pIdMotocicleta) {
        return this.daoMotocicletas.excluirMotocicletaDAO(pIdMotocicleta);
    }
    
    public boolean alterarMotocicletaController(ModelMotocicletas pModelMotocicletas) {
        return this.daoMotocicletas.alterarMotocicletaDAO(pModelMotocicletas);
    }
    
    public ModelMotocicletas retornarMotocicletaController(int pIdMotocicleta) {
        return this.daoMotocicletas.retornarMotocicletaDAO(pIdMotocicleta);
    }
    
    public ArrayList<ModelMotocicletas> retornarListaMotocicletaController() {
        return this.daoMotocicletas.retornarListaProdutosDAO();
    }

    public boolean alterarEstoqueMotocicletaController(ArrayList<ModelMotocicletas> plistaModelMotocicletas) {
        return this.daoMotocicletas.alterarEstoqueProdutosDAO(plistaModelMotocicletas);
    }
}
