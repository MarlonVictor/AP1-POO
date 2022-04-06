/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
        

/**
 *
 * @author cmarl
 */
public class ModelMotocicletas {
    private int idMotocicleta;
    private String motoModelo;
    private Double motoValor;
    private int motoEstoque;

    /**
     * @return the idMotocicleta
     */
    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    /**
     * @param idMotocicleta the idMotocicleta to set
     */
    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    /**
     * @return the motoModelo
     */
    public String getMotoModelo() {
        return motoModelo;
    }

    /**
     * @param motoModelo the motoModelo to set
     */
    public void setMotoModelo(String motoModelo) {
        this.motoModelo = motoModelo;
    }

    /**
     * @return the motoValor
     */
    public Double getMotoValor() {
        return motoValor;
    }

    /**
     * @param motoValor the motoValor to set
     */
    public void setMotoValor(Double motoValor) {
        this.motoValor = motoValor;
    }

    /**
     * @return the motoEstoque
     */
    public int getMotoEstoque() {
        return motoEstoque;
    }

    /**
     * @param motoEstoque the motoEstoque to set
     */
    public void setMotoEstoque(int motoEstoque) {
        this.motoEstoque = motoEstoque;
    }
}
