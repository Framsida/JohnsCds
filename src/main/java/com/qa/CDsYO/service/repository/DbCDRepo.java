package com.qa.CDsYO.service.repository;

import com.qa.CDsYO.domain.Artist;
import com.qa.CDsYO.domain.CD;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;


@Default
@Transactional(SUPPORTS)
public class DbCDRepo implements CDRepo {

    @PersistenceContext(unitName = "primary")
    private EntityManager manager;

    @Override
    public CD getCDByID(Long id) {
        return findCDByID(id);
    }

    @Override
    public List<CD> getAllCDs() {
        return findAllCDs();
    }

    @Override
    public String getNameFromCDByID(Long id) {
        return null;
    }

    @Override
    public String getTitleFromCDByID(Long id) {
        return null;
    }

    @Override
    public List<Artist> getArtistFromCDByID(Long id) {
        return null;
    }

    @Override
    @Transactional(REQUIRED)
    public String createCD(CD newCDToStore) {
        manager.persist(newCDToStore);
        return "{ \"message\": \"CD created successfully\"}";
    }

    @Override
    @Transactional(REQUIRED)
    public String updateCD(Long id, CD newCDToStore) {
        CD cdToEdit = findCDByID(id);
        newCDToStore.setId(cdToEdit.getId());
        manager.merge(newCDToStore);
        return "{ \"message\": \"CD updated successfully\"}";

    }

    @Override
    @Transactional(REQUIRED)
    public String deleteCD(Long idToDelete) {
        CD cdToDelete = findCDByID(idToDelete);
        if(cdToDelete != null) {
            manager.remove(cdToDelete);
        }
        return "{ \"message\": \"CD deleted successfully\"}";

    }

    private CD findCDByID(Long id) {
        return manager.find(CD.class, id);
    }

    private List<CD> findAllCDs() {
        return manager.createQuery("Select a from CD a", CD.class).getResultList();
    }
}
