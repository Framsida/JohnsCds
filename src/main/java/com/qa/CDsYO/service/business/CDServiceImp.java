package com.qa.CDsYO.service.business;

import com.qa.CDsYO.domain.CD;
import com.qa.CDsYO.service.repository.CDRepo;

import javax.inject.Inject;
import java.util.List;

public class CDServiceImp implements CDService {

    @Inject
    CDRepo cdRepo;

    @Override
    public String createCd(CD cdToStore) {
        return cdRepo.createCD(cdToStore);
    }

    @Override
    public CD getCdById(Long id) {
        return  cdRepo.getCDByID(id);
    }

    @Override
    public List<CD> getAllCds() {
        return cdRepo.getAllCDs();
    }

    @Override
    public String updateCD(Long idToUpdate, CD newCdToStore) {
        return cdRepo.updateCD(idToUpdate, newCdToStore);
    }

    @Override
    public String deleteCD(Long id) {
        return cdRepo.deleteCD(id);
    }
}
