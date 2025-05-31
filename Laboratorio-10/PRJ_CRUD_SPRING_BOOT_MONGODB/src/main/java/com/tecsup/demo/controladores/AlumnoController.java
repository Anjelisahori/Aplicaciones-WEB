package com.tecsup.demo.controladores;

import com.tecsup.demo.modelo.documents.Alumno;
import com.tecsup.demo.servicios.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import java.util.Map;

@Controller
@SessionAttributes("alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService servicio;

    @GetMapping("/alumnos")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de Alumnos");
        model.addAttribute("alumnos", servicio.listar());
        return "alumno/listar";
    }

    @GetMapping("/alumno/form")
    public String crear(Map<String, Object> model) {
        model.put("alumno", new Alumno());
        model.put("titulo", "Formulario de Alumno");
        return "alumno/form";
    }

    @GetMapping("/alumno/form/{id}")
    public String editar(@PathVariable String id, Map<String, Object> model) {
        Alumno alumno = servicio.buscar(id);
        if (alumno == null) return "redirect:/alumnos";
        model.put("alumno", alumno);
        model.put("titulo", "Editar Alumno");
        return "alumno/form";
    }

    @PostMapping("/alumno/form")
    public String guardar(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult result,
                          Model model, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Alumno");
            return "alumno/form";
        }
        servicio.grabar(alumno);
        status.setComplete();
        return "redirect:/alumnos";
    }

    @GetMapping("/alumno/eliminar/{id}")
    public String eliminar(@PathVariable String id) {
        servicio.eliminar(id);
        return "redirect:/alumnos";
    }
}
