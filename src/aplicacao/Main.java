package aplicacao;

import entities.Aparelho;
import entities.Radio;
import entities.TV;

public class Main {

	public static void main(String[] args) {
		
		
		Aparelho<TV> aparelho01 =  new Aparelho<TV>(new TV(40,0,0, false));
		Aparelho<Radio> aparelho02 = new Aparelho<Radio>(new Radio(88.1f, 0, Radio.FM));
		System.out.println(aparelho01.getObjeto().getClass());
		System.out.println(aparelho02.getObjeto().getClass());
	
		

	}

}
