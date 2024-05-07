package menu;

public class Menu {
    public String mostrarMenu() {
        final String MENU = """
                Seleccione una opción:
                1.- Añadir palabra.
                2.- Eliminar palabra.
                3.- Existe palabra.
                4.- Mostrar iniciales disponibles.
                5.- Ver palabras por inicial.
                6.- Cerrar programa.
                """;
        return MENU;
    }
}
