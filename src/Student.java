    public class Student {
        String name;
        String surname;
        String groupNumber;
        private boolean hasDepts = false; //true
        public Student(String name, String surname, String groupNumber) {
            this.name = name;
            this.surname = surname;
            this.groupNumber = groupNumber;
        }

        public Student() {

        }

        public boolean isHasDepts() {
            return hasDepts;
        }

        public void setHasDepts(boolean hasDepts) {
            this.hasDepts = hasDepts;
        }

        public static void passExam() {
            Student student = new Student();
            if (student.isHasDepts() == true) {
                System.out.println("Долги есть! У вас 2." + " Проверка: " + student.isHasDepts() + ".");
            } else {
                int otNumber = 2;
                int doNumber = 4;

                int firstRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int secondRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int threeRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int fourRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int fiveRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int sixRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int sevenRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int eightRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int nineRandomNumber = otNumber + (int) (Math.random() * doNumber);
                int tenRandomNumber = otNumber + (int) (Math.random() * doNumber);

                System.out.println("Первое рандомное число: " + firstRandomNumber);
                System.out.println("Второе рандомное число: " + secondRandomNumber);
                System.out.println("Третье рандомное число: " + threeRandomNumber);
                System.out.println("Четвёртое рандомное число: " + fourRandomNumber);
                System.out.println("Пятое рандомное число: " + fiveRandomNumber);
                System.out.println("Шестое рандомное число: " + sixRandomNumber);
                System.out.println("Седьмое рандомное число: " + sevenRandomNumber);
                System.out.println("Восьмое рандомное число: " + eightRandomNumber);
                System.out.println("Девятое рандомное число: " + nineRandomNumber);
                System.out.println("Десятое рандомное число: " + tenRandomNumber);
                System.out.println();

                double summaRandomsNumbers = firstRandomNumber + secondRandomNumber + threeRandomNumber
                        + fourRandomNumber + fiveRandomNumber + sixRandomNumber + sevenRandomNumber
                        + eightRandomNumber + nineRandomNumber + tenRandomNumber;
                double arithmeticMean = summaRandomsNumbers / 10;
                int arithmeticMeanWithRound = (int) Math.round(arithmeticMean);

                System.out.println("Сумма рандомных чисел " + summaRandomsNumbers);
                System.out.println();
                System.out.println("Среднее арифмитическое без округления: " + arithmeticMean);
                System.out.println();
                System.out.println("Среднее арифмитическое с округлением: " + arithmeticMeanWithRound);
                System.out.println();

                if (arithmeticMeanWithRound >= 3 && arithmeticMeanWithRound <= 5){
                    System.out.println("У ученика оценка: " + arithmeticMeanWithRound +
                            ". Ученик имеет допуск к экзамену.");
                }
            }
        }
    }

