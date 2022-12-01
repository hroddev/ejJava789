package com.example.ZeroDiv;

public class DivideMain {

    /**
     * Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
     * a su llamante del tipo ArithmeticException que será capturada por su llamante
     * (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
     * "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código"
     * @param num1 numero 1
     * @param num2 numero 2
     * @return regresa una division
     */
    public static int divideZero(int num1, int num2) throws ArithmeticException{
        try{
        return num1 / num2;

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error, ingrese un numero mayor a cero");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void main(String[] args) {

        System.out.println(divideZero(4,0));
    }
}
