import java.time.LocalDate;

public class Policy implements Comparable<Policy> {
    String number;
    String holder;
    LocalDate expiry;
    String coverage;
    double premium;
    public Policy(String number,String holder,LocalDate expiry,String coverage,double premium){
        this.number=number; this.holder=holder; this.expiry=expiry; this.coverage=coverage; this.premium=premium;
    }
    public String toString(){ return number+"|"+holder+"|"+expiry+"|"+coverage+"|"+premium; }
    public int compareTo(Policy o){ return this.expiry.compareTo(o.expiry); }
}
