void main(String[] args) {
   Paciente p1 = new Paciente("Marcio","121.122.123-12",1);
   Medico m1 = new Medico("Ana","Ortopedista",1);
   LocalDateTime dataC = LocalDateTime.of(2026,5,20,10,0);
   Consulta c1 = new Consulta(1,p1,m1,dataC,150);
    System.out.println(c1.toString());
}
