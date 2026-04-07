public class eje1 {
    public static void main(String[] args) {
        // Ejemplo 1
        int[] arr1 = {3, 4, 6, 7, 2};
        int meta1 = 20;
        System.out.println("Ejemplo 1: " + verificar(0, 0, arr1, meta1)); // Debe dar true
    }

    static boolean verificar(int i, int suma, int[] arr, int meta) {
        // 1. Si llegamos al final, vemos si logramos la meta
        if (i == arr.length) {
            return suma == meta;
        }

        // 2. REGLA 1: Si es múltiplo de 3, se suma OBLIGATORIAMENTE
        if (arr[i] % 3 == 0) {
            return verificar(i + 1, suma + arr[i], arr, meta);
        }

        // 3. REGLA 2: Si es par y el siguiente también es par, se ignora OBLIGATORIAMENTE
        if (arr[i] % 2 == 0 && i + 1 < arr.length && arr[i + 1] % 2 == 0) {
            return verificar(i + 1, suma, arr, meta);
        }

        // 4. NORMAL: Probamos los dos caminos (sumándolo o no sumándolo)
        return verificar(i + 1, suma + arr[i], arr, meta) || verificar(i + 1, suma, arr, meta);
    }
}