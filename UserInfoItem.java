public class UserInfoItem {

    public int getUserType() {
        return 0;
    }
    public enum USER_TYPE {
        Buyer, Seller
    }

    public String name;
    public String password;
    public USER_TYPE type=USER_TYPE.Seller;
}
