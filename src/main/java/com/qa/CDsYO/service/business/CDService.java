package com.qa.CDsYO.service.business;

import com.qa.CDsYO.domain.CD;

import java.util.List;

public interface CDService {

    String createCd(CD cdToStore);

    CD getCdById(Long id);
    List<CD> getAllCds();

    String updateCD(Long idToUpdate, CD newCdToStore);

    String deleteCD(Long id);


}
