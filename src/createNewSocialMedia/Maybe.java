package createNewSocialMedia;
//Wrapper
public class Maybe<T> {
    private T value;
    private AccessRoles neededAccessRole;

    public Maybe(T value) {
        this.value = value;
        this.neededAccessRole = AccessRoles.ExternalUser;
    }
//Switch Case
    public void deliverValue(AccessRoles role){
        switch(role){
            case Self:
            case Platform:
                System.out.println(value);
                break;
            case Bestfriend:
            case ExternalUser:
            case RegisteredCustomer:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not implemented");
                break;
        }
    }
}
