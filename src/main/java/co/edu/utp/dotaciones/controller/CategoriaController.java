package co.edu.utp.dotaciones.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.dotaciones.dto.Categoria;
import co.edu.utp.dotaciones.services.CategoriaService;

@RestController
public class CategoriaController {

	CategoriaService categoriaServie;

	public CategoriaController(CategoriaService categoriaServie) {
		this.categoriaServie = categoriaServie;
	}

	@PostMapping("/categoriaadd")
	Categoria newCategoria(@RequestBody Categoria categoria) {
		return categoriaServie.insert(categoria);
	}

}
