/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ColladoMatias.Security.Service;

import com.portfolio.ColladoMatias.Security.Entity.Rol;
import com.portfolio.ColladoMatias.Security.Enums.RolNombre;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.ColladoMatias.Security.Repository.IRolRepository;

/**
 *
 * @author CRISTIAN
 */
@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        irolRepository.save(rol);
    }
}
