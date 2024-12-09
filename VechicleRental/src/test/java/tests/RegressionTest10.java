import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        java.util.List<org.example.Vehicle> vehicleList14 = rentalSystem0.getVehicles();
        java.lang.String str16 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.");
        java.util.List<org.example.Customer> customerList17 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found. not found.\".\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\". not found. not found. not found. not found.\".\".");
        java.util.List<org.example.Customer> customerList21 = rentalSystem0.getCustomers();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertNotNull(vehicleList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\"." + "'", str16, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".");
        org.junit.Assert.assertNotNull(customerList17);
        org.junit.Assert.assertNotNull(customerList21);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.returnVehicle("Vehicle with ID  not found.");
        java.lang.String str12 = rentalSystem0.rentVehicle("Vehicle with ID hi! not found.", "Vehicle with ID Vehicle with ID  not found. not found.", (int) (byte) 10);
        java.lang.String str14 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.rentVehicle("", "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.", (int) (byte) 100);
        java.lang.String str21 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.");
        java.util.List<org.example.Vehicle> vehicleList22 = rentalSystem0.getVehicles();
        java.lang.String str24 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.");
        int int25 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found. not found. not found.\".");
        java.util.List<org.example.Vehicle> vehicleList29 = rentalSystem0.getVehicles();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID  not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID  not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID hi! not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID hi! not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str14, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID  not found." + "'", str19, "Vehicle with ID  not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\"." + "'", str21, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\".");
        org.junit.Assert.assertNotNull(vehicleList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\"." + "'", str24, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\".");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vehicleList29);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        rentalSystem0.addCustomer("No vehicles match the keyword \"hi!\".", "hi!");
        java.lang.String str14 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str17 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.");
        java.lang.String str19 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".");
        java.util.List<org.example.Vehicle> vehicleList20 = rentalSystem0.getVehicles();
        // The following exception was thrown during execution in test generation
        try {
            rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\".\".\".\". not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Customer ID cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str14, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found." + "'", str17, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\"." + "'", str19, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\".");
        org.junit.Assert.assertNotNull(vehicleList20);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("hi!");
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("Vehicle with ID  not found.", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", 1.0d);
        java.lang.String str13 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\".", (int) (short) 100);
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.", "No vehicles match the keyword \"\".");
        java.util.List<org.example.Customer> customerList17 = rentalSystem0.getCustomers();
        java.lang.String str19 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".");
        java.util.List<org.example.Customer> customerList20 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList21 = rentalSystem0.getVehicles();
        java.lang.String str25 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found.\". not found. not found. not found. not found.\".\".\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\". not found.", 1);
        java.lang.String str27 = rentalSystem0.returnVehicle("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID hi! not found." + "'", str3, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found." + "'", str13, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.");
        org.junit.Assert.assertNotNull(customerList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found." + "'", str19, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(customerList20);
        org.junit.Assert.assertNotNull(vehicleList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found.\". not found. not found. not found. not found.\".\".\". not found." + "'", str25, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found.\". not found. not found. not found. not found.\".\".\". not found.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Vehicle with ID  not found." + "'", str27, "Vehicle with ID  not found.");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        rentalSystem0.addCustomer("Vehicle with ID hi! not found.", "hi!");
        java.lang.String str18 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.");
        java.util.List<org.example.Customer> customerList19 = rentalSystem0.getCustomers();
        java.lang.String str21 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found.\".");
        java.util.List<org.example.Vehicle> vehicleList22 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList23 = rentalSystem0.getCustomers();
        java.lang.String str25 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\"." + "'", str18, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\".");
        org.junit.Assert.assertNotNull(customerList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found.\". not found." + "'", str21, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList22);
        org.junit.Assert.assertNotNull(customerList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.\". not found. not found." + "'", str25, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.\". not found. not found.");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (int) (short) -1);
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found.", "No vehicles match the keyword \"Vehicle with ID  not found.\".", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.\".", (double) (short) 1);
        java.lang.String str19 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.");
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found.\". not found.", 10.0d);
        java.lang.String str28 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found.\". not found.\".", (int) (byte) 0);
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\"." + "'", str19, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found. not found." + "'", str28, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found. not found.");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        int int7 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\".\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found.");
        java.lang.String str12 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found.");
        java.lang.String str14 = rentalSystem0.searchVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".");
        java.lang.String str16 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.");
        java.util.List<org.example.Vehicle> vehicleList17 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found.\".");
        java.lang.String str23 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found.\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.", (-1));
        java.lang.String str25 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found.\".");
        java.lang.String str29 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\". not found. not found. not found. not found.\". not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found. not found. not found.\". not found. not found. not found.\".", (int) '4');
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\"." + "'", str14, "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found. not found." + "'", str16, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found.\". not found." + "'", str19, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found.\". not found.\". not found." + "'", str23, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found.\". not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found.\".\"." + "'", str25, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found.\".\".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\". not found. not found. not found. not found.\". not found. not found. not found." + "'", str29, "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\". not found. not found. not found. not found.\". not found. not found. not found.");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "Vehicle with ID  not found.", 100);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("No vehicles match the keyword \"hi!\".");
        java.lang.String str10 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found.");
        java.lang.String str12 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        java.util.List<org.example.Customer> customerList13 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\". not found.\". not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".");
        int int17 = rentalSystem0.getAvailableVehicleCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\"." + "'", str8, "No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found.\"." + "'", str10, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found.\".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\"." + "'", str12, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\".");
        org.junit.Assert.assertNotNull(customerList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("");
        rentalSystem0.addVehicle("Vehicle with ID  not found.", "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.", (double) (short) 0);
        java.util.List<org.example.Customer> customerList9 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList10 = rentalSystem0.getVehicles();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found. not found.\". not found. not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\".\". not found.\". not found.\".\".\".\". not found.", (double) 1L);
        java.lang.String str17 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found. not found.\".");
        java.lang.Class<?> wildcardClass18 = rentalSystem0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID  not found." + "'", str3, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList9);
        org.junit.Assert.assertNotNull(vehicleList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found. not found.\".\"." + "'", str17, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found. not found.\".\".");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (int) (short) -1);
        java.lang.String str14 = rentalSystem0.searchVehicle("hi!");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str17 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.");
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found.");
        java.lang.String str22 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.");
        // The following exception was thrown during execution in test generation
        try {
            rentalSystem0.addVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found. not found. not found.\".\".", "Vehicle with ID No vehicles match the keyword \"Vehicle is already available.\". not found.", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\". not found.", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Daily rate cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"hi!\"." + "'", str14, "No vehicles match the keyword \"hi!\".");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\"." + "'", str17, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\"." + "'", str22, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        int int11 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList12 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found. not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".", (double) (short) 100);
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\". not found. not found.", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found. not found.", 0.0d);
        java.util.List<org.example.Vehicle> vehicleList23 = rentalSystem0.getVehicles();
        java.lang.String str27 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".\". not found. not found. not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".\".\". not found.", (int) (byte) 10);
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found.\".", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found. not found. not found.\".\".");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(customerList12);
        org.junit.Assert.assertNotNull(vehicleList23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".\". not found. not found. not found. not found." + "'", str27, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".\". not found. not found. not found. not found.");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.lang.String str4 = rentalSystem0.searchVehicle("hi!");
        java.util.List<org.example.Customer> customerList5 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\".");
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\".", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\".\".", 0);
        java.util.List<org.example.Vehicle> vehicleList13 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found. not found.\".", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found. not found.\". not found.\".\". not found.");
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\".\". not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\".\".\". not found. not found.");
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found.\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".");
        java.lang.Class<?> wildcardClass23 = rentalSystem0.getClass();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No vehicles match the keyword \"hi!\"." + "'", str4, "No vehicles match the keyword \"hi!\".");
        org.junit.Assert.assertNotNull(customerList5);
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\".\"." + "'", str8, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\".\".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\". not found.");
        org.junit.Assert.assertNotNull(vehicleList13);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str12 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".");
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found. not found.", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\". not found.\".", (double) 100L);
        java.util.List<org.example.Vehicle> vehicleList18 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList19 = rentalSystem0.getCustomers();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found.");
        org.junit.Assert.assertNotNull(vehicleList18);
        org.junit.Assert.assertNotNull(customerList19);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        java.util.List<org.example.Vehicle> vehicleList14 = rentalSystem0.getVehicles();
        java.lang.String str16 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.");
        java.lang.String str20 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found. not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID  not found.\".\".\".", (-1));
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\". not found. not found. not found. not found.\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\". not found.\". not found.\". not found.");
        java.util.List<org.example.Customer> customerList24 = rentalSystem0.getCustomers();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertNotNull(vehicleList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\"." + "'", str16, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found. not found. not found. not found." + "'", str20, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found. not found. not found. not found.");
        org.junit.Assert.assertNotNull(customerList24);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.returnVehicle("");
        java.util.List<org.example.Customer> customerList9 = rentalSystem0.getCustomers();
        java.lang.String str11 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        java.lang.String str15 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"\". not found.", "ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n", (int) (short) -1);
        java.util.List<org.example.Customer> customerList16 = rentalSystem0.getCustomers();
        java.lang.String str18 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found.");
        java.lang.String str20 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\".\".\". not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID  not found." + "'", str8, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found." + "'", str11, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found." + "'", str15, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.");
        org.junit.Assert.assertNotNull(customerList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found.\"." + "'", str18, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\".\".\". not found. not found. not found. not found." + "'", str20, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\".\".\". not found. not found. not found. not found.");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("hi!");
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("Vehicle with ID  not found.", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", 1.0d);
        java.util.List<org.example.Customer> customerList10 = rentalSystem0.getCustomers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID hi! not found." + "'", str3, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertNotNull(customerList10);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        int int7 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("hi!", "Vehicle with ID Vehicle with ID  not found. not found.");
        java.util.List<org.example.Customer> customerList11 = rentalSystem0.getCustomers();
        java.lang.String str13 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.");
        java.util.List<org.example.Customer> customerList14 = rentalSystem0.getCustomers();
        int int15 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList16 = rentalSystem0.getCustomers();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(customerList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\"." + "'", str13, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\".");
        org.junit.Assert.assertNotNull(customerList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(customerList16);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (int) (short) -1);
        java.lang.String str14 = rentalSystem0.searchVehicle("hi!");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str17 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.");
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found.");
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found.", (double) 2);
        java.lang.String str27 = rentalSystem0.returnVehicle("");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"hi!\"." + "'", str14, "No vehicles match the keyword \"hi!\".");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\"." + "'", str17, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Vehicle with ID  not found." + "'", str27, "Vehicle with ID  not found.");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.lang.String str7 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".");
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.");
        int int11 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str13 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".");
        java.lang.String str15 = rentalSystem0.searchVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".");
        java.lang.String str19 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\". not found. not found.\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\". not found. not found.\".\".\".", (int) (byte) 100);
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".\".\".\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.\".\".");
        int int23 = rentalSystem0.getAvailableVehicleCount();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\"." + "'", str7, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found." + "'", str13, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\"." + "'", str15, "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\".");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\". not found. not found.\". not found. not found." + "'", str19, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\". not found. not found.\". not found. not found.");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        rentalSystem0.addCustomer("Vehicle with ID hi! not found.", "hi!");
        java.lang.String str18 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.", (double) (byte) 10);
        rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\".", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.", 1.0d);
        java.lang.String str32 = rentalSystem0.rentVehicle("ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\".", (int) '#');
        int int33 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str35 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\". not found. not found. not found.");
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".\".\".\". not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\". not found. not found.\".");
        java.util.List<org.example.Customer> customerList39 = rentalSystem0.getCustomers();
        int int40 = rentalSystem0.getAvailableVehicleCount();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found." + "'", str18, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found." + "'", str32, "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\". not found. not found. not found.\"." + "'", str35, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\". not found. not found. not found.\".");
        org.junit.Assert.assertNotNull(customerList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        int int11 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList12 = rentalSystem0.getCustomers();
        java.lang.String str16 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\".", (int) (short) -1);
        java.util.List<org.example.Vehicle> vehicleList17 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\".");
        int int20 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found.\".\". not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\". not found. not found. not found.", (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\". not found. not found.\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found. not found. not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found.\". not found.\". not found. not found.\".\".", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Daily rate cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(customerList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found." + "'", str16, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\". not found." + "'", str19, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\". not found.");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str12 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID  not found. not found.");
        java.lang.String str14 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.");
        java.util.List<org.example.Customer> customerList15 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\". not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\". not found. not found.", (double) 'a');
        java.util.List<org.example.Customer> customerList21 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".\".");
        java.lang.String str26 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found. not found.\".");
        java.lang.String str28 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\".\".\".");
        java.lang.String str32 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\".\".\". not found.", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".\".\".\". not found. not found. not found.", (int) (byte) 100);
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\"." + "'", str14, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".");
        org.junit.Assert.assertNotNull(customerList15);
        org.junit.Assert.assertNotNull(customerList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found. not found.\".\"." + "'", str26, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found. not found.\".\".");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\".\".\". not found." + "'", str28, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\".\".\". not found.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\".\".\". not found. not found." + "'", str32, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found.\".\".\". not found. not found.");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (int) (short) -1);
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.");
        java.lang.String str19 = rentalSystem0.rentVehicle("No vehicles match the keyword \"hi!\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".", (int) '#');
        java.util.List<org.example.Vehicle> vehicleList20 = rentalSystem0.getVehicles();
        int int21 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str23 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID No vehicles match the keyword \"hi!\". not found." + "'", str19, "Vehicle with ID No vehicles match the keyword \"hi!\". not found.");
        org.junit.Assert.assertNotNull(vehicleList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found." + "'", str23, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found.");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "Vehicle with ID  not found.", 100);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList7 = rentalSystem0.getVehicles();
        rentalSystem0.addVehicle("Vehicle with ID  not found.", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".", 1.0d);
        java.util.List<org.example.Vehicle> vehicleList13 = rentalSystem0.getVehicles();
        java.lang.String str15 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertNotNull(vehicleList7);
        org.junit.Assert.assertNotNull(vehicleList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.\"." + "'", str15, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.\".");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList5 = rentalSystem0.getVehicles();
        java.lang.String str9 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".", "No vehicles match the keyword \"Vehicle with ID  not found.\".", (int) ' ');
        java.lang.String str13 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "", (int) (byte) -1);
        int int14 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("Vehicle with ID  not found.", "Vehicle with ID No vehicles match the keyword \"hi!\". not found.");
        java.util.List<org.example.Customer> customerList18 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found.\".\". not found.", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".\". not found.\".");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertNotNull(vehicleList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found." + "'", str9, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str13, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(customerList18);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        java.lang.String str11 = rentalSystem0.returnVehicle("");
        int int12 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str14 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        int int15 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str17 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found.\".");
        java.util.List<org.example.Customer> customerList18 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList19 = rentalSystem0.getCustomers();
        // The following exception was thrown during execution in test generation
        try {
            rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\".\". not found.\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found. not found.\".\".", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Daily rate cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID  not found." + "'", str11, "Vehicle with ID  not found.");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found." + "'", str14, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found.\". not found." + "'", str17, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(customerList18);
        org.junit.Assert.assertNotNull(customerList19);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        int int11 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList12 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found. not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".", (double) (short) 100);
        java.util.List<org.example.Customer> customerList18 = rentalSystem0.getCustomers();
        int int19 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found.\". not found. not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\". not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(customerList12);
        org.junit.Assert.assertNotNull(customerList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.returnVehicle("Vehicle with ID  not found.");
        java.lang.String str12 = rentalSystem0.rentVehicle("Vehicle with ID hi! not found.", "Vehicle with ID Vehicle with ID  not found. not found.", (int) (byte) 10);
        java.lang.String str14 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.rentVehicle("", "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.", (int) (byte) 100);
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found. not found.\". not found.", "ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\". not found. not found.", 0.0d);
        int int25 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str27 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\".");
        java.util.List<org.example.Customer> customerList28 = rentalSystem0.getCustomers();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\". not found. not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found. not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found. not found.\".", (double) 100.0f);
        java.lang.String str37 = rentalSystem0.rentVehicle("ID: No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\"., Model: Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found., Type: Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found., Daily Rate: $10.0, Status: Available\n", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".\". not found.\". not found.", (int) '#');
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID  not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID  not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID hi! not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID hi! not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str14, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID  not found." + "'", str19, "Vehicle with ID  not found.");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\". not found." + "'", str27, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\". not found.");
        org.junit.Assert.assertNotNull(customerList28);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Vehicle with ID ID: No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\"., Model: Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found., Type: Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found., Daily Rate: $10.0, Status: Available\n not found." + "'", str37, "Vehicle with ID ID: No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\"., Model: Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found., Type: Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found., Daily Rate: $10.0, Status: Available\n not found.");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.lang.String str4 = rentalSystem0.rentVehicle("Vehicle with ID hi! not found.", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.", (int) (byte) -1);
        java.lang.String str6 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found. not found. not found.\".");
        java.util.List<org.example.Customer> customerList7 = rentalSystem0.getCustomers();
        java.lang.String str11 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found. not found.\".\".", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\".\".\". not found. not found. not found. not found.", (int) 'a');
        java.lang.String str13 = rentalSystem0.returnVehicle("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Vehicle with ID Vehicle with ID hi! not found. not found." + "'", str4, "Vehicle with ID Vehicle with ID hi! not found. not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found. not found. not found.\". not found." + "'", str6, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(customerList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found. not found.\".\". not found." + "'", str11, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found. not found.\".\". not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID  not found." + "'", str13, "Vehicle with ID  not found.");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        rentalSystem0.addCustomer("Vehicle with ID hi! not found.", "hi!");
        java.util.List<org.example.Vehicle> vehicleList17 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".");
        java.lang.String str23 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found.\".", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found.\". not found. not found. not found. not found.\".\".", 3);
        java.lang.String str25 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\". not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertNotNull(vehicleList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".\"." + "'", str19, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".\".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found.\". not found." + "'", str23, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\". not found. not found. not found.\". not found. not found." + "'", str25, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"ID: Vehicle with ID  not found., Model: Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\"., Daily Rate: $1.0, Status: Available\n\".\". not found. not found. not found.\". not found. not found.");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("");
        rentalSystem0.addVehicle("Vehicle with ID  not found.", "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.", (double) (short) 0);
        java.util.List<org.example.Vehicle> vehicleList9 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList10 = rentalSystem0.getVehicles();
        java.lang.String str12 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found. not found.");
        java.lang.String str14 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.");
        java.lang.String str18 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found. not found. not found.", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID  not found." + "'", str3, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList9);
        org.junit.Assert.assertNotNull(vehicleList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found. not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\". not found. not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\"." + "'", str14, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\". not found." + "'", str18, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\". not found.");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.lang.String str8 = rentalSystem0.rentVehicle("hi!", "No vehicles match the keyword \"Vehicle with ID  not found.\".", 100);
        java.lang.String str10 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.");
        java.lang.Class<?> wildcardClass11 = rentalSystem0.getClass();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID hi! not found." + "'", str8, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found." + "'", str10, "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        int int7 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str9 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".");
        java.lang.String str11 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\".");
        java.lang.String str13 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.");
        java.lang.String str17 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found.\".\".", (int) (short) 10);
        int int18 = rentalSystem0.getAvailableVehicleCount();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str9, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\". not found." + "'", str11, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.\".\". not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\"." + "'", str13, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found." + "'", str17, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found.");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.lang.String str8 = rentalSystem0.rentVehicle("hi!", "No vehicles match the keyword \"Vehicle with ID  not found.\".", 100);
        java.lang.String str10 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.");
        java.lang.String str12 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.");
        java.lang.String str14 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".\". not found.\".");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID hi! not found." + "'", str8, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found." + "'", str10, "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".\". not found.\". not found." + "'", str14, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".\". not found.\". not found.");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID  not found.\".", "hi!");
        int int10 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList11 = rentalSystem0.getCustomers();
        java.lang.String str13 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.");
        int int14 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str16 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found.");
        rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\".\". not found.\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found. not found. not found.\".", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"\".\".\". not found.", (double) (short) 100);
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(customerList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\"." + "'", str13, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found. not found." + "'", str16, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found. not found.");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.lang.String str7 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".");
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.");
        java.lang.String str12 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\"." + "'", str7, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found. not found.\". not found.\"." + "'", str12, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found. not found. not found.\". not found.\".");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        int int2 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Vehicle> vehicleList3 = rentalSystem0.getVehicles();
        int int4 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Vehicle> vehicleList5 = rentalSystem0.getVehicles();
        java.lang.String str7 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\". not found. not found. not found. not found. not found.");
        java.lang.String str9 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(vehicleList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vehicleList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\". not found. not found. not found. not found. not found. not found." + "'", str7, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\". not found. not found. not found. not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found. not found." + "'", str9, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found. not found.");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID  not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (int) (short) -1);
        java.lang.String str14 = rentalSystem0.searchVehicle("hi!");
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str17 = rentalSystem0.searchVehicle("");
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\". not found.", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found. not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\". not found.", (double) 10.0f);
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found.\".", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\".");
        java.lang.String str27 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.");
        java.lang.String str29 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found. not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No vehicles match the keyword \"hi!\"." + "'", str14, "No vehicles match the keyword \"hi!\".");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"\"." + "'", str17, "No vehicles match the keyword \"\".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\"." + "'", str27, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".\". not found.\".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found. not found. not found.\". not found. not found." + "'", str29, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found. not found. not found.\". not found. not found.");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "Vehicle with ID  not found.", 100);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList7 = rentalSystem0.getVehicles();
        java.lang.String str11 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.", (int) (byte) 100);
        java.lang.String str13 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".");
        java.util.List<org.example.Customer> customerList14 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList15 = rentalSystem0.getCustomers();
        java.lang.String str19 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\".", "Vehicle is already available.", (int) '#');
        java.lang.String str23 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found.", 0);
        java.util.List<org.example.Customer> customerList24 = rentalSystem0.getCustomers();
        java.lang.String str26 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found. not found. not found.\". not found.");
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"ID: Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found. not found. not found., Model: No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID  not found.\".\"., Type: No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found.\"., Daily Rate: $1.0, Status: Available\n\". not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found. not found.\". not found. not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found. not found.", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertNotNull(vehicleList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str11, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\"." + "'", str13, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\".");
        org.junit.Assert.assertNotNull(customerList14);
        org.junit.Assert.assertNotNull(customerList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\". not found." + "'", str19, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\". not found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found." + "'", str23, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.");
        org.junit.Assert.assertNotNull(customerList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found. not found. not found.\". not found.\"." + "'", str26, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\". not found. not found. not found.\". not found.\".");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "Vehicle with ID  not found.", 100);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList7 = rentalSystem0.getVehicles();
        java.lang.String str11 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found.", (int) (byte) 100);
        java.util.List<org.example.Customer> customerList12 = rentalSystem0.getCustomers();
        int int13 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Vehicle> vehicleList14 = rentalSystem0.getVehicles();
        java.lang.String str18 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.\".", (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertNotNull(vehicleList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str11, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertNotNull(customerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vehicleList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found. not found." + "'", str18, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found. not found. not found.");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        int int5 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".", "Vehicle with ID Vehicle with ID hi! not found. not found.", (double) 100.0f);
        java.lang.String str14 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found.", "", 0);
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str17 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\". not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found." + "'", str14, "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\". not found. not found.\". not found.\"." + "'", str17, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found.\".\". not found. not found.\". not found.\".");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("");
        java.lang.String str5 = rentalSystem0.searchVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".");
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found.", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\". not found.");
        java.util.List<org.example.Customer> customerList9 = rentalSystem0.getCustomers();
        java.lang.String str13 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.\". not found.", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID  not found." + "'", str3, "Vehicle with ID  not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".\"." + "'", str5, "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".\".");
        org.junit.Assert.assertNotNull(customerList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found." + "'", str13, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\". not found.");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("hi!");
        java.lang.String str5 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        rentalSystem0.addCustomer("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\".", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\".\".");
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\".\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\". not found. not found. not found.\".", 1);
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found.");
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\".\". not found. not found. not found.\".\". not found.", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found. not found. not found.\". not found. not found. not found. not found.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID hi! not found." + "'", str3, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found." + "'", str5, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\".\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\".\". not found.");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.", "Vehicle with ID Vehicle with ID hi! not found. not found.", "No vehicles match the keyword \"hi!\".", (double) 1L);
        java.lang.String str15 = rentalSystem0.rentVehicle("ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found. not found.\".", (int) 'a');
        java.util.List<org.example.Vehicle> vehicleList16 = rentalSystem0.getVehicles();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found." + "'", str15, "Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.");
        org.junit.Assert.assertNotNull(vehicleList16);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Customer> customerList6 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.returnVehicle("Vehicle with ID  not found.");
        java.lang.String str10 = rentalSystem0.returnVehicle("hi!");
        java.lang.String str12 = rentalSystem0.searchVehicle("");
        rentalSystem0.addCustomer("Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        java.lang.String str17 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\".");
        java.lang.String str19 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".");
        java.lang.String str21 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found.\".");
        // The following exception was thrown during execution in test generation
        try {
            rentalSystem0.addVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found. not found. not found.\".", "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"hi!\". not found.\". not found.\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found.\".\".\". not found. not found. not found.", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Daily rate cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(customerList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID  not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID  not found. not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Vehicle with ID hi! not found." + "'", str10, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No vehicles match the keyword \"\"." + "'", str12, "No vehicles match the keyword \"\".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found." + "'", str17, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found.\". not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".\"." + "'", str19, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found.\". not found.\". not found.\".\".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found.\". not found." + "'", str21, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found. not found.\". not found. not found.\". not found.");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("");
        int int4 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Vehicle> vehicleList5 = rentalSystem0.getVehicles();
        java.lang.String str7 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.");
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".", "Vehicle with ID hi! not found.");
        java.lang.String str12 = rentalSystem0.searchVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".");
        java.util.List<org.example.Vehicle> vehicleList13 = rentalSystem0.getVehicles();
        java.lang.Class<?> wildcardClass14 = vehicleList13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID  not found." + "'", str3, "Vehicle with ID  not found.");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vehicleList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.\"." + "'", str7, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.\".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\"." + "'", str12, "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\".");
        org.junit.Assert.assertNotNull(vehicleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        java.util.List<org.example.Customer> customerList4 = rentalSystem0.getCustomers();
        java.lang.String str8 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID  not found.", 100);
        rentalSystem0.addVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"\". not found.\". not found.", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\". not found.", "No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".", (double) (byte) 1);
        java.util.List<org.example.Vehicle> vehicleList14 = rentalSystem0.getVehicles();
        int int15 = rentalSystem0.getAvailableVehicleCount();
        java.lang.Class<?> wildcardClass16 = rentalSystem0.getClass();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertNotNull(customerList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found." + "'", str8, "Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.lang.String str8 = rentalSystem0.rentVehicle("hi!", "No vehicles match the keyword \"Vehicle with ID  not found.\".", 100);
        int int9 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str11 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.");
        java.util.List<org.example.Vehicle> vehicleList12 = rentalSystem0.getVehicles();
        java.lang.String str14 = rentalSystem0.returnVehicle("");
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found.");
        java.lang.String str19 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found. not found.");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID hi! not found." + "'", str8, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.\"." + "'", str11, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.\".");
        org.junit.Assert.assertNotNull(vehicleList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Vehicle with ID  not found." + "'", str14, "Vehicle with ID  not found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found. not found.\"." + "'", str19, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found.\". not found.\". not found. not found. not found. not found.\".");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        int int2 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Customer> customerList3 = rentalSystem0.getCustomers();
        int int4 = rentalSystem0.getAvailableVehicleCount();
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".", "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        int int8 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str10 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".");
        java.util.List<org.example.Vehicle> vehicleList11 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found. not found. not found. not found. not found.", "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\".\". not found.");
        int int15 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str17 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found. not found.\".");
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(customerList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found." + "'", str10, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found. not found.\".\"." + "'", str17, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found.\". not found. not found.\".\".");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "Vehicle with ID  not found.", 100);
        rentalSystem0.addCustomer("hi!", "Vehicle with ID Vehicle with ID  not found. not found.");
        java.util.List<org.example.Vehicle> vehicleList9 = rentalSystem0.getVehicles();
        java.lang.String str13 = rentalSystem0.rentVehicle("hi!", "No vehicles match the keyword \"Vehicle with ID  not found.\".", (int) '4');
        java.util.List<org.example.Customer> customerList14 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList15 = rentalSystem0.getVehicles();
        java.lang.String str19 = rentalSystem0.rentVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found. not found.\". not found.", "Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.", 0);
        java.lang.String str21 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".");
        java.lang.Class<?> wildcardClass22 = rentalSystem0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Vehicle with ID hi! not found." + "'", str13, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertNotNull(customerList14);
        org.junit.Assert.assertNotNull(vehicleList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found. not found.\". not found. not found." + "'", str19, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found. not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".\"." + "'", str21, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\".\".");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        int int1 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str3 = rentalSystem0.returnVehicle("");
        int int4 = rentalSystem0.getAvailableVehicleCount();
        java.util.List<org.example.Vehicle> vehicleList5 = rentalSystem0.getVehicles();
        java.lang.String str7 = rentalSystem0.searchVehicle("Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.");
        java.util.List<org.example.Vehicle> vehicleList8 = rentalSystem0.getVehicles();
        java.lang.String str12 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found. not found.\".", 0);
        java.lang.String str16 = rentalSystem0.rentVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\".\".", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found.\". not found. not found.", 3);
        java.util.List<org.example.Vehicle> vehicleList17 = rentalSystem0.getVehicles();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Vehicle with ID  not found." + "'", str3, "Vehicle with ID  not found.");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vehicleList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.\"." + "'", str7, "No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.\".");
        org.junit.Assert.assertNotNull(vehicleList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\". not found." + "'", str12, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\".\". not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\".\". not found." + "'", str16, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found. not found. not found.\".\". not found.");
        org.junit.Assert.assertNotNull(vehicleList17);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        java.util.List<org.example.Vehicle> vehicleList14 = rentalSystem0.getVehicles();
        java.lang.String str16 = rentalSystem0.searchVehicle("No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\".\".");
        java.lang.String str20 = rentalSystem0.rentVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\". not found.\".", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found. not found. not found.\". not found. not found.\". not found.\". not found. not found. not found.", 0);
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertNotNull(vehicleList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\".\".\"." + "'", str16, "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found. not found.\".\".\".\".\".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\". not found.\". not found." + "'", str20, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"hi!\".\".\". not found.\".\". not found.\". not found.");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.util.List<org.example.Vehicle> vehicleList2 = rentalSystem0.getVehicles();
        java.lang.String str4 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found.");
        java.lang.String str6 = rentalSystem0.searchVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".");
        java.util.List<org.example.Customer> customerList7 = rentalSystem0.getCustomers();
        java.util.List<org.example.Vehicle> vehicleList8 = rentalSystem0.getVehicles();
        java.lang.String str12 = rentalSystem0.rentVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\". not found. not found.", "No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".\".", (int) (byte) 10);
        java.util.List<org.example.Customer> customerList13 = rentalSystem0.getCustomers();
        java.lang.Class<?> wildcardClass14 = rentalSystem0.getClass();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertNotNull(vehicleList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found." + "'", str4, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\"." + "'", str6, "No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.\". not found.\".\".");
        org.junit.Assert.assertNotNull(customerList7);
        org.junit.Assert.assertNotNull(vehicleList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\". not found. not found. not found." + "'", str12, "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found. not found. not found.\". not found. not found.\".\". not found. not found. not found.");
        org.junit.Assert.assertNotNull(customerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID  not found. not found.", "No vehicles match the keyword \"Vehicle with ID hi! not found.\".");
        java.lang.String str8 = rentalSystem0.rentVehicle("hi!", "No vehicles match the keyword \"Vehicle with ID  not found.\".", 100);
        java.lang.String str10 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID hi! not found. not found.");
        rentalSystem0.addVehicle("ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n", "Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.", "No vehicles match the keyword \"\".", (double) (byte) 10);
        java.lang.String str17 = rentalSystem0.returnVehicle("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".");
        rentalSystem0.addVehicle("Vehicle with ID ID: Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found., Model: Vehicle with ID Vehicle with ID hi! not found. not found., Type: No vehicles match the keyword \"hi!\"., Daily Rate: $1.0, Status: Available\nID: Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"hi!\". not found. not found. not found.\". not found., Model: No vehicles match the keyword \"\"., Type: No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found.\".\". not found.\"., Daily Rate: $100.0, Status: Available\n not found.", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"\". not found. not found.\".", "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID  not found.\". not found. not found. not found. not found.\".", (double) (byte) 1);
        java.util.List<org.example.Vehicle> vehicleList23 = rentalSystem0.getVehicles();
        rentalSystem0.addCustomer("Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID hi! not found. not found.\". not found. not found.", "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found. not found. not found.");
        java.lang.String str28 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found. not found. not found.");
        int int29 = rentalSystem0.getAvailableVehicleCount();
        java.lang.String str31 = rentalSystem0.returnVehicle("Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found.");
        java.lang.String str33 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found.\". not found.\". not found.\".");
        int int34 = rentalSystem0.getAvailableVehicleCount();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vehicle with ID hi! not found." + "'", str8, "Vehicle with ID hi! not found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found." + "'", str10, "Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found." + "'", str17, "Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\". not found.");
        org.junit.Assert.assertNotNull(vehicleList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found. not found. not found.\"." + "'", str28, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID hi! not found. not found. not found. not found. not found. not found.\".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found." + "'", str31, "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found. not found. not found. not found.\".\". not found.\". not found. not found.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found.\". not found.\". not found.\". not found." + "'", str33, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID  not found. not found.\". not found.\". not found. not found. not found.\". not found.\". not found.\". not found.");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.example.RentalSystem rentalSystem0 = new org.example.RentalSystem();
        java.util.List<org.example.Vehicle> vehicleList1 = rentalSystem0.getVehicles();
        java.lang.String str5 = rentalSystem0.rentVehicle("", "hi!", 10);
        java.util.List<org.example.Vehicle> vehicleList6 = rentalSystem0.getVehicles();
        java.lang.String str8 = rentalSystem0.searchVehicle("Vehicle with ID  not found.");
        rentalSystem0.addVehicle("hi!", "Vehicle with ID Vehicle with ID  not found. not found.", "Vehicle with ID hi! not found.", (double) 0);
        rentalSystem0.addCustomer("Vehicle with ID hi! not found.", "hi!");
        java.lang.String str18 = rentalSystem0.searchVehicle("Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.");
        java.util.List<org.example.Customer> customerList19 = rentalSystem0.getCustomers();
        rentalSystem0.addCustomer("No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID No vehicles match the keyword \"Vehicle with ID hi! not found.\". not found.\".\".", "Vehicle with ID Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\". not found. not found.");
        java.lang.String str24 = rentalSystem0.returnVehicle("Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found.");
        java.lang.String str26 = rentalSystem0.returnVehicle("No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found.\".");
        java.util.List<org.example.Vehicle> vehicleList27 = rentalSystem0.getVehicles();
        org.junit.Assert.assertNotNull(vehicleList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vehicle with ID  not found." + "'", str5, "Vehicle with ID  not found.");
        org.junit.Assert.assertNotNull(vehicleList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No vehicles match the keyword \"Vehicle with ID  not found.\"." + "'", str8, "No vehicles match the keyword \"Vehicle with ID  not found.\".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\"." + "'", str18, "No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID  not found. not found. not found. not found.\".");
        org.junit.Assert.assertNotNull(customerList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found. not found." + "'", str24, "Vehicle with ID Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found. not found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found.\". not found." + "'", str26, "Vehicle with ID No vehicles match the keyword \"Vehicle with ID Vehicle with ID No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"No vehicles match the keyword \"Vehicle with ID Vehicle with ID Vehicle with ID Vehicle with ID ID: Vehicle with ID  not found., Model: Vehicle with ID hi! not found., Type: Vehicle with ID Vehicle with ID hi! not found. not found., Daily Rate: $52.0, Status: Available\n not found. not found. not found. not found.\".\".\".\". not found. not found.\". not found.");
        org.junit.Assert.assertNotNull(vehicleList27);
    }
}

