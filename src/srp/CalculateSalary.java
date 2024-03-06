package srp;

/**
 * Реализация принципа  Single Responsibility Principle.
 * Калькуляция оплаты
 */
public class CalculateSalary {
        private int baseSalary;
        /** расчет зарплаты исходя из оклада */
        public CalculateSalary(int baseSalary){
            this.baseSalary = baseSalary;
        }
        /** расчет зарплаты, очищенной от налогов */
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);//calculate in otherway
            return baseSalary - tax;
        }
}
