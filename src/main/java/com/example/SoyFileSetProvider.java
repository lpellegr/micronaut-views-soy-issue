package com.example;

import com.google.template.soy.SoyFileSet;

import javax.inject.Singleton;
import java.io.File;

@Singleton
public class SoyFileSetProvider implements io.micronaut.views.soy.SoyFileSetProvider {

    @Override
    public SoyFileSet provideSoyFileSet() {
        return SoyFileSet.builder()
                .add(new File(
                        SoyFileSetProvider.class.getClassLoader().getResource("home.soy").getFile()))
                .build();
    }

}
