public class DataTypes {
    public static void main(String[] args) {
        boolean b = true;
        byte smallNumber = -120;


        System.out.println("The value of variable b :" + b);
        System.out.println("The value of variable smallNumber :" + smallNumber);

        Product();
    }

    public static void Product() {
        int id = 101;
        String title,price,  description, category;
        title = "Iphone 15";
        price = "1895 Euros";
        description = "Perfect product with the best image quality.";
        category= "phone";

        System.out.println("Print out from the Product Function: "+"\nPhone Id :"+ id +"\nPhone title: "+ title+"\nPhone price:"+ price+"\nPhones description :"+description+"\nPhones Category : "+category+"\n");
    }
}