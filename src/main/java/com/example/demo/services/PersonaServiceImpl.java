package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Persona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Transactional
    @Override
    public List<Persona> search(String filtro) throws Exception{
        try{
            return personaRepository.searchNative(filtro);

        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception{
        try{
            return personaRepository.searchNative(filtro, pageable);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
