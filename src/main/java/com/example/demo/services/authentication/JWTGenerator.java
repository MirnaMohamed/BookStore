//package com.example.demo.services.authentication;
//
//import com.example.demo.models.entities.User;
////import io.jsonwebtoken.Jwts;
////import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//import java.util.Map;
//public interface JWTGenerator {
//    Map<String, String> generateToken(User user);
//
////    private String createToken(Map<String, Object> claims, String username) {
////        return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
////                .setExpiration(new Date(System.currentTimeMillis()+1800000))
////                .signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
////    }
//}