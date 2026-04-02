package com.sort;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

    public class MonkeySort {
        static AtomicBoolean found = new AtomicBoolean(false);
        static int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        public static void main(String[] args) {
            int threads = Runtime.getRuntime().availableProcessors(); // 使用所有 CPU 核心
            Thread[] workers = new Thread[threads];
            
            for (int t = 0; t < threads; t++) {
                final int threadId = t;
                workers[t] = new Thread(() -> {
                    int[] arr = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                    Random random = new Random(System.currentTimeMillis() + threadId);
                    long count = 0;
                    while (!found.get()) {
                        shuffle(arr, random);
                        count++;
                        if (isSorted(arr)) {
                            found.set(true);
                            System.out.println("线程" + threadId + "找到解，尝试次数：" + count);
                            break;
                        }
                    }
                });
                workers[t].start();
            }
        }
        // 检查数组是否有序
        public static boolean isSorted(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }
        // 随机打乱数组
        public static void shuffle(int[] arr, Random random) {
            for (int i = 0; i < arr.length; i++) {
                int j = random.nextInt(arr.length);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
