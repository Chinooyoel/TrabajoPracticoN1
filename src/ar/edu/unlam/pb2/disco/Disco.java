package ar.edu.unlam.pb2.disco;

public class Disco {
	
	//CONSTRUCTOR
	public Disco(double radioInterior, double radioExterior) {
		this.radioExterior = radioExterior;
		this.radioInterior = radioInterior;
	}
	
	//METODOS
	//GETTERS y SETTERS
	public double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	//METODO QUE CALCULA Y DEVUELVE A TRAVEZ DEL RADIO, EL PERIMETRO DE UN CIRCULO
	public double calcularPerimetroDeUnCirculo(double radio) {
		
		return 2*(Math.PI)*radio;		//FORMULA: 2 x PI x RADIO
		
	}
	//METODO QUE CALCULA Y DEVUELVE A TRAVEZ DEL RADIO, LA SUPERFICIE DE UN CIRCULO 
	public double calcularSuperficieDeUnCirculo(double radio) {
		
		return Math.PI*(radio*radio);	//FORMULA: PI x RADIO^2
		
	}
	
	
	public double calcularPerimetroInteriorDelDisco() {
		return this.calcularPerimetroDeUnCirculo(this.radioInterior);
	}
	public double calcularPerimetroExteriorDelDisco() {
		return this.calcularPerimetroDeUnCirculo(this.radioExterior);
	}
	public double calcularSuperficieDelDisco() {
		
		double superficieDelCirculoInterior = this.calcularSuperficieDeUnCirculo(this.radioInterior);
		double superficieDelCirculoExterior = this.calcularSuperficieDeUnCirculo(this.radioExterior);
		
		//LA SUPERFICIE DEL DISCO ES LA SUMA DE LA SUPERFICIE INTERIOR Y LA SUPERFICIE EXTERIOR
		return superficieDelCirculoExterior + superficieDelCirculoInterior;
	}
	
	
	//ATRIBUTOS
	private double radioInterior;
	private double radioExterior;
}
