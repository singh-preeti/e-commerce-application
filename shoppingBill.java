Java Program for Shopping Bill
In this section, we will discuss how to create Java programs for shopping bills. For generating the shopping bill, we require the product ID, name, quantity, price per item, and total price of the product, and grand total. Besides the product details, we can also add some other details like date of purchase, discount (if any), SGST, CGST, POS name, address, contact details, bill number, etc.

In the following Java program, we have created two classes first is the Product class and the second is the ShoppingBill class.

The Product class has the details related to the product such as product name, quantity, price per unit, and total price. We have declared these properties as private. So that no one can access these properties directly. In order to create an object of the Product class, we have created a constructor of the Product class and, we will put all the product properties in that constructor. The class also has a method displayFormat() that displays the bill on the console.

The ShoppingBill class reads the item name, quantity, price per unit and calculates the total price to be paid. Also, reads a character 'Y' or 'N' after entering the detail of a product. If you want to enter more than one product, press 'Y' after entering the details of each product, else press 'N'. It shows the total price to pay.
