package com.eureka.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eureka.entity.User;
import com.eureka.entity.UserDetailImpl;
import com.eureka.repository.UserRepository;

@Service("UserService")
public class UserService implements UserDetailsService {

    @Resource(name = "UserRepository")
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        // 저장된 ID가 없을때 throw 시켜줍니다.
        if (user == null) {
            throw new UsernameNotFoundException("wrongId"); // 저장된 ID 없음
        }
        return makeLoginUser(user);
    }

    // UserInformation 값 주입 해 줍니다.
    public UserDetailImpl makeLoginUser(User user) {

        UserDetailImpl loginUser = new UserDetailImpl();

        List<GrantedAuthority> Authoritylist = new ArrayList<>();
        switch (user.getUserType()) {
        case 0:
            Authoritylist.add(new SimpleGrantedAuthority("ADMIN"));
        case 1:
            Authoritylist.add(new SimpleGrantedAuthority("USER"));
            break;
        }

        loginUser.setUsername(user.getUsername());
        loginUser.setPassword(user.getPassword());
        loginUser.setAuthorities(Authoritylist);

        return loginUser;
    }
}
