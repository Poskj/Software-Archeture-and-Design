package edu.parinya.softarchdesign.structural;
import java.util.HashSet;
import java.util.Set;

//composition
public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members;
    public void addMember(HealthcareServiceable worker) {
        members.add(worker);
    }
    public void removeMember(HealthcareWorker worker) {
        members.remove(worker);
    }
    public HealthcareWorkerTeam() {
        members = new HashSet<>();
    }


    @Override
    public void service(){
        for (HealthcareServiceable worker : members){
            worker.service();

        }
    }
    @Override
    public double getPrice(){
        double totalPrice = 0;
        for (HealthcareServiceable worker : members){
            totalPrice += worker.getPrice();
        }

        return totalPrice;
    }


}
