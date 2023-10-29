import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(800));

        Compte compte = stub.getCompte(1);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());

    }
}
