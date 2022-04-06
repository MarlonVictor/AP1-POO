package DAO;

import model.ModelVendasMoto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author cmarl
*/
public class DAOVendasMoto extends ConexaoMySql {

    /**
    * grava VendasMoto
    * @param pModelVendasMoto
    * @return int
    */
    public int salvarVendasMotoDAO(ModelVendasMoto pModelVendasMoto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas_moto ("
                    + "fk_motocicleta,"
                    + "fk_vendas,"
                    + "ven_moto_valor,"
                    + "ven_moto_quantidade"
                + ") VALUES ("
                    + "'" + pModelVendasMoto.getMotocicleta() + "',"
                    + "'" + pModelVendasMoto.getVendas() + "',"
                    + "'" + pModelVendasMoto.getVenMotoValor() + "',"
                    + "'" + pModelVendasMoto.getVenMotoQuantidade() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasMoto
    * @param pIdVendaMoto
    * @return ModelVendasMoto
    */
    public ModelVendasMoto getVendasMotoDAO(int pIdVendaMoto){
        ModelVendasMoto modelVendasMoto = new ModelVendasMoto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_moto,"
                    + "fk_motocicleta,"
                    + "fk_vendas,"
                    + "ven_moto_valor,"
                    + "ven_moto_quantidade"
                 + " FROM"
                     + " tbl_vendas_moto"
                 + " WHERE"
                     + " pk_id_venda_moto = '" + pIdVendaMoto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasMoto.setIdVendaMoto(this.getResultSet().getInt(1));
                modelVendasMoto.setMotocicleta(this.getResultSet().getInt(2));
                modelVendasMoto.setVendas(this.getResultSet().getInt(3));
                modelVendasMoto.setVenMotoValor(this.getResultSet().getDouble(4));
                modelVendasMoto.setVenMotoQuantidade(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasMoto;
    }

    /**
    * recupera uma lista de VendasMoto
        * @return ArrayList
    */
    public ArrayList<ModelVendasMoto> getListaVendasMotoDAO(){
        ArrayList<ModelVendasMoto> listamodelVendasMoto = new ArrayList();
        ModelVendasMoto modelVendasMoto = new ModelVendasMoto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_moto,"
                    + "fk_motocicleta,"
                    + "fk_vendas,"
                    + "ven_moto_valor,"
                    + "ven_moto_quantidade"
                 + " FROM"
                     + " tbl_vendas_moto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasMoto = new ModelVendasMoto();
                modelVendasMoto.setIdVendaMoto(this.getResultSet().getInt(1));
                modelVendasMoto.setMotocicleta(this.getResultSet().getInt(2));
                modelVendasMoto.setVendas(this.getResultSet().getInt(3));
                modelVendasMoto.setVenMotoValor(this.getResultSet().getDouble(4));
                modelVendasMoto.setVenMotoQuantidade(this.getResultSet().getInt(5));
                listamodelVendasMoto.add(modelVendasMoto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasMoto;
    }

    /**
    * atualiza VendasMoto
    * @param pModelVendasMoto
    * @return boolean
    */
    public boolean atualizarVendasMotoDAO(ModelVendasMoto pModelVendasMoto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas_moto SET "
                    + "pk_id_venda_moto = '" + pModelVendasMoto.getIdVendaMoto() + "',"
                    + "fk_motocicleta = '" + pModelVendasMoto.getMotocicleta() + "',"
                    + "fk_vendas = '" + pModelVendasMoto.getVendas() + "',"
                    + "ven_moto_valor = '" + pModelVendasMoto.getVenMotoValor() + "',"
                    + "ven_moto_quantidade = '" + pModelVendasMoto.getVenMotoQuantidade() + "'"
                + " WHERE "
                    + "pk_id_venda_moto = '" + pModelVendasMoto.getIdVendaMoto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasMoto
    * @param pIdVendaMoto
    * @return boolean
    */
    public boolean excluirVendasMotoDAO(int pIdVendaMoto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_moto "
                + " WHERE "
                    + "pk_id_venda_moto = '" + pIdVendaMoto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendasMotoDAO(ArrayList<ModelVendasMoto> pListaModelVendasMoto) {
        try {
            this.conectar();
            int cont = pListaModelVendasMoto.size();
            
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                    "INSERT INTO tbl_vendas_moto ("
                        + "fk_motocicleta,"
                        + "fk_vendas,"
                        + "ven_moto_valor,"
                        + "ven_moto_quantidade"
                    + ") VALUES ("
                        + "'" + pListaModelVendasMoto.get(i).getMotocicleta()+ "',"
                        + "'" + pListaModelVendasMoto.get(i).getVendas() + "',"
                        + "'" + pListaModelVendasMoto.get(i).getVenMotoValor() + "',"
                        + "'" + pListaModelVendasMoto.get(i).getVenMotoQuantidade() + "'"
                    + ");"
                );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}