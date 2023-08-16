//package com.example.demo.filter;
//
//import com.example.demo.repositories.UserRepository;
////import io.jsonwebtoken.Claims;
////import io.jsonwebtoken.Jwts;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.web.filter.GenericFilterBean;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//import static org.springframework.util.ObjectUtils.isEmpty;
//
////import static sun.util.locale.LocaleUtils.isEmpty;
//
////GenericFilterBean
////OncePerRequestFilter
//public class JwtFilter{
////    @Override
////    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
////            throws IOException, ServletException {
////        final HttpServletRequest request = (HttpServletRequest) servletRequest;
////        final HttpServletResponse response = (HttpServletResponse) servletResponse;
////        final String authHeader = request.getHeader("authorization");
////        if ("OPTIONS".equals(request.getMethod())) {
////            response.setStatus(HttpServletResponse.SC_OK);
////            filterChain.doFilter(request, response);
////        } else {
////            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
////                throw new ServletException("An exception occurred");
////            }
////        }
////    }
////    private final JwtTokenUtil jwtTokenUtil;
////    private final UserRepository userRepo;
////    @Override
////    protected void doFilterInternal(HttpServletRequest request,
////                                    HttpServletResponse response,
////                                    FilterChain chain)
////            throws ServletException, IOException {
////        // Get authorization header and validate
////        final String header = request.getHeader(HttpHeaders.AUTHORIZATION);
////        if (isEmpty(header) || !header.startsWith("Bearer ")) {
////            chain.doFilter(request, response);
////            return;
////        }
////    }
//
////    public JwtTokenFilter(JwtTokenUtil jwtTokenUtil,
////                          UserRepo userRepo) {
////        this.jwtTokenUtil = jwtTokenUtil;
////        this.userRepo = userRepo;
////    }
////        final String token = authHeader.substring(7);
////        Claims claims = Jwts.parser().setSigningKey("secret").parseClaimsJws(token).getBody();
////        request.setAttribute("claims", claims);
////        request.setAttribute("blog", servletRequest.getParameter("id"));
////        filterChain.doFilter(request, response);
////    }
//}
