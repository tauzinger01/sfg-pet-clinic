package guru.springframework.sfgpetclinic.services.lean;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/29/18.
 */
@Service
@Profile({"lean"})
public class PetTypeLeanService extends AbstractLeanService<PetType, Long> implements PetTypeService {
}
