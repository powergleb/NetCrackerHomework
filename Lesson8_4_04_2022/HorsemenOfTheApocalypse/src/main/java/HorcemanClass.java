import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class HorcemanClass {

    private static final Map<TypeHorceman, HorcemanClass> horcemen;

    private final TypeHorceman name;


    static {
        horcemen = new ConcurrentHashMap<>();
        horcemen.put(TypeHorceman.CONQUEST, new HorcemanClass(TypeHorceman.CONQUEST));
        horcemen.put(TypeHorceman.FAMINE, new HorcemanClass(TypeHorceman.FAMINE));
        horcemen.put(TypeHorceman.DEATH, new HorcemanClass(TypeHorceman.DEATH));
        horcemen.put(TypeHorceman.WAR, new HorcemanClass(TypeHorceman.WAR));
    }

    private HorcemanClass(TypeHorceman name) {
        this.name = name;
    }

    public static HorcemanClass getInstance(TypeHorceman name) {
        return horcemen.get(name);
    }

    public TypeHorceman getName() {
        return name;
    }
}

