/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelMotocicletas;

/**
 *
 * @author cmarl
 */
public class DaoMotocicletas extends ConexaoMySql {

    public int salvarMotocicletasDAO(ModelMotocicletas pModelMotocicletas) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_motocicleta ("
                    + "moto_modelo,"
                    + "moto_valor,"
                    + "moto_estoque"
                    + ") VALUE ("
                    + "'" + pModelMotocicletas.getMotoModelo() + "',"
                    + "'" + pModelMotocicletas.getMotoValor() + "',"
                    + "'" + pModelMotocicletas.getMotoEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirMotocicletaDAO(int pIdMotocicleta) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_motocicleta WHERE pk_id_motocicleta = '" + pIdMotocicleta + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarMotocicletaDAO(ModelMotocicletas pModelMotocicletas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_motocicleta SET "
                    + "moto_modelo = '" + pModelMotocicletas.getMotoModelo() + "',"
                    + "moto_valor = '" + pModelMotocicletas.getMotoValor() + "',"
                    + "moto_estoque = '" + pModelMotocicletas.getMotoEstoque() + "'"
                    + " WHERE pk_id_motocicleta = '" + pModelMotocicletas.getIdMotocicleta() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelMotocicletas retornarMotocicletaDAO(int pIdMotocicleta) {
        ModelMotocicletas modelMotocicletas = new ModelMotocicletas();
        
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_motocicleta, "
                    + "moto_modelo, "
                    + "moto_valor, "
                    + "moto_estoque "
                    + "FROM tbl_motocicleta WHERE pk_id_motocicleta = '"+ pIdMotocicleta +"';");
            
            while (this.getResultSet().next()) {
                modelMotocicletas.setIdMotocicleta(this.getResultSet().getInt(1));
                modelMotocicletas.setMotoModelo(this.getResultSet().getString(2));
                modelMotocicletas.setMotoValor(this.getResultSet().getDouble(3));
                modelMotocicletas.setMotoEstoque(this.getResultSet().getInt(4));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelMotocicletas;
    }
    
    public ArrayList<ModelMotocicletas> retornarListaProdutosDAO() {
        ArrayList<ModelMotocicletas> listaModelMotocicletas = new ArrayList<>();
        ModelMotocicletas modelMotocicletas = new ModelMotocicletas();
        
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_motocicleta, "
                    + "moto_modelo, "
                    + "moto_valor, "
                    + "moto_estoque "
                    + "FROM tbl_motocicleta;");
            
            while (this.getResultSet().next()) {
                modelMotocicletas = new ModelMotocicletas();
                modelMotocicletas.setIdMotocicleta(this.getResultSet().getInt(1));
                modelMotocicletas.setMotoModelo(this.getResultSet().getString(2));
                modelMotocicletas.setMotoValor(this.getResultSet().getDouble(3));
                modelMotocicletas.setMotoEstoque(this.getResultSet().getInt(4));
                listaModelMotocicletas.add(modelMotocicletas);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return listaModelMotocicletas;
    }

    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelMotocicletas> pListaModelMotocicletas) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelMotocicletas.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_motocicleta SET "
                        + "moto_estoque = '" + pListaModelMotocicletas.get(i).getMotoEstoque() + "'"
                        + " WHERE pk_id_motocicleta = '" + pListaModelMotocicletas.get(i).getIdMotocicleta() + "'"
                );    
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
