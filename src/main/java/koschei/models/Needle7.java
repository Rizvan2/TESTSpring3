package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 deth8;

    @Autowired
    Needle7(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }//почему первый бин идет уже со второй реплики изза этого последний бин пришлось пустым оставить
}
