import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            int sayi1;
            int sayi2;
            int sayi3;
            int sayi4;
            Scanner in = new Scanner(System.in);
            System.out.println("Ilk sayıyı giriniz: ");
            sayi1 = in.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            sayi2 = in.nextInt();
            System.out.println("Üçüncü sayıyı giriniz: ");
            sayi3 = in.nextInt();
            System.out.println("Dördüncü sayıyı giriniz: ");
            sayi4 = in.nextInt();
            int firstplace = 0;
            int secondplace = 0;
            int fourthplace = 0;
            int thirdplace = 0;

            if (sayi1 >= sayi2 && sayi1 >= sayi3 && sayi1 >= sayi4) {
                firstplace = sayi1;
                if (sayi1 == sayi2) {
                    secondplace = sayi2;
                    if (sayi2 == sayi3 && sayi3 >= sayi4) {
                        thirdplace = sayi3;
                        if (sayi3 == sayi4 && sayi2 == sayi3) {
                            fourthplace = sayi4;
                        }
                    }
                    if (sayi1 == sayi3) {
                        secondplace = sayi3;
                    }
                    if (sayi1 == sayi4) {
                        secondplace = sayi4;
                    }

                }
            } else if (sayi2 >= sayi1 && sayi2 >= sayi3 && sayi2 >= sayi4) {
                firstplace = sayi2;
            } else if (sayi3 >= sayi1 && sayi3 >= sayi2 && sayi3 >= sayi4) {
                firstplace = sayi3;
            } else if (sayi4 >= sayi1 && sayi4 >= sayi2 && sayi4 >= sayi3) {
                firstplace = sayi4;
            }
            if (sayi1 == firstplace && sayi2 >= sayi3 && sayi2 >= sayi4) {
                secondplace = sayi2;
                if (sayi2 == sayi3) {
                    thirdplace = sayi3;
                }
                if (sayi2 == sayi4) {
                    thirdplace = sayi4;
                }

            } else if (firstplace == sayi2 && sayi1 >= sayi3 && sayi1 >= sayi4) {
                secondplace = sayi1;
                if (sayi1 == sayi3) {
                    thirdplace = sayi3;
                    fourthplace = sayi4;
                }
                if (sayi1 == sayi4) {
                    thirdplace = sayi4;
                    fourthplace = sayi3;

                }

            } else if (firstplace == sayi2 && sayi3 >= sayi1 && sayi3 >= sayi4) {
                secondplace = sayi3;
                if (sayi1 == sayi3) {
                    thirdplace = sayi1;
                    fourthplace = sayi4;
                }
                if (sayi3 == sayi4) {
                    thirdplace = sayi4;
                    fourthplace = sayi1;
                }

            } else if (firstplace == sayi2 && sayi4 >= sayi3 && sayi4 >= sayi1) {
                secondplace = sayi4;
                if (sayi4 == sayi3) {
                    thirdplace = sayi3;
                    fourthplace = sayi1;
                }
                if (sayi1 == sayi4) {
                    thirdplace = sayi1;
                    fourthplace = sayi3;
                }
            } else if (firstplace == sayi1 && sayi3 >= sayi2 && sayi3 >= sayi4) {
                secondplace = sayi3;
                if (sayi2 == sayi3) {
                    thirdplace = sayi2;
                    fourthplace = sayi4;
                }
                if (sayi3 == sayi4) {
                    thirdplace = sayi4;
                    fourthplace = sayi2;
                }
            } else if (firstplace == sayi1 && sayi4 >= sayi3 && sayi4 >= sayi2) {
                secondplace = sayi4;
                if (sayi4 == sayi3) {
                    thirdplace = sayi3;
                    fourthplace = sayi2;
                }
                if (sayi2 == sayi4) {
                    thirdplace = sayi2;
                    fourthplace = sayi3;
                }
            } else if (firstplace == sayi3 && sayi2 >= sayi1 && sayi2 >= sayi4) {
                secondplace = sayi2;
                if (sayi2 == sayi1) {
                    thirdplace = sayi1;
                    fourthplace = sayi4;
                }
                if (sayi2 == sayi4) {
                    thirdplace = sayi4;
                    fourthplace = sayi1;
                }
            } else if (firstplace == sayi3 && sayi1 >= sayi2 && sayi1 >= sayi4) {
                secondplace = sayi1;
                if (sayi1 == sayi4) {
                    thirdplace = sayi4;
                    fourthplace = sayi2;
                }
                if (sayi1 == sayi2) {
                    thirdplace = sayi2;
                    fourthplace = sayi4;
                }
            } else if (firstplace == sayi3 && sayi4 >= sayi2 && sayi4 >= sayi1) {
                secondplace = sayi4;
                if (sayi4 == sayi1) {
                    thirdplace = sayi1;
                    fourthplace = sayi2;
                }
                if (sayi2 == sayi4) {
                    thirdplace = sayi2;
                    fourthplace = sayi1;
                }
            } else if (firstplace == sayi4 && sayi1 >= sayi2 && sayi1 >= sayi3) {
                secondplace = sayi1;
                if (sayi1 == sayi3) {
                    thirdplace = sayi3;
                    fourthplace = sayi2;
                }
                if (sayi2 == sayi1) {
                    thirdplace = sayi2;
                    fourthplace = sayi3;
                }
            } else if (firstplace == sayi4 && sayi2 >= sayi1 && sayi2 >= sayi3) {
                secondplace = sayi2;
                if (sayi2 == sayi3) {
                    thirdplace = sayi3;
                    fourthplace = sayi1;
                }
                if (sayi2 == sayi1) {
                    thirdplace = sayi1;
                    fourthplace = sayi3;
                }
            } else if (firstplace == sayi4 && sayi3 >= sayi1 && sayi3 >= sayi2) {
                secondplace = sayi3;
                if (sayi2 == sayi3) {
                    thirdplace = sayi2;
                    fourthplace = sayi1;
                }
                if (sayi3 == sayi1) {
                    thirdplace = sayi1;
                    fourthplace = sayi2;
                }
            }

            if (sayi1 <= sayi2 && sayi1 <= sayi3 && sayi1 <= sayi4) {
                fourthplace = sayi1;
                if (sayi1 == sayi2) {
                    thirdplace = sayi2;
                }
                if (sayi1 == sayi3) {
                    thirdplace = sayi3;
                }
                if (sayi1 == sayi4) {
                    thirdplace = sayi4;
                }
            } else if (sayi2 <= sayi1 && sayi2 <= sayi3 && sayi2 <= sayi4) {
                fourthplace = sayi2;
                if (sayi2 == sayi1) {
                    thirdplace = sayi1;
                }
                if (sayi2 == sayi3) {
                    thirdplace = sayi3;
                }
                if (sayi2 == sayi4) {
                    thirdplace = sayi4;
                }
            } else if (sayi3 <= sayi1 && sayi3 <= sayi2 && sayi3 <= sayi4) {
                fourthplace = sayi3;
                if (sayi3 == sayi1) {
                    thirdplace = sayi1;
                }
                if (sayi3 == sayi2) {
                    thirdplace = sayi2;
                }
                if (sayi3 == sayi4) {
                    thirdplace = sayi4;
                }
            } else if (sayi4 <= sayi1 && sayi4 <= sayi2 && sayi4 <= sayi3) {
                fourthplace = sayi4;
                if (sayi4 == sayi1) {
                    thirdplace = sayi1;
                }
                if (sayi4 == sayi2) {
                    thirdplace = sayi2;
                }
                if (sayi4 == sayi3) {
                    thirdplace = sayi3;
                }
            }


            if (sayi1 != firstplace && sayi1 != secondplace && sayi1 != fourthplace) {
                thirdplace = sayi1;
            } else if (sayi2 != firstplace && sayi2 != secondplace && sayi2 != fourthplace) {
                thirdplace = sayi2;
            } else if (sayi3 != firstplace && sayi3 != secondplace && sayi3 != fourthplace) {
                thirdplace = sayi3;
            } else if (sayi4 != firstplace && sayi4 != secondplace && sayi4 != fourthplace) {
                thirdplace = sayi4;
            }

            System.out.println(firstplace + " " + secondplace + " " + thirdplace + " " + fourthplace);


        }
    }

