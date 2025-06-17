import java.util.Arrays;

class BestTravel {
    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int maxDistance = 175;
        int bestSum = findBestSum(distances, 3, maxDistance);
        
        System.out.println("Лучшая сумма расстояний: " + bestSum);
    }
    
    static int findBestSum(int[] distances, int citiesToVisit, int maxDistance) {
        int bestSum = -1;
        
       
        for (int i = 0; i < distances.length; i++) {
            for (int j = i + 1; j < distances.length; j++) {
                for (int k = j + 1; k < distances.length; k++) {
                    int currentSum = distances[i] + distances[j] + distances[k];
                    
                    if (currentSum == maxDistance) {
                        return maxDistance; 
                    }
                    
                    if (currentSum < maxDistance && currentSum > bestSum) {
                        bestSum = currentSum;
                    }
                }
            }
        }
        
        return bestSum;
    }
}