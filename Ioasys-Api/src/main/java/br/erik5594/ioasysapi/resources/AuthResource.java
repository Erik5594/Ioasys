package br.erik5594.ioasysapi.resources;

import br.erik5594.ioasysapi.config.JwtTokenUtil;
import br.erik5594.ioasysapi.config.UserDetailConfiguration;
import br.erik5594.ioasysapi.dto.JwtRequestDto;
import br.erik5594.ioasysapi.dto.JwtResponseDto;
import br.erik5594.ioasysapi.entity.Investor;
import br.erik5594.ioasysapi.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

/**
 * @author erik_
 * Data Criacao: 05/11/2020 - 20:43
 */

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AuthResource {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailConfiguration userDetailsService;

    @Autowired
    private InvestorRepository investorRepository;

    @RequestMapping(value = "/v1/users/auth/sign_in", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestDto authenticationRequest) throws Exception {
        authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getEmail());
        final String token = jwtTokenUtil.generateToken(userDetails);
        Investor investor = investorRepository.findByEmail(authenticationRequest.getEmail());
        return ResponseEntity.ok(new JwtResponseDto(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
