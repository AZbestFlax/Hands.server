package ua.azbest.hands.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.azbest.hands.server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
