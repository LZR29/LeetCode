package contest142;

/**
 * @author linzerong
 * @create 2019-06-23 10:39
 */
public class Statistics_from_a_Large_Sample {
    public double[] sampleStats(int[] counts) {
        int min = 257, max = 0;
        double sum = 0;
        double ave = 0;
        double mid = 0;
        int most = 0;
        int count = 0;
        for(int i = 0; i < counts.length; i++){
            if(counts[i] != 0){
                min = Math.min(min, i);
                max = Math.max(max, i);
                sum += counts[i] * i;
                count += counts[i];
                most = Math.max(most, counts[i]);
            }
        }
        ave = 1.0 * sum / count;
        if(count % 2 == 0){
            count = count / 2;
            boolean flag = true;
            for (int i = 0; i < counts.length; i++) {
                if(counts[i] != 0){
                    if(most == counts[i]){
                        most = i;
                    }
                    count -= counts[i];
                    if(count < 0 && flag){
                        mid = i;
                        flag = false;
                    }else if(count == 0 && flag){
                        mid += i;
                        for (int j = i+1; j < counts.length; j++) {
                            if(counts[j] != 0){
                                mid += j;
                                mid /= 2.0;
                                flag = false;
                            }
                        }
                    }
                }
            }
        }else {
            count = count / 2 + 1;
            boolean flag = true;
            for (int i = 0; i < counts.length; i++) {
                if(counts[i] != 0){
                    if(most == counts[i]){
                        most = i;
                    }
                    count -= counts[i];
                    if(count <= 0 && flag){
                        mid = i;
                        flag = false;
                    }
                }
            }
        }
        return new double[]{min, max, ave, mid, most};
    }
}
