/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * Universidad de los Andes (Bogot� - Colombia) 
 * Departamento de Ingenier�a de Sistemas y Computaci�n
 * Licenciado bajo el esquema Academic Free License version 2.1
 * 
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_estudiante 
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.estudiante.mundo;

/**
 * Curso del estudiante.
 */
public class Curso
{
    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------
    /**
     * Enumeradores para el departamento del curso.
     */
    public enum Departamento
    {
        /**
         * Representa el departamento de Matem�ticas.
         */
        MATEMATICAS,
        /**
         * Representa el departamento de F�sica.
         */
        FISICA,
        /**
         * Representa el departamento de Ingenier�a de sistemas.
         */
        SISTEMAS,
        /**
         * Representa el departamento de Biolog�a.
         */
        BIOLOGIA
    }
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Representa la nota m�nima.
     */
    public final static double MINIMA = 1.5;

    /**
     * Representa la nota m�xima.
     */
    public final static double MAXIMA = 5.0;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * C�digo del curso.
     */
    private String codigo;

    /**
     * Nombre del curso.
     */
    private String nombre;

    /**
     * Departamento del curso.
     */
    private Departamento departamento;

    /**
     * Cantidad de cr�ditos del curso.
     */
    private int creditos;

    /**
     * Nota del curso.
     */
    private double nota;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Crea el curso con los valores dados por par�metro. <br>
     * <b>post: </b> El c�digo, nombre, n�mero de cr�ditos y departamento fueron inicializados con los valores dados por par�metro. <br>
     * La nota del curso fue inicializada en 0.0.
     * @param pCodigo C�digo del curso. pCodigo != null && pCodigo != "".
     * @param pNombre Nombre del curso. pNombre != null && pNombre != "".
     * @param pCreditos N�mero de cr�ditos del curso. pCreditos > 0.
     * @param pDepartamento Departamento del curso.
     */
    public Curso( String pCodigo, String pNombre, int pCreditos, Departamento pDepartamento )
    {
        nota = 0.0;
        creditos = pCreditos;
        nombre = pNombre;
        codigo = pCodigo;
        departamento = pDepartamento;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el c�digo del curso.
     * @return C�digo del curso.
     */
    public String darCodigo( )
    {
        return codigo;
    }

    /**
     * Retorna el nombre del curso.
     * @return Nombre del curso.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el n�mero de cr�ditos del curso.
     * @return N�mero de cr�ditos del curso.
     */
    public int darCreditos( )
    {
        return creditos;
    }

    /**
     * Retorna la nota del curso.
     * @return Nota del curso.
     */
    public double darNota( )
    {
        return nota;
    }

    /**
     * Retorna el departamento del curso.
     * @return Departamento del curso.
     */
    public Departamento darDepartamento( )
    {
        return departamento;
    }

    /**
     * Asigna la nota dada por par�metro. <br>
     * <b>post: </b> Se asigna la nueva nota del curso.
     * @param pNuevaNota Nueva nota del curso. pNuevaNota >= 1.5 && pNuevaNota <= 5.0.
     */
    public void asignarNota( double pNuevaNota )
    {
        nota = pNuevaNota;
    }

    /**
     * Indica si el curso ya ha sido calificado.
     * @return Retorna true si el curso ya tiene nota, false de lo contrario.
     */
    public boolean estaCalificado( )
    {
        boolean calificado = false;
        if( nota != 0.0 )
        {
            calificado = true;
        }
        return calificado;
    }
}