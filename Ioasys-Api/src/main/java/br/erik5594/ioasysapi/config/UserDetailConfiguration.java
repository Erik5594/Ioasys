package br.erik5594.ioasysapi.config;

import br.erik5594.ioasysapi.entity.Investor;
import br.erik5594.ioasysapi.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 03/11/2020 - 17:17
 */
@Service
public class UserDetailConfiguration implements UserDetailsService {

    @Autowired
    private InvestorRepository investorRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Investor investor = investorRepository.findByEmail(email);
        if(investor == null){
            throw new UsernameNotFoundException(String.format("Usuario [%s] nao cadastrado!", email));
        }
        return investor.getUserDetails(getRoles());
    }

    private Collection<? extends GrantedAuthority> getRoles(){
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }
}
