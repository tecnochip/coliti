package model;

public class Posicion {
	// Creamos Variables para los calculos
	double velocidad, angulo, gravedad, segundo, tiempo, distancia;
	
	public Posicion (double velocidad, double angulo, double gravedad, double segundo, double tiempo, double distancia) {
		super();
		this.velocidad = velocidad;
		this.angulo = angulo;
		this.gravedad = gravedad;
		this.segundo= segundo;
		this.tiempo = tiempo;
		this.distancia = distancia;		
	}
	
	// Calculamos el vector X
	public double Vx() {		
		double vx = this.distancia/this.tiempo;		
		return vx;
	}

	// Calculamos el vector Y
	public double Vy() {
		double radian = (this.angulo*Math.PI)/180;				
		radian = Math.sin(radian);
		double vy = (this.velocidad*radian)-(this.gravedad*this.segundo);
		return vy;
	}

	// Calculamos la posicion
	public double Lugar() {		
		double posicion = Vx()*this.segundo;			
		posicion = posicion * 100;			
		int pos = (int)posicion;
		posicion = (double)pos/100;		
		return posicion;
	}

	// Calculamos la velocidad
	public double Velocidad () {
		double Vinst = Math.sqrt(Math.pow(Vx(), 2)+Math.pow(Vy(), 2));		
		Vinst = Vinst*100;
		int Vins = (int) Vinst;
		Vinst = (double) Vins/100;		
		return Vinst;
	}
	
	// Calculamos el Angulo
	public double Angulo () { 				
		double angulo = Math.toDegrees(Vy()/Vx());		
		angulo = angulo * 100;
		int angu = (int)angulo;
		angulo = (double)angu/100;
		return angulo;
	}
	
	// Devolvemos el resultado de la operacion
	public String toString() {
		return "En el segundo "+this.segundo+" tenemos que:\n\n"+
				" - El objeto esta a: "+Lugar()+" (m) del lanzador\n\n"+
				" - El objeto va a: "+Velocidad ()+" m/s\n\n"+
				" - El objeto tiene un angulo de: "+Angulo()+" �\n";				
	}
}

