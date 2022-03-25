package com.sharecarapi;

public  class  ShareCarException  extends RuntimeException {
    private Long id;
    private String className;
    private String message;
   public ShareCarException(String className, Long id){
       this.className = className;
       this.id = id;
       message.concat(className).concat(id.toString()).concat("Not Found");
   }

}