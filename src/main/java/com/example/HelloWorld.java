package com.example;

import com.google.common.collect.ImmutableMap;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;

@Validated
@Controller("/")
public class HelloWorld {
  @Get(value = "/soy", produces = MediaType.TEXT_HTML)
  @View("sample.home")
  public HttpResponse<?> soyDemo() {
    // return template context
    return HttpResponse.ok(ImmutableMap.of("username", "jdoe", "loggedIn", true));
  }
}