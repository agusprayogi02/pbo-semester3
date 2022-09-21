package minggu3;

public class Statistik {
  int[] data = { 3, 5, 1, 3, 4, 2, 2, 3, 1, 2, 4 };

  int sum() {
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
      sum += data[i];
    }
    return sum;
  }

  double avarage() {
    return sum() / data.length;
  }

  int max() {
    int m = 0;
    for (int i : data) {
      if (m < i) {
        m = i;
      }
    }
    return m;
  }

  int min() {
    int m = data[0];
    for (int i : data) {
      if (m > i) {
        m = i;
      }
    }
    return m;
  }

  void sort() {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
  }

  double cariNilaiTengah() {
    sort();
    int n = data.length;
    if (n % 2 == 0) {
      return (data[n / 2] + data[n / 2 - 1]) / 2.0;
    } else {
      return data[n / 2];
    }
  }

  public static void main(String[] args) {
    Statistik s = new Statistik();
    System.out.println("Nilai maksimum: " + s.max());
    System.out.println("Nilai minimum: " + s.min());
  }
}
