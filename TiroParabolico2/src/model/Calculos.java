package model;

public class Calculos {
	
	double velocidad, angulo, gravedad, segundo, alcance, tiempo;	
	String planeta; 
	
	Posicion dato;
	
	String Ssolar [] = {"mercurio","venus","tierra","marte","jupiter","saturno","urano","neptuno"};	
	double gravedades [] = {3.7,8.87,9.8,3.721,24.79,10.44,8.87,11.15};
	
	public Calculos () {
		
	}
	
	public Calculos (String planeta, double velocidad, double angulo, double segundo) {
		super();
		this.velocidad = velocidad;
		this.angulo = angulo;
		this.planeta = planeta;
		this.segundo = segundo;
	}	
	
	public double Gravedad() {
				
		for (int i=0;i<this.Ssolar.length;i++) {
			if (this.Ssolar[i].equals(planeta)){
				gravedad = this.gravedades [i];
			}	
		}
		
		return	gravedad;
	}

	public double Altura() {


		double radian = (this.angulo*Math.PI)/180;				
		radian = Math.sin(radian);		
		radian = Math.pow(radian, 2);		
		double altura = (Math.pow(this.velocidad, 2)*radian)/(2*this.Gravedad());
		
		altura = altura*100;
		int altu = (int)altura;
		altura = (double)altu/100;
				
		return altura;
	}

	public double Alcance() {
		
		double radian = this.angulo*2;	
		radian = (radian*Math.PI)/180;				
		radian = Math.sin(radian);
		this.alcance = (Math.pow(this.velocidad, 2)*radian)/(this.Gravedad());
		
		this.alcance = this.alcance*100;
		int alca = (int)this.alcance;
		this.alcance = (double) alca/100;
				
		return alcance;
	}

	public double Tiempo() {

		double radian = this.angulo/2;	
		radian = (angulo*Math.PI)/180;				
		radian = Math.sin(radian);
		this.tiempo = (2*this.velocidad*radian)/(this.Gravedad());	
		
		this.tiempo = this.tiempo * 100;
		int tiem = (int) this.tiempo;
		this.tiempo = (double) tiem/100;
		
		dato = new Posicion (this.velocidad, this.angulo, this.gravedad, this.segundo, this.tiempo, this.alcance);
		
		return tiempo;
	}
	
	public String Imprimir() {

		return ""+this.dato;

	}

	public String toString() {
		return  "La altura maxima alcanzada es de: \n\t"+this.Altura()+" metros \n\n"+
				"El objeto a sido enviado a: \n\t"+this.Alcance()+" metros \n\n"+
				"El tiempo de vuelo a sido: \n\t"+this.Tiempo()+" segundos \n";
				
	}
}
