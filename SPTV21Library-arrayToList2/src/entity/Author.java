

package entity;

import java.io.Serializable;
import java.util.Date;


public class Author implements Serializable{
    private int summa; 
    private Product product;
    private Reader reader;
    private Date takeOnProduct;
    private Date returnProduct;
    public Author() {
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Reader getClient() {
        return reader;
    }

    public void setClient(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOnProduct() {
        return takeOnProduct;
    }

    public void setTakeOnProduct(Date takeOnProduct) {
        this.takeOnProduct = takeOnProduct;
    }

    public Date getReturnProduct() {
        return returnProduct;
    }

    public void setReturnProduct(Date returnProduct) {
        this.returnProduct = returnProduct;
    }

    @Override
    public String toString() {
        return "Author{" + "summa=" + summa + ", product=" + product + ", reader=" + reader + ", takeOnProduct=" + takeOnProduct + ", returnProduct=" + returnProduct + '}';
    }


}
