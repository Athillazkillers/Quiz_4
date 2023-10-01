import java.util.Calendar;
import java.util.Date;

public class Quiz_4 {
    public class Main {

        public class Estudiante {
            private String nombre;
            private Date fechaNacimiento;
            private double notaMateria1;
            private double notaMateria2;
            private double notaMateria3;


            public Estudiante(String nombre, Date fechaNacimiento, double notaMateria1, double notaMateria2, double notaMateria3) {
                this.nombre = nombre;
                this.fechaNacimiento = fechaNacimiento;
                this.notaMateria1 = notaMateria1;
                this.notaMateria2 = notaMateria2;
                this.notaMateria3 = notaMateria3;
            }


            public String getNombre() {
                return this.nombre;
            }

            public Date getFechaNacimiento() {
                return this.fechaNacimiento;
            }

            public double getNotaMateria1() {
                return this.notaMateria1;
            }

            public double getNotaMateria2() {
                return this.notaMateria2;
            }

            public double getNotaMateria3() {
                return this.notaMateria3;
            }


            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setFechaNacimiento(Date fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
            }

            public void setNotaMateria1(double notaMateria1) {
                this.notaMateria1 = notaMateria1;
            }

            public void setNotaMateria2(double notaMateria2) {
                this.notaMateria2 = notaMateria2;
            }

            public void setNotaMateria3(double notaMateria3) {
                this.notaMateria3 = notaMateria3;
            }

            public int getEdad() {
                Calendar hoy = Calendar.getInstance();
                Calendar nacimiento = Calendar.getInstance();
                nacimiento.setTime(this.fechaNacimiento);

                int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

                if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
                    edad--;
                }

                return edad;
            }

            public double getPromedio() {
                return (this.notaMateria1 + this.notaMateria2 + this.notaMateria3) / 3.0;
            }
        }
    }
}
