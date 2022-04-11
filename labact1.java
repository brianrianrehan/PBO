public class VolumeBola
{
    public static void main(String[] args)
    {
        double r = 7.5; // Jari-jari bola
        double volume;  // Untuk menyimpan hasil penghitungan volume bola
    
        // [1] Hitung volume bola
        volume = 4.0 / 3 * Math.PI * Math.pow(r, 3);


        // [2] Tampilkan volume bola
        System.out.printf("Volume bola = %.13f", volume);

    }
}

public class PersamaanKuadrat
{
    public static void main(String[] args)
    {
        int a = 2, b = 4, c = -18;
        
        // [1] Deklarasikan dua variabel untuk menyimpan akar persamaan kuadrat
        double x1, x2;
        
        // [2] Hitung dua akar persamaan kuadrat
        x1 = (-b + Math.sqrt(b * b - 4 * c * a)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * c * a)) / (2 * a);

        
        // [3] Tampilkan akar persamaan kuadrat
        System.out.printf("x1 = %.16f", x1);
        System.out.println();
        System.out.printf("x2 = %.14f", x2);


    }
}

public class PopulasiBakteri
{
    public static void main(String[] args)
    {
        int popAwal = 150000;   // Populasi awal
        int t = 10;             // Durasi waktu
        double popAkhir;        // Untuk menyimpan populasi akhir
        
        // [1] Hitung populasi akhir.
        // Populasi akhir harus dalam nilai bulat.
        popAkhir = popAwal * Math.pow(2.718281828, 0.5*t); // e adalah bilangan eksponensial 2.718281828
        int hasil = (int) popAkhir;


        // [2] Cetak populasi awal dan populasi akhir.
        System.out.println("Populasi awal = "+ popAwal);
        System.out.println("Populasi akhir = "+ hasil);


    }
}

public class GayaGravitasi
{
    public static void main(String[] args)
    {
        final double GRAVITASI = 6.674E-11; // Konstanta gravitasi
        double m1 = 40, m2 = 30;            // Massa objek 1 dan objek 2
        double r = 2;                       // Jarak antara objek 1 dan objek 2
        double force;                       // Gaya tarik gravitasi

        // Tuliskan kode Anda di bawah!
        
        double a1 = GRAVITASI * m1 *m2;
        double a2 = r*r;

        double a3 = a1/a2;
        String forcea = Double.toString(a3);
        String forcex = "F = " + forcea;

        System.out.print(forcex);


    }
}
