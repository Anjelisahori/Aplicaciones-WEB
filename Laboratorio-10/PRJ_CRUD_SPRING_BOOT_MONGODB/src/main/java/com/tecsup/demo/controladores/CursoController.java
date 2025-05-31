package com.tecsup.demo.controladores;

import com.tecsup.demo.modelo.documents.Curso;
import com.tecsup.demo.servicios.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@SessionAttributes("curso")
public class CursoController {

    @Autowired
    private CursoService servicio;

    @GetMapping({"/", "/listar"})
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de cursos");
        model.addAttribute("cursos", servicio.listar());
        return "listarView";
    }

    @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable String id, Model model) {
        Curso curso = servicio.buscar(id);
        if (curso == null) return "redirect:/listar";
        model.addAttribute("titulo", "Detalle del curso");
        model.addAttribute("curso", curso);
        return "buscarView";
    }

    @GetMapping("/form")
    public String crear(Map<String, Object> model) {
        model.put("curso", new Curso());
        model.put("titulo", "Formulario de Curso");
        return "formView";
    }

    @GetMapping("/form/{id}")
    public String editar(@PathVariable String id, Map<String, Object> model) {
        Curso curso = servicio.buscar(id);
        if (curso == null) return "redirect:/listar";
        model.put("curso", curso);
        model.put("titulo", "Editar Curso");
        return "formView";
    }

    @PostMapping("/form")
    public String guardar(@Valid @ModelAttribute("curso") Curso curso,
                          BindingResult result,
                          Model model,
                          SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Curso");
            return "formView";
        }
        servicio.grabar(curso);
        status.setComplete();
        return "redirect:/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id) {
        if (id != null && !id.isEmpty()) {
            servicio.eliminar(id);
        }
        return "redirect:/listar";
    }
}
