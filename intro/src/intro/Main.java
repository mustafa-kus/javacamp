package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="Bireysel";
		double dolarDun=7.9;
		double dolarBugun=8.9;
		int vade=36;
		boolean dustumu=true;
		System.out.println(internetSubeButonu);
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar D��t�");
		} else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi");
		}
		
		else {
			System.out.println("Dolar Sabit kald�");
		}
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu Emekli Kredi";
		String kredi3="Konut Kredi";
		String kredi4="�ift�i Kredi";
		String kredi5="MSB Kredi";
		String kredi6="MEB Kredi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println("--------------");
		String[] krediler=
			{
					"H�zl� Kredi",
					"Mutlu Emekli Kredi",
					"Konut Kredi",
					"�ift�i Kredi",
					"MSB Kredi",
					"MEB Kredi"
			};
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("--------------");
		for (int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
	}

}
