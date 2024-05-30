package zoo;

/**
 *
 * @author adric
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     * Constructor por defecto de la clase León
     *
     */
    public Leon () {}
    
    /**
     * Constructor parametrizado de la clase León
     * @param habitat
     * @param comida
     * @param longevidad
     * @param periodoLactancia
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * Método que setea el rugido
     * @param rugido
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * Método que coge el rugido
     * @return
     */
    public String getRugido () { return rugido; }
    
    /**
     * Método hace que el león ruja
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Método hace que el león coma
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método hace que el león se mueva
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
