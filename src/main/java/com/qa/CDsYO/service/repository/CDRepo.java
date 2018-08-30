package com.qa.CDsYO.service.repository;

import com.qa.CDsYO.domain.Artist;
import com.qa.CDsYO.domain.CD;

import java.util.List;

public interface CDRepo {
    CD getCDByID(Long id);
    List<CD> getAllCDs();
    String getNameFromCDByID(Long id);
    String getTitleFromCDByID(Long id);
    List<Artist> getArtistFromCDByID(Long id);
    String createCD(CD newCDToStore);
    String updateCD(Long idToUpdate, CD newCDToStore);
    String deleteCD(Long idToDelete);
}
