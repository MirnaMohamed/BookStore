//package com.example.demo.services.authentication;
//import com.example.demo.models.entities.User;
//import com.example.demo.services.authentication.JWTGenerator;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//
////
////import com.example.demo.entities.User;
////import io.jsonwebtoken.SignatureAlgorithm;
////import org.springframework.beans.factory.annotation.Value;
////import org.springframework.stereotype.Service;
////import java.util.Date;
////import java.util.HashMap;
////import java.util.Map;
////import io.jsonwebtoken.Jwts;
//@Service
//public class JWTGeneratorImpl implements JWTGenerator {
//    @Override
//    public Map<String, String> generateToken(User user) {
//        return null;
//    }
//}
////    @Value("${jwt.secret}")
////    private String secret;
////    @Value("${app.jwttoken.message}")
////    private String message;
////
////    @Override
////    public Map<String, String> generateToken(User user) {
////        String jwtToken="";
////        jwtToken = Jwts.builder().setSubject(user.getUsername())
////                .setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secret").compact();
////        Map<String, String> jwtTokenGen = new HashMap<>();
////        jwtTokenGen.put("token", jwtToken);
////        jwtTokenGen.put("message", message);
////        return jwtTokenGen;
//////        return createToken(jwtTokenGen, user);
////    }
////}