package repository;

import conference.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
