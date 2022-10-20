import java.sql.SQLOutput;

public class PTBSFacade {
    import java.util.Iterator;
    import java.util.Scanner;

    public class HacsFacade {
        int UserType;
        Product theSelecteProduct;
        int nProductCategory;
        ClassProductList theProductList;
        Person thePerson;


        public boolean login(Login object) {
            return object.login();
        }
        public void addTrading(){

        }
        public void viewTrading(){

        }
        public void decideBidding(){

        }
        public void discussBidding(){

        }
        public void submitBidding(){

        }
        public void remind(){

        }
        public void createUser(UserInfoItem userinfoitem){
            int uType = userinfoitem.getUserType();
            if(uType==0){
                thePerson = new Buyer(userinfoitem);
                System.out.println("Buyer");
            }
            if(uType==1){
                thePerson = new Seller(userinfoitem);
                System.out.println("Seller");
            }
        }
        public void createProductList(){

        }
        public void AttachProductToUser(){

        }
        public Product selectProduct(){

        }
        public void productOperation(){

        }

    }
}
