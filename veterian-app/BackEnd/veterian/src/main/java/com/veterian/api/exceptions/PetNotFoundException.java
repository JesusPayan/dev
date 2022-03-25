package com.veterian.api.exceptions;

public class PetNotFoundException extends RuntimeException{

        private Long id;
        private String message;

        public PetNotFoundException(Long id){
            this.id = id;
            this.message.concat("Mascota no Encontrada").concat(id.toString());
        }
    }

