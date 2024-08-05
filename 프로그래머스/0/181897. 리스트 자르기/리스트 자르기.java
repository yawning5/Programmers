class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;

        switch (n) {
            case 1:
                a = 0;
                break;
            case 2:
                b = num_list.length - 1;
                break;

            case 4:
                c = slicer[2];
                break;
        }

        int size = (b - a) / c;
        int[] answer = new int[size + 1];

        int index = 0;
        for (int i = a; i < b + 1; i += c) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}