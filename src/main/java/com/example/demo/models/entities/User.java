//package com.example.demo.models.entities;
//
//import com.example.demo.models.constants.Roles;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "user")
////implements UserDetails
//public class User  {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column
//    private String username;
//
//    @Basic
//    @Column
//    private String email;
//
//    @Column
//    private String password;
//    @Enumerated(EnumType.STRING)
//    private Roles role;
//
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        //return list of roles
////        return List.of(new SimpleGrantedAuthority(role.name()));
////    }
////
////    @Override
////    public boolean isAccountNonExpired() {
////        return true;
////    }
////
////    @Override
////    public boolean isAccountNonLocked() {
////        return false;
////    }
////
////    @Override
////    public boolean isCredentialsNonExpired() {
////        return true;
////    }
////
////    @Override
////    public boolean isEnabled() {
////        return false;
////    }
//}
