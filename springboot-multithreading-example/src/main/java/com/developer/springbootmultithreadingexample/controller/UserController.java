/**
 * @author ELNUR KARIMLI
 * PROJECT_NAME : springboot-multithreading-example
 */

package com.developer.springbootmultithreadingexample.controller;

import com.developer.springbootmultithreadingexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.CompletableFuture;

@RestController
public class UserController {
    @Autowired
    private UserService service;
@PostMapping(value = "/users",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},produces = "application/json")
    public ResponseEntity saveUsers(@RequestParam(value = "files") MultipartFile[] files) throws Exception {
    for(MultipartFile file:files){
        service.saveUsers(file);
    }
    return ResponseEntity.status(HttpStatus.CREATED).build();
}
@GetMapping(value = "/users", produces = "application/json")
public CompletableFuture<ResponseEntity> findAllUsers(){
    return service.findAllUser().thenApply(ResponseEntity::ok);


}
}
