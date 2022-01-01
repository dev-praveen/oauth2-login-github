package com.praveen.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Oauth2LoginGithubApplication {

  public static void main(String[] args) {
    SpringApplication.run(Oauth2LoginGithubApplication.class, args);
  }

  @RequestMapping("/user")
  public String user(@AuthenticationPrincipal OAuth2User oAuth2User) {

    System.out.println("User " + oAuth2User);
    return oAuth2User.getAttribute("name");
  }
}
