package com.frankmoley.landon.data.repository;

import com.frankmoley.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Info: Repository Interface mit Room-Klasse von Typ "Long"

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    //Info: Funktioniert wegen der Naming Convention von Spring Data.
    // Hinweis: Also Methodenbenamung sehr wichtig!
    Room findByNumber(String number);
}
