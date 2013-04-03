/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author
 */
public abstract class PaymentMeans {

    private static int cont = 0;
    private int meansID;
    protected int typeID;
    protected String description;

    public PaymentMeans() {
        meansID = ++cont;
    }

    public int getMeansID() {
        return meansID;
    }

    public int getTypeID() {
        return typeID;
    }

    public String getDescription() {
        return description;
    }
}
