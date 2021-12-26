When a patient is being billed after treatment, hospitals would apply any insurance that the patient may be having. That way the insurance company would pay a part of the medical bill and the 
remaining will be paid by patient. In this project, we employ a simple insurance policy structure.

Let’s assume we have the following four classes that represent four insurance plans

PlatinumPlan

GoldPlan

SilverPlan

BronzePlan

and a patient can buy one of them. Platinum plan has the highest coverage of 0.9, i.e., it covers 90% of the total medical expenses and the patient would pay the remaining 10%. So, if the 
total medical expense was $1000, then the insurance company would pay $900 ($1000 * 0.9) while the patient would pay the remaining $100. The coverage offered by GoldPlan, SilverPlan, and 
BronzePlan are 0.8, 0.7, and 0.6 respectively. All of the below four classes would extend another class called HealthInsurancePlan. Coverage is indicated by a double field named ‘coverage’ 
and would be part of HealthInsurancePlan class.

Next, is the billing logic, which goes into a new class called Billing.java, which have a single static method called computePaymentAmount. Input to this method is a Patient object, 'amount'; 
which is a double value indicating the amount the patient is billed before applying insurance. The method returns a double[] and its first element would have the amount that the insurance 
company would pay while second element would have the amount that patient has to pay. Note that some patient's may not have any insurance plan in which case 'patient.getInsurancePlan()' in 
the below code would return a null. Once the patient's part is computed, additional discount should be applied on the patient's part depending on their insurance plan, which is as follows: 
PlatinumPlan: $50 discount
GoldPlan: $40 discount
SilverPlan: $30 discount 
BronzePlan: $25 discount

If the patient does not have any insurance plan, then a discount of $20 is applied. As an example, if the patient uses Platinum Plan and if the total amount billed is $1000, then after 
applying the coverage of 0.9, patient's part would be $100. Up on applying the discount of $50 for Platinum, the final amount that patient has to pay would be only $50. 

Finally, HealthInsurancePlan class has a field called 'offeredBy' which is of type InsuranceBrand.


This example was taken from UDEMY as coding exerciese in the course JAVA IN DEPTH by Dheeru Mundluru.