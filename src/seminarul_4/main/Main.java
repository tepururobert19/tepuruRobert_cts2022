package seminarul_4.main;
import seminarul_4.simple_factory.*;
import seminarul_4.singleton.*;

public class Main {

	public static void main(String[] args) {
		// SINGLETON
		Singleton s1 = Singleton.getInstanta();
		Singleton s2 = Singleton.getInstanta();
		System.out.println(s1);
		System.out.println(s2);
		
		// SIMPLE FACTORY
		MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "AG24RON");
		MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai, "AG34RON");
		MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "AG44RON");
		System.out.println(autobuz);
		
	}

}
