package com.springframework.mypetclinic.services;

import com.springframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
