package fes.aragon.clase;

public class TDAArreglo {

	private float arreglo[];
	
	public TDAArreglo(int tamano) {
		
	}
	
	public boolean asignar (float valor, int indice) {
		
		boolean error = false;
		
		if (indice < 0) {
			error = true;
		}
		
		if (indice >= this.arreglo.length) {
			error = true;
		}
		
		if (!error) {
			this.arreglo[indice] = valor;
		}
		
		return error;
	}
	
	public int buscar (float valor) {
		
		int i;
		
		for (i=0; i<= this.arreglo.length ; i++) {
			if (valor == this.arreglo[i]) {
				break;
			}
		}
		
		if(i==this.arreglo.length)
			i = -1;
		
		return i;
	}
	
	public boolean borrar (float valor) {
		
		int i;
		boolean error = true;
		
		for (i=0; i<= this.arreglo.length ; i++) {
			if (valor == this.arreglo[i]) 
				this.arreglo[i] = 0;
		}
		
		if(i==this.arreglo.length)
			error = false;
		
		return error;
	}
	
	public void intercambiar (int indiceUno, int indiceDos) {
		float temp = this.arreglo[indiceUno];
		this.arreglo[indiceUno] = this.arreglo[indiceDos];
		this.arreglo[indiceDos] = temp;
	}
	
	
}
