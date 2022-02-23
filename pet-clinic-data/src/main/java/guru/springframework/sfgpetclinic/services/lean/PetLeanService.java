package guru.springframework.sfgpetclinic.services.lean;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
@Service
@Profile({"lean"})
public class PetLeanService extends AbstractLeanService<Pet, Long> implements PetService {
}
