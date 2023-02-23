package com.postulante.test.controller;

import com.postulante.test.entity.Empresa;
import com.postulante.test.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public Empresa registrarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.guardarEmpresa(empresa);
    }

    @GetMapping("/ultimas-tres")
    public List<Empresa> obtenerUltimasTresEmpresas() {
        return empresaService.obtenerUltimasTresEmpresas();
    }
}