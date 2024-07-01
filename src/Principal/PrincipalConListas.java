package Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1998  );
        otraPelicula.evalua(6);
        var peliculaDeJose = new Pelicula("Lord of the rings", 2021);
        peliculaDeJose.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJose);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificable() > 2){
                System.out.println(pelicula.getClasificable());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}
