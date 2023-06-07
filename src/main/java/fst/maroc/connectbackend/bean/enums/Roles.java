package fst.maroc.connectbackend.bean.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static fst.maroc.connectbackend.bean.enums.Permission.*;

@RequiredArgsConstructor
public enum Roles {
  USER(Collections.emptySet()),
  ADMIN(
    Set.of(
      ADMIN_READ,
      ADMIN_UPDATE,
      ADMIN_CREATE,
      ADMIN_DELETE,
      MANAGER_READ,
      MANAGER_UPDATE,
      MANAGER_CREATE,
      MANAGER_DELETE
    )
  ),
  MANAGER(
    Set.of(
      MANAGER_READ,
      MANAGER_UPDATE,
      MANAGER_CREATE,
      MANAGER_DELETE
    )
  );
  @Getter
  private final Set<Permission> permissions;

  public List<SimpleGrantedAuthority> getAuthorities() {
    var authorities = getPermissions()
      .stream()
      .map(permission -> new SimpleGrantedAuthority(permission.name()))
      .collect(Collectors.toList());
    authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
    return authorities;
  }
}
