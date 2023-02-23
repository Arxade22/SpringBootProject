package com.postulante.test.service;


import com.postulante.test.entity.Empresa;
import com.postulante.test.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa guardarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> obtenerUltimasTresEmpresas() {
        return empresaRepository.findTop3ByOrderByFechaCreacionDesc();
    }
}
