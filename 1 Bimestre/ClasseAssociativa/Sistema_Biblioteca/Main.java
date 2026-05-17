public static void main (String[] args) {
    Leitor l1 = new Leitor("Alb",1);
    Livro lv1 = new Livro("Xyz","Ax",1);
    LocalDate dataE = LocalDate.of(2026,3,27);
    LocalDate dataD = LocalDate.of(2026,4,7);   
    Emprestimo emp1 = new Emprestimo(dataE,dataD,l1,lv1);
    
    System.out.println(emp1.toString());
}
