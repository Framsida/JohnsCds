package com.qa.CDsYO.service.repository;

import com.qa.CDsYO.domain.Artist;
import com.qa.CDsYO.domain.CD;

import javax.enterprise.inject.Alternative;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Alternative
public class MapCdRepo implements CDRepo {
    private Map<Long, CD> cds = new HashMap<>();


    @Override
    public CD getCDByID(Long id) {
        return null;
    }

    @Override
    public List<CD> getAllCDs() {
        return null;
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
    public String createCD(CD newCDToStore) {
        return null;
    }

    @Override
    public String updateCD(Long idToUpdate, CD newCDToStore) {
        return null;
    }

    @Override
    public String deleteCD(Long idToDelete) {
        return null;
    }
}
