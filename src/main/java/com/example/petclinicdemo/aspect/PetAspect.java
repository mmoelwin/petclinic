package com.example.petclinicdemo.aspect;

import com.example.petclinicdemo.exception.LastNameNotFoundException;
import com.example.petclinicdemo.repository.VetRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PetAspect {

    private final VetRepository vetRepository;

    public PetAspect(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Before("execution(* *.searchVetLastName(..))")
    public void searchNameVetAspect(JoinPoint joinPoint){
        Object[] objects=joinPoint.getArgs();
        vetRepository.findByLastName(String.valueOf(objects[0]))
                .orElseThrow(()-> new LastNameNotFoundException(objects[0] + " Not Found."));
                //          () mean no return
    }

}
