package com.kodilla.hibernate.invoice;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        //Creating objects
        Product product1 = new Product("Pen");
        Product product2 = new Product("Ruler");
        Product product3 = new Product("Bag");
        Item item1 = new Item(new BigDecimal(1.00), 3, new BigDecimal(3.00));
        Item item2 = new Item(new BigDecimal(2.00), 2, new BigDecimal(4.00));
        Item item3 = new Item(new BigDecimal(69.99), 1, new BigDecimal(69.99));
        Invoice invoice1 = new Invoice("213214");

        //Setting objects
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice1);
        int id1 = invoice1.getId();
        int id2 = product1.getId();
        int id3 = product2.getId();
        int id4 = product3.getId();

        //Then
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);
        Assert.assertNotEquals(0, id3);
        Assert.assertNotEquals(0, id4);

        //CleanUp
        invoiceDao.deleteById(id1);
        productDao.deleteById(id2);
        productDao.deleteById(id3);
        productDao.deleteById(id4);
    }
}