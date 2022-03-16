/*
Created by: Rihards Dzerkals, group 1.
Tests for Invoice
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class InvoiceTestSuite {

    @Test
    public void InvoiceTest(){

        Invoice invoice1 = new Invoice("G52314", "Gaming mouse", 5, 150);
        Invoice invoice2 = new Invoice("G52331", "headset", 2, 100);
        Invoice invoice3 = new Invoice("G5241", "keyboard", 10, 1);
        Invoice invoice4 = new Invoice("G1337", "monitor", 2, 1241);
        Invoice invoice5 = new Invoice("G13371337", "monitorTwo", -52, -1241);


        assertThat(invoice1.getInvoiceAmount(), is(750));
        assertThat(invoice2.getInvoiceAmount(), is(200));
        assertThat(invoice3.getInvoiceAmount(), is(10));
        assertThat(invoice4.getInvoiceAmount(), is(2482));
        assertThat(invoice5.getPrice(), is(0));
        assertThat(invoice5.getQuantity(), is(0));

        invoice1.setPrice(-50);
        invoice2.setQuantity(-3);
        invoice3.setPartNumber("G1123");
        invoice4.setDescription("isThisWorking?");

        assertThat(invoice1.getPrice(), is(0));
        assertThat(invoice2.getInvoiceAmount(), is(0));
        assertThat(invoice3.getPartNumber(), is("G1123"));
        assertThat(invoice4.getDescription(), is("isThisWorking?"));




    }
}
