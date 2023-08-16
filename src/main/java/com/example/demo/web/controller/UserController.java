//package com.example.demo.web.controller;
//
//import com.example.demo.configurations.FilterConfig;
//import com.example.demo.models.entities.User;
//import com.example.demo.exceptions.NotExistException;
//import com.example.demo.services.UserService;
//import com.example.demo.services.authentication.JWTGenerator;
//import com.example.demo.services.authentication.JWTGeneratorImpl;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.authentication.BadCredentialsException;
////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
////import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api/v1/user")
//public class UserController {
//    private UserService userService;
//    @Autowired
//    private JWTGenerator jwtGenerator;
//    @Autowired
//    private FilterConfig filterConfig;
////    AuthenticationManager authenticationManager;
//
//    public UserController(UserService userService, JWTGenerator jwtGenerator){
//        this.userService=userService;
//        this.jwtGenerator=jwtGenerator;
//    }
////    private final AuthenticationManager authenticationManager;
////    private final JwtTokenUtil jwtTokenUtil;
////    private final UserViewMapper userViewMapper;
////
////    public UserController(AuthenticationManager authenticationManager,
////                   JwtTokenUtil jwtTokenUtil,
////                   UserViewMapper userViewMapper) {
////        this.authenticationManager = authenticationManager;
////        this.jwtTokenUtil = jwtTokenUtil;
////        this.userViewMapper = userViewMapper;
////    }
////
////    @PostMapping("login")
////    public ResponseEntity<User> login(@RequestBody @Valid AuthRequest  request) {
////        try {
////            Authentication authenticate = authenticationManager
////                    .authenticate(
////                            new UsernamePasswordAuthenticationToken(
////                                    request.getUsername(), request.getPassword()
////                            )
////                    );
////
////            User user = (User) authenticate.getPrincipal();
////
////            return ResponseEntity.ok()
////                    .header(
////                            HttpHeaders.AUTHORIZATION,
////                            jwtTokenUtil.generateAccessToken(user)
////                    )
////                    .body(userViewMapper.toUserView(user));
////        } catch (BadCredentialsException ex) {
////            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
////        }
////    }
//
//
//
//    //    @PostMapping("/authenticate")
////    public String authenticateAndGetToken(@RequestBody User user){
////        Authentication authentication = filterConfig
////                //Authentication auth = authManager.authenticate(authReq);
////                //SecurityContext sc = SecurityContextHolder.getContext();
////                //sc.setAuthentication(auth);
//////                .authenticationManager(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())).authenticate();
//////                .authenticate(new UsernamePasswordAuthenticationToken(user.getUserName()), user.getPassword());
////        if(authentication.isAuthenticated()){
////            return  jwtGenerator.generateToken(user).toString();
////        }
////        else {
////            throw new UserNotFoundException("Invalid user request");
////        }
////    }
////    @PostMapping("/register")
////    public ResponseEntity<?> postUser(@RequestBody User user){
////        try{
////            userService.saveUser(user);
////            return new ResponseEntity<>(user, HttpStatus.CREATED);
////        } catch (Exception e){
////            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
////        }
////    }
////    @PostMapping("/login")
////    public ResponseEntity<?> loginUser(@RequestBody User user) {
////        try {
////            if(user.getUserName() == null || user.getPassword() == null) {
////                throw new UserNotFoundException("UserName or Password is Empty");
////            }
////            User userData = userService.getUserByNameAndPassword(user.getUserName(), user.getPassword());
////            if(userData == null){
////                throw new UserNotFoundException("UserName or Password is Invalid");
////            }
////            return new ResponseEntity<>(jwtGenerator.generateToken(user), HttpStatus.OK);
////        } catch (UserNotFoundException e) {
////            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
////        }
////    }
//}