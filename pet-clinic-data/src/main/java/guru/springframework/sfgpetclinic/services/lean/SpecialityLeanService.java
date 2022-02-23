package guru.springframework.sfgpetclinic.services.lean;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/31/18.
 */
@Service
@Profile({"lean"})
public class SpecialityLeanService extends AbstractLeanService<Speciality, Long> implements SpecialtyService {
}
