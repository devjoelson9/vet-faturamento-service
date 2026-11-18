package br.com.vet.faturamento.infrastructure.security;

import java.util.Set;

public record UsuarioAutenticado(Long id, String email, Set<String> roles) {

    public boolean isAdmin() {
        return roles.contains("ADMIN");
    }

    public boolean isVeterinario() {
        return roles.contains("VETERINARIO");
    }
}
