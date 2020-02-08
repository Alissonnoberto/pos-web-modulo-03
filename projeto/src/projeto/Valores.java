package projeto;

public class Valores implements ValoresITF {
	
	int[] valor = new int[10];

	public boolean ins(int v) {

		if (v > 0) {
			for (int i = 0; i < valor.length; i++) {
				if (valor[i] == 0) {
					valor[i] = v;
					return true;
				}
			}
		}

		return false;
	}

	public int del(int i) {
		int numero = 0;
		boolean flag = false;
		for (int x = 0; x < valor.length; x++) {
			if (valor[x] != 0) {
				flag = true;
			}

		}

		if (flag == true) {
			if (i >= 0 && i <= 9) {
				numero = valor[i];
				valor[i] = 0;
			} else {
				return -1;
			}
			return numero;
		} else {
			return -1;
		}
	}

	public int size() {

		int count = 0;
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != 0) {
				count = count + 1;
			}
		}
		return count;
	}

}
