public class Facade {

    public class PtbsFacade {
        int UserType;
        Product theSelecteProduct;
        int nProductCategory;
        ClassProductList theProductList;
        Person thePerson;

        public int login(Login object) {
            return object.login();
        }
        public void addTrading(){
            TradingMenu trademenu;
            if (thePerson.type == 0) {

                trademenu = new BuyerTradingMenu();
            }

            else {
                trademenu = new SellerTradingMenu();
            }


            Trading trade = new Trading();
            trademenu.ShowMenu(trade, thePerson);
            Object product = null;
            product.addTrading(trade);
        }
        public void viewTrading(){
            TradingMenu trademenu;
            // if buyer
            if(thePerson.type == 0) {
                trademenu = new BuyerTradingMenu();
            }
            else { // if seller
                trademenu = new SellerTradingMenu();
            }
            trademenu.ShowMenu(trade, thePerson );
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
            int userType = userinfoitem.getUserType();
            if(userType==0){
                thePerson = new Buyer(userinfoitem);
                System.out.println("Buyer");
            }
            if(userType==1){
                thePerson = new Seller(userinfoitem);
                System.out.println("Seller");
            }
        }
        public void createProductList(){
            ClassProductList productList = new ClassProductList();
            productList.ReadFile("ProductInfo.txt");
            System.err.println(productList);
        }
        public void AttachProductToUser(){

        }
        public Product selectProduct(){
            Product p = null;
            return p;
        }
        public void productOperation(){

        }

    }
}
