import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Lesson {
    public static void main(String[] args) {

        //xndir 211

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-11, 4, 5, -99, 46, 38, -4, 1, 2, 55));

        Iterator<Integer> it = numbers.iterator();

        int sum = 0;
        int count = 0;

        while (it.hasNext()) {
            int current = it.next();
            if (current > 0) {
                sum += current;
                count++;
            }
        }

        System.out.println("211: " + (double) sum / count);

        // xndir 212

        it = numbers.iterator();
        int product = 1;
        count = 0;

        while (it.hasNext()) {
            int current = it.next();
            if (current > 0) {
                product *= current;
                count++;
            }
        }

        System.out.println("212: " + (double) product / count);

        // xndir 213

        it = numbers.iterator();
        product = 1;
        count = 0;

        while (it.hasNext()) {
            int current = it.next();
            if (current < 0) {
                product *= current;
                count++;
            }
        }

        System.out.println("213: " + (double) product / count);

        // xndir 214

        it = numbers.iterator();
        sum = 0;
        count = 0;

        while (it.hasNext()) {
            int current = it.next();
            if (current < 0) {
                sum += current;
                count++;
            }
        }

        System.out.println("214: " + (double) sum / count);

        // xndir 215

        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println("215: " + sum);

        // xndir 216

        product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                product *= numbers.get(i);
            }
        }
        System.out.println("216: " + product);

        // xndir 217

        product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 1) {
                product *= Math.pow(numbers.get(i), 2);
            }
        }
        System.out.println("217: " + product);

        // xndir 218

        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 1) {
                sum += Math.abs(numbers.get(i));
            }
        }
        System.out.println("218: " + sum);


        // xndir 219

        count = 0;
        int k = 3;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println("219: " + count);


        //xndir 220

        count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) {
                count++;
            }
        }
        System.out.println("220: " + count);


        //xndir 221
        int a = 10;
        int b = 70;
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= a && numbers.get(i) <= b) {
                sum += numbers.get(i);
            }
        }
        System.out.println("221: " + sum);


        //xndir 222
        int c = 10;
        int d = 90;
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= c && numbers.get(i) < d) {
                sum += numbers.get(i);
            }
        }
        System.out.println("222: " + sum);


        //xndir 223
        a = 10;
        b = 70;
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > a && numbers.get(i) < b) {
                sum += numbers.get(i);
            }
        }
        System.out.println("223: " + sum);


        //xndir 224
        sum = 0;
        k = 30;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (Math.abs(current) < k) {
                sum += Math.pow(current, 3);
            }
        }
        System.out.println("224: " + sum);

        //xndir 225
        product = 1;
        int t = 20;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (Math.abs(current) < t) {
                product *= current;
            }
        }
        System.out.println("225: " + product);


        //xndir 226
        count = 0;
        k = 20;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (Math.abs(current) < k) {
                count++;
            }
        }
        System.out.println("226: " + count);


        //xndir 227
        count = 0;
        sum = 0;
        k = 3;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                sum += numbers.get(i);
                count++;
            }
        }
        System.out.println("227: " + (double) sum / count);


        //xndir 228
        sum = 0;
        k = 3;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println("228: " + sum);


        //xndir 229
        product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) - i > 0) {
                product *= numbers.get(i);
            }
        }
        System.out.println("229: " + product);


        //xndir 230
        product = 1;
        count = 0;
        it = numbers.iterator();

        while (it.hasNext()) {
            int current = it.next();
            if (Math.abs(current) % k == 0) {
                product *= current;
                count++;
            }
        }
        System.out.println("230: " + (double) product / count);


        //xndir 231
        sum = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 0) {
                sum += Math.pow(current, 2);
            }
        }
        System.out.println("231: " + sum);


        //xndir 232
        count = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 0) {
                count++;
            }
        }
        System.out.println("232: " + count);


        //xndir 233
        sum = 0;
        product = 1;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 0) {
                sum += current;
                product *= current;
            }
        }
        System.out.println("233: " + product + " " + sum);


        //xndir 234
        count = 0;
        sum = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 1) {
                count++;
                sum += current;
            }
        }
        System.out.println("234: " + (double) sum / count);


        //xndir 235
        count = 0;
        product = 1;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 1) {
                count++;
                product *= current;
            }
        }
        System.out.println("235: " + (double) product / count);


        //xndir 236
        count = 0;
        product = 1;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 2 == 1) {
                count++;
                product *= current;
            }
        }
        System.out.println("236: " + count + " " + product);


        //xndir 237
        count = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current == 0) {
                count++;
            }
        }
        System.out.println("237: " + count);


        //xndir 238
        count = 0;
        sum = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 3 == 0) {
                count++;
                sum += current;
            }
        }
        System.out.println("238: " + (double) sum / count);


        //xndir 239
        product = 1;
        count = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 5 == 0) {
                count++;
                product *= current;
            }
        }
        System.out.println("239: " + (double) product / count);


        //xndir 240
        count = 0;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 7 == 0) {
                count++;
            }
        }
        System.out.println("240: " + count);


        //xndir 241
        sum = 0;
        k = 2;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % k == 0) {
                sum += current;
            }
        }
        System.out.println("241: " + sum);

        //xndir 242
        product = 1;
        int m = 4;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % m == 0) {
                product += current;
            }
        }
        System.out.println("242: " + product);


        //xndir 243
        count = 0;
        t = 5;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % t == 0) {
                count++;
            }
        }
        System.out.println("243: " + count);


        //xndir 244
        product = 1;
        it = numbers.iterator();
        while (it.hasNext()) {
            int current = it.next();
            if (current % 5 == 2) {
                product *= current;
            }
        }
        System.out.println("244: " + product);


        //xndir 245
        sum = 0;
        it = numbers.iterator();
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) + i) % 3 == 0) {
                sum += Math.pow(numbers.get(i), 2);
            }
        }
        System.out.println("245: " + sum);


        //xndir 247
        product = 1;
        count = 0;
        it = numbers.iterator();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > i) {
                product += numbers.get(i);
                count++;
            }
        }
        System.out.println("247: " + (double) product / count);


        //xndir 248
        sum = 0;
        k = 5;
        it = numbers.iterator();
        for (int i = 0; i < numbers.size(); i++) {
            if (Math.pow(numbers.get(i) + i, 2) % k == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println("248: " + sum);


        //xndir 249
        count = 0;
        k = 10;
        it = numbers.iterator();
        for (int i = 0; i < numbers.size(); i++) {
            if (Math.abs(numbers.get(i) - i) > k) {
                count++;
            }
        }
        System.out.println("249: " + count);


        //xndir 250
        product = 1;
        it = numbers.iterator();
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) * i) % 3 == 2) {
                product *= numbers.get(i);
            }
        }
        System.out.println("250: " + count);


        //xndir 251
        int max = Collections.max(numbers);
        System.out.println("251: " + max);

        //xndir 252
        int min = Collections.min(numbers);
        System.out.println("252: " + min);

        //xndir 253
        System.out.println("253: " + (min + max));

        //xndir 254
        System.out.println("254: " + (min * max));

        //xndir 255
        System.out.println("255: " + (numbers.indexOf(max) + max));

        //xndir 256
        System.out.println("256: " + (numbers.indexOf(min) + min));

        //xndir 257
        System.out.println("257: " + numbers.indexOf(max));

        //xndir 258
        System.out.println("258: " + numbers.lastIndexOf(max));

        //xndir 259
        System.out.println("259: " + numbers.indexOf(min));

        //xndir 260
        System.out.println("260: " + numbers.lastIndexOf(min));


    }
}
