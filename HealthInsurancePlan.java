public class HealthInsurancePlan {
   private InsuranceBrand offeredBy;
   private double coverage;
   
   public InsuranceBrand getOfferedBy() {
      return offeredBy;
   }
   public void setOfferedBy(InsuranceBrand offeredBy) {
      this.offeredBy = offeredBy;
   }
   
   public double getCoverage() {
      return coverage;
   }
   public void setCoverage(double coverage) {
      this.coverage = coverage;
   }
   
}