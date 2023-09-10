
public class MemoriaJVMExemplo {
    public static void main(String[] args) {
        // Obtemos o tamanho máximo da memória heap em bytes
        long maxHeapSize = Runtime.getRuntime().maxMemory();

        System.out.println("Tamanho máximo da memória heap: " + (maxHeapSize / (1024 * 1024)) + " MB");

        // Aloca um grande array de bytes para consumir memória
        int tamanhoArray = 10000000; // 10 milhões de elementos
        byte[] grandeArray = new byte[tamanhoArray];

        System.out.println("Array de bytes alocado. Tamanho do array: " + (grandeArray.length / (1024 * 1024)) + " MB");
    }
}


/* A JVM (Java Virtual Machine) é a máquina virtual que executa programas Java. Ela é responsável por alocar e gerenciar a memória durante a execução de um programa Java. A memória JVM é dividida em várias áreas, incluindo o heap, a pilha de execução (stack), a área de método (method area), entre outras.

 * 
 * Neste exemplo, primeiro obtemos o tamanho máximo da memória heap da JVM usando Runtime.getRuntime().maxMemory(). Em seguida, alocamos um grande array de bytes para consumir memória. Dependendo das configurações da JVM, você pode precisar aumentar o tamanho da memória heap usando a opção -Xmx ao iniciar o programa Java.

 */