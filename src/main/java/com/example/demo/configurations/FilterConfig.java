package com.example.demo.configurations;

//import com.example.demo.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
//@EnableWebSecurity(debug = true)
public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean jwtFilter() {
//        FilterRegistrationBean filter= new FilterRegistrationBean();
//        filter.setFilter(new JwtFilter());
//        // provide endpoints which needs to be restricted.
//        // All Endpoints would be restricted if unspecified
//        filter.addUrlPatterns("/api/v1/blog/restricted");
//        return filter;
//    }
    //    @Bean
//    public AuthenticationManager authenticationManager(UsernamePasswordAuthenticationToken authenticationConfiguration)
//            throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
//        return authConfig.getAuthenticationManager();
//}
}