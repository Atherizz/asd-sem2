class Pangkat {
    int nilai, pangkat;

    Pangkat (int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int pangkatBF (int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    int pangkatBF2NoParam () {
        int result = 1;
        for (int i = 0; i < pangkat; i++) {
            result *= nilai;
        }
        return result;
    }

    int pangkatDC (int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return pangkatDC(a, n/2) * pangkatDC(a, n/2) * a;
            } else {
                return pangkatDC(a, n/2) * pangkatDC(a, n/2);
            }
        }
    }

    int pangkatDC2 (int a, int n) {
        if (n == 1) {
            return a;
        } else {
            return a * pangkatDC(a, n-1);
        }
    }
}
