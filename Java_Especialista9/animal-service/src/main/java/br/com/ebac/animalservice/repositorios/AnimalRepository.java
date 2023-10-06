package br.com.ebac.animalservice.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.ebac.animalservice.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT a FROM Animal a WHERE a.especie IS 'Gato'")
    List<Animal> findGatos();

    @Query("SELECT a FROM Animal a WHERE a.especie IS 'Cachorro'")
    List<Animal> findCachorros();

    @Query("SELECT a.nomeRecebedor, COUNT(a) FROM Animal a WHERE a.dataEntrada BETWEEN :dataEntrada AND :dataSaida GROUP BY a.nomeRecebedor")
    List<Object[]> countAnimaisResgatadosPorFuncionario(@Param("dataEntrada") Date dataEntrada,
            @Param("dataSaida") Date dataSaida);
}
