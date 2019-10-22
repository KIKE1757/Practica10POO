public class Excepciones{
	public static void main(String[] args){
		try{
			lanzarExcepcion();
		}catch(Exception excepcion){
			System.err.println("La excepcion se manejo en main"); //4
		}
		noLanzaExcepcion();
	}

	public static void lanzarExcepcion() throws Exception{
		try{
			System.out.println("El metodo lanzarExcepcion"); //1
			throw new Exception();
		}catch(Exception excepcion){
			System.err.println("La excepcion se manejo en el metodo lanzarExcepcion"); //2
			throw excepcion;
			// cualquier código en esta región no llega a ejecutarse
		}finally{
			System.err.println("Finalmente se ejecuto en lanzarExcepcion"); //3
		}

		// cualquier código en esta región no llega a ejecutarse
	}

	// demostrar finally cuando no ocurre excepcion
	public static void noLanzaExcepcion(){
		try{
			System.out.println("El metodo noLanzaExcepcion"); //5
		}catch(Exception excepcion){
			System.err.println(excepcion);
		}finally{
			System.err.println("Finalmente se ejecuto en noLanzaExcepcion"); //6
		}
		System.out.println("Fin del metodo noLanzaExcepcion"); //7
	}
}