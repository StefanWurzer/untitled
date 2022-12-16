package createNewSocialMedia;

public class SocialNetworkApp {
    public static void main(String[] args) {
        Profile susi = new Profile("susi.sorgl0s@123.com",75,"Peter Zwegat","1000 0005 0003 0001",3900);
        Profile max = new Profile("max.sorgl0s@123.com",85,"Peter Zwegat2","1000 0005 0003 0002",3900);

    susi.printPublicPage(AccessRoles.Platform);
    //max.printPublicPage();

    susi.setBestFriend(max);

   susi.getBestFriend();

    }

}
