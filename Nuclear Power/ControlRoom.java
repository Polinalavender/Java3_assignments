import java.lang.reflect.GenericArrayType;
import java.util.HashSet;
import java.util.Set;

public class ControlRoom {

   private Set<Status> statuses;

    public ControlRoom() {
        this.statuses = new HashSet<>();
    }

    public void addStatus(Status status) {
        this.statuses.add(status);
    }

    public Set<Status> getStatuses() {
        return statuses;
    }

    public boolean isNuclearReactorStable() {
        boolean isStable = true;
        for (Status status : statuses) {
            if (!status.getStatus().equals(Statuses.STABLE)) {
                return false;
            }
        }
        return true;
    }
}


