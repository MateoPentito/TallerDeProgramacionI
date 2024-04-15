package ConcesionAutopista;

public class MedioDePago {
	
	private TipoDePago tipo;
	
	public MedioDePago(TipoDePago tipo) {
		this.tipo = tipo;
	}

	public double descuento(MedioDePago mdp) {
		double descuento=0;
		if(mdp.getTipo()==tipo.SUBE) {
			descuento = 0.10;
		}if(mdp.getTipo()== tipo.PASE) {
			descuento = 0.15;
		}if(mdp.getTipo()== tipo.EFECTIVO) {
			descuento = 0;
		}
		return descuento;
	}

	@Override
	public String toString() {
		return "MedioDePago [tipo=" + tipo + "]";
	}

	public TipoDePago getTipo() {
		return tipo;
	}


	
	
	
	
	
	
}
